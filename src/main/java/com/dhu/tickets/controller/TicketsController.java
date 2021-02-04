package com.dhu.tickets.controller;

import com.dhu.tickets.common.R;
import com.dhu.tickets.entity.*;
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
    @PostMapping("/addActivity")
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
    @ApiOperation(notes = "修改活动信息", value = "修改活动信息")
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
    @PostMapping("/addExhibition")
    @ApiOperation(notes = "创建展览（投票）", value = "创建展览（投票）")
    public R addExhibition(ExhibitionVote exhibitionVote){
        testService.addExhibition(exhibitionVote);
        return R.suc();
    }

    @PostMapping("/deleteExhibition")
    @ApiOperation(notes = "删除展览（投票）", value = "删除展览（投票）")
    public R deleteExhibition(Integer exhibitionVoteId){
        testService.deleteExhibition(exhibitionVoteId);
        return R.suc();
    }

    @PostMapping("/updateExhibition")
    @ApiOperation(notes = "修改展览（投票）信息", value = "修改展览（投票）信息")
    public R updateExhibition(ExhibitionVote exhibitionVote){
        testService.updateExhibition(exhibitionVote);
        return R.suc();
    }

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
    @PostMapping("/addAssociation")
    @ApiOperation(notes = "创建协会", value = "创建协会")
    public R addAssociation(AssociationInfo associationInfo){
        testService.addAssociation(associationInfo);
        return R.suc();
    }

    @PostMapping("/deleteAssociation")
    @ApiOperation(notes = "删除协会", value = "删除协会")
    public R deleteAssociation(Integer assocId){
        testService.deleteAssociation(assocId);
        return R.suc();
    }

    @PostMapping("/updateAssociation")
    @ApiOperation(notes = "修改协会信息", value = "修改协会信息")
    public R updateAssociation(AssociationInfo associationInfo){
        testService.updateAssociation(associationInfo);
        return R.suc();
    }

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
    @GetMapping("/userInfoById")
    @ApiOperation(notes = "通过id获取用户信息", value = "通过id获取用户信息")
    public UserInfo selectUByPrimaryKey(Integer userId){
        UserInfo userInfo = testService.selectUByPrimaryKey(userId);
        return userInfo;
    }

    @GetMapping("/userInfoByName")
    @ApiOperation(notes = "通过名字获取用户信息", value = "通过名字获取用户信息")
    public UserInfo selectByUserName(String userName){
        UserInfo userInfo = testService.selectByUserName(userName);
        return userInfo;
    }

    @GetMapping("/userInfoByPhone")
    @ApiOperation(notes = "通过手机号获取用户信息", value = "通过手机号获取用户信息")
    public UserInfo selectByUserPhone(String userPhone){
        UserInfo userInfo = testService.selectByUserPhone(userPhone);
        return userInfo;
    }

    /**协会成员表*/
    @PostMapping("/addAssocMember")
    @ApiOperation(notes = "加入协会", value = "加入协会")
    public void addAssociationMember(AssociationMember associationMember){
        testService.addAssociationMember(associationMember);
    }

    @PostMapping("/deleteAssocMember")
    @ApiOperation(notes = "删除成员", value = "删除成员")
    public void deleteAssociationMember(Integer memberId){
        testService.deleteAssociationMember(memberId);
    }

    @PostMapping("/updateAssocMember")
    @ApiOperation(notes = "修改头衔", value = "修改头衔")
    public void updateAssociationMember(AssociationMember associationMember){
        testService.updateAssociationMember(associationMember);
    }

    @GetMapping("/associationByUser")
    @ApiOperation(notes = "用户加入的协会", value = "用户加入的协会")
    public List<AssociationInfo> selectAInAssocM(Integer userId){
        List<AssociationInfo> associationInfos = testService.selectAInAssocM(userId);
        return associationInfos;
    }

    @GetMapping("/userInAssociation")
    @ApiOperation(notes = "协会中的成员", value = "协会中的成员")
    public List<UserInfo> selectUInAssocM(Integer assocId){
        List<UserInfo> userInfos = testService.selectUInAssocM(assocId);
        return userInfos;
    }
}

