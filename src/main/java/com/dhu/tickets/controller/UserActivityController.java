package com.dhu.tickets.controller;

import com.dhu.tickets.common.R;
import com.dhu.tickets.common.WrapMapper;
import com.dhu.tickets.common.Wrapper;
import com.dhu.tickets.entity.ActivityInfo;
import com.dhu.tickets.entity.UserActivity;
import com.dhu.tickets.entity.UserInfo;
import com.dhu.tickets.service.TestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/userActivity")
public class UserActivityController {
    @Autowired
    private TestService testService;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**用户活动表*/
    @GetMapping("/selectByUAKey")
    @ApiOperation(notes = "是否参加活动", value = "是否参加活动")
    public Wrapper selectByUAKey(Integer userId, Integer activityId){
        UserActivity userActivity = testService.selectByUAKey(userId, activityId);
        return WrapMapper.ok(userActivity);
    }

    @GetMapping("/selectAByUserKey")
    @ApiOperation(notes = "用户参加的全部活动", value = "用户参加的全部活动")
    public Wrapper selectAByUserKey(Integer userId){
        List<ActivityInfo> activityInfos = testService.selectAByUserKey(userId);
        return WrapMapper.ok(activityInfos);
    }

    @GetMapping("/selectUByActivityKey")
    @ApiOperation(notes = "活动所拥有的用户", value = "活动所拥有的用户")
    public Wrapper selectUByActivityKey(Integer activityId){
        List<UserInfo> userInfos = testService.selectUByActivityKey(activityId);
        return WrapMapper.ok(userInfos);
    }

    @GetMapping("/deleteByUserActivity/{userId}/{activityId}")
    @ApiOperation(notes = "用户取消参加活动", value = "用户取消参加活动")
    public R deleteByUserActivity(@PathVariable(value = "userId") Integer userId, @PathVariable(value = "activityId") Integer activityId){
        testService.deleteByUserActivity(userId, activityId);
        return R.suc();
    }

    @PostMapping("/addUserActivity")
    @ApiOperation(notes = "用户参加活动", value = "用户参加活动")
    public R addUserActivity(@RequestBody UserActivity userActivity){
        testService.addUserActivity(userActivity);
        return R.suc();
    }

    @GetMapping("/signForActivity/{uid}/{aid}")
    @ApiOperation(value = "报名")
    public Wrapper signForActivity(@PathVariable(value = "uid") Integer uid, @PathVariable(value = "aid") Integer aid){
        UserActivity userActivity = new UserActivity();
        userActivity.setActivityId(aid);
        userActivity.setUserId(uid);
        int left = testService.getMaxInActivity(aid) - testService.getNowInActivity(aid);
        // 库存不足，返回
        if (left <= 0) {
            return WrapMapper.error("人数已满");
        }
        // 是否已经报名了
        UserActivity tickets = testService.selectByUAKey(uid, aid);
        if (null != tickets){
            return WrapMapper.error("已经报名了");
        }
        // 传给消息队列
        rabbitTemplate.convertAndSend("goupiao",userActivity);
        return WrapMapper.ok("报名成功");
    }
}
