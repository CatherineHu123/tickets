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

    @GetMapping("/deleteByUserActivity")
    @ApiOperation(notes = "用户取消参加活动", value = "用户取消参加活动")
    public R deleteByUserActivity(Integer userId, Integer activityId){
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

    @GetMapping("/signForActivity")
    @ApiOperation(value = "报名")
    public Wrapper signForActivity(Integer uid, Integer aid){
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
        System.out.println(uid+" "+aid);
        return testService.signForActivity(uid, aid);
    }
}
