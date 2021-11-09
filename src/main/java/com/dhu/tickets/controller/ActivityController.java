package com.dhu.tickets.controller;

import org.apache.commons.lang.StringUtils ;
import com.dhu.tickets.common.R;
import com.dhu.tickets.common.WrapMapper;
import com.dhu.tickets.common.Wrapper;
import com.dhu.tickets.entity.*;
import com.dhu.tickets.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/activity")
@Api(value = "ActivityController")
public class ActivityController {

    @Autowired
    TestService testService;

    /**活动*/
    @PostMapping("/addActivity")
    @ApiOperation(notes = "创建活动", value = "创建活动")
    public R addActivityInfo(@RequestBody ActivityInfo activityInfo){
        testService.addActivityInfo(activityInfo);
        return R.suc();
    }

    @PostMapping("/deleteActivity")
    @ApiOperation(notes = "删除活动", value = "删除活动")
    public R deleteActivity(@RequestBody Integer activityId){
        testService.deleteActivity(activityId);
        return R.suc();
    }

    @PostMapping("/updateActivity")
    @ApiOperation(notes = "修改活动信息", value = "修改活动信息")
    public R updateActivity(@RequestBody ActivityInfo activityInfo){
        testService.updateActivity(activityInfo);
        return R.suc();
    }

    @GetMapping("/activityByStatus")
    @ApiOperation(notes = "查询指定状态活动列表", value = "查询指定状态活动列表")
    public Wrapper getActivityByStatus(Integer activitystatus) {
        List<ActivityInfo> activityInfoList = testService.getActivityByStatus(activitystatus);
        return  WrapMapper.ok(activityInfoList);
    }

    @GetMapping("/allActivity")
    @ApiOperation(notes = "查询所有活动", value = "查询所有活动")
    public Wrapper getAllActivity() {
        List<ActivityInfo> activityInfoList = testService.getAllActivity();
        return  WrapMapper.ok(activityInfoList);
    }

    @GetMapping("/activityByPrimaryKey")
    @ApiOperation(notes = "查询特定活动", value = "查询特定活动")
    public Wrapper selectByPrimaryKey(Integer activityId){
        ActivityInfo activityInfo = testService.selectByPrimaryKey(activityId);
        return WrapMapper.ok(activityInfo);
    }

    @GetMapping("/activityInAssoc")
    @ApiOperation(notes = "协会中的活动", value = "协会中的活动")
    public Wrapper getActivityByAss(Integer assocId){
        List<ActivityInfo> activityInfoList = testService.getActivityByAss(assocId);
        return WrapMapper.ok(activityInfoList);
    }

    @GetMapping("/activityByStaVote")
    @ApiOperation(notes = "根据状态和是否抢票查询活动列表", value = "根据状态和是否抢票查询活动列表")
    public Wrapper getActivityByStaVote(Integer activityStatus, Integer ifVote){
        List<ActivityInfo> activityInfoList = testService.getActivityByStaVote(activityStatus, ifVote);
        return WrapMapper.ok(activityInfoList);
    }

}

