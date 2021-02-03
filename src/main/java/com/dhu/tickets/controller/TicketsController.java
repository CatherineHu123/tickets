package com.dhu.tickets.controller;

import com.dhu.tickets.common.R;
import com.dhu.tickets.entity.ActivityInfo;
import com.dhu.tickets.entity.AssociationInfo;
import com.dhu.tickets.entity.ExhibitionVote;
import com.dhu.tickets.entity.UserInfo;
import com.dhu.tickets.service.TestService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/test")
@Api(value = "TicketsController")
public class TicketsController {

    @Autowired
    TestService testService;

    /**活动*/
    @PostMapping("/addActivityInfo")
    @ApiOperation(notes = "创建活动", value = "创建活动")
    public R addActivityInfo(ActivityInfo activityInfo){
        testService.addActivityInfo(activityInfo);
        return R.suc();
    }

    @PostMapping("/deleteActivity")
    @ApiOperation(notes = "删除活动", value = "删除活动")
    public R deleteActivity(Integer activityId){
        testService.deleteActivity(activityId);
        return R.suc();
    }

    @PostMapping("/updateActivity")
    @ApiOperation(notes = "修改活动", value = "修改活动")
    public R updateActivity(ActivityInfo activityInfo){
        testService.updateActivity(activityInfo);
        return R.suc();
    }

    @GetMapping("/activityByStatus")
    @ApiOperation(notes = "查询指定状态活动列表", value = "查询指定状态活动列表")
    public List<ActivityInfo> getActivityByStatus(Integer activitystatus) {
        List<ActivityInfo> activityInfoList = testService.getActivityByStatus(activitystatus);
        return activityInfoList;
    }

    @GetMapping("/activityByPrimaryKey")
    @ApiOperation(notes = "查询特定活动", value = "查询特定活动")
    public ActivityInfo selectByPrimaryKey(Integer activityId){
        ActivityInfo activityInfo = testService.selectByPrimaryKey(activityId);
        return activityInfo;
    }

    @GetMapping("/activityInAssoc")
    @ApiOperation(notes = "协会中的活动", value = "协会中的活动")
    public List<ActivityInfo> getActivityByAss(Integer assocId){
        List<ActivityInfo> activityInfoList = testService.getActivityByAss(assocId);
        return activityInfoList;
    }

    /**展览*/
    @GetMapping("/exhibitionByStatus")
    @ApiOperation(notes = "查询指定状态展览列表", value = "查询指定状态展览列表")
    public List<ExhibitionVote> getExhibitionByStatus(Integer exhibitionStatus){
        List<ExhibitionVote> exhibitionVotes = testService.getExhibitionByStatus(exhibitionStatus);
        return exhibitionVotes;
    }

    @GetMapping("/exhibitionByPrimaryKey")
    @ApiOperation(notes = "查询指定展览", value = "查询指定展览")
    public ExhibitionVote selectEByPrimaryKey(Integer exhibitionVoteId){
        ExhibitionVote exhibitionVote = testService.selectEByPrimaryKey(exhibitionVoteId);
        return exhibitionVote;
    }

    /**协会*/
    @GetMapping("/association")
    @ApiOperation(notes = "协会列表", value = "协会列表")
    public List<AssociationInfo> getAllAssoc(Integer ifDelete){
        List<AssociationInfo> associationInfos = testService.getAllAssoc(ifDelete);
        return associationInfos;
    }

    @GetMapping("/associationByPrimaryKey")
    @ApiOperation(notes = "查询指定协会", value = "查询指定协会")
    public AssociationInfo selectAssByPrimaryKey(Integer assocId){
        AssociationInfo associationInfo = testService.selectAssByPrimaryKey(assocId);
        return associationInfo;
    }

    @GetMapping("/associationByActivity")
    @ApiOperation(notes = "根据活动查询协会", value = "根据活动查询协会")
    public List<AssociationInfo> getAssocByActivity(Integer activityId){
        List<AssociationInfo> associationInfos = testService.getAssocByActivity(activityId);
        return associationInfos;
    }

    /**用户*/
    public UserInfo selectUByPrimaryKey(Integer userId){
        UserInfo userInfo = testService.selectUByPrimaryKey(userId);
        return userInfo;
    }
}

