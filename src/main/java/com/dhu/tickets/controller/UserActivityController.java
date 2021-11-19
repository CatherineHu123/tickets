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

    /**用户活动表*/
    @GetMapping("/selectByUAKey/{userId}/{activityId}")
    @ApiOperation(notes = "是否参加活动", value = "是否参加活动")
    public Wrapper selectByUAKey(@PathVariable Integer userId, @PathVariable Integer activityId){
        UserActivity userActivity = testService.selectByUAKey(userId, activityId);
        return WrapMapper.ok(userActivity);
    }

    @GetMapping("/selectAByUserKey/{userId}")
    @ApiOperation(notes = "用户参加的全部活动", value = "用户参加的全部活动")
    public Wrapper selectAByUserKey(@PathVariable Integer userId){
        List<ActivityInfo> activityInfos = testService.selectAByUserKey(userId);
        return WrapMapper.ok(activityInfos);
    }

    @GetMapping("/selectUByActivityKey/{activityId}")
    @ApiOperation(notes = "活动所拥有的用户", value = "活动所拥有的用户")
    public Wrapper selectUByActivityKey(@PathVariable Integer activityId){
        List<UserInfo> userInfos = testService.selectUByActivityKey(activityId);
        return WrapMapper.ok(userInfos);
    }

    @GetMapping("/deleteByUserActivity/{userId}/{activityId}")
    @ApiOperation(notes = "用户取消参加活动", value = "用户取消参加活动")
    public R deleteByUserActivity(@PathVariable(value = "userId") Integer userId, @PathVariable(value = "activityId") Integer activityId){
        testService.deleteByUserActivity(userId, activityId);
        if (testService.decNowInAct(activityId) == 1){
            return R.suc();
        }
        return R.error();
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
//        Thread thread1 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                testService.signForActivity(4,27);
//            }
//        });
//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                testService.signForActivity(7,27);
//            }
//        });
//        thread1.start();
//        thread2.start();
        return testService.signForActivity(uid, aid);
    }
}
