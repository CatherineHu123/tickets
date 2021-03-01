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
    public Wrapper getExhibitionByStatus(Integer exhibitionStatus){
        List<ExhibitionVote> exhibitionVotes = testService.getExhibitionByStatus(exhibitionStatus);
        return WrapMapper.ok(exhibitionVotes);
    }

    @GetMapping("/allExhibition")
    @ApiOperation(notes = "查询所有展览", value = "查询所有展览")
    public Wrapper getAllExhibition(){
        List<ExhibitionVote> exhibitionVotes = testService.getAllExhibition();
        return WrapMapper.ok(exhibitionVotes);
    }

    @GetMapping("/exhibitionByPrimaryKey")
    @ApiOperation(notes = "查询指定展览", value = "查询指定展览")
    public Wrapper selectEByPrimaryKey(Integer exhibitionVoteId){
        ExhibitionVote exhibitionVote = testService.selectEByPrimaryKey(exhibitionVoteId);
        return WrapMapper.ok(exhibitionVote);
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
    public Wrapper getAllAssoc(Integer ifDelete){
        List<AssociationInfo> associationInfos = testService.getAllAssoc(ifDelete);
        return WrapMapper.ok(associationInfos);
    }

    @GetMapping("/associationByPrimaryKey")
    @ApiOperation(notes = "查询指定协会", value = "查询指定协会")
    public Wrapper selectAssByPrimaryKey(Integer assocId){
        AssociationInfo associationInfo = testService.selectAssByPrimaryKey(assocId);
        return WrapMapper.ok(associationInfo);
    }

    @GetMapping("/associationByActivity")
    @ApiOperation(notes = "根据活动查询协会", value = "根据活动查询协会")
    public Wrapper getAssocByActivity(Integer activityId){
        List<AssociationInfo> associationInfos = testService.getAssocByActivity(activityId);
        return WrapMapper.ok(associationInfos);
    }

    /**用户*/
    @PostMapping("/userLogin")
    @ApiOperation(notes = "用户登录", value = "用户登录")
    public Wrapper usrLogin(String userName, String passWord){
        String token= testService.userLogin(userName, passWord);
        if (StringUtils.isBlank(token)){
            return WrapMapper.ok(new ResponseEntity<>(HttpStatus.UNAUTHORIZED));
        }
        UserInfo userInfo = testService.selectByUserName(userName);
        userInfo.setWxToken(token);
        testService.updateUserInfo(userInfo);
        return WrapMapper.ok(token);
    }

    @PostMapping("/userUpdate")
    @ApiOperation(notes = "修改用户信息", value = "修改用户信息")
    public R userInfoUpdate(UserInfo userInfo){
        testService.updateUserInfo(userInfo);
        return R.suc();
    }

    @PostMapping("/userRegister")
    @ApiOperation(notes = "用户注册", value = "用户注册")
    public R userRegister(UserInfo userInfo){
        testService.userRegister(userInfo);
        return R.suc();
    }

    @PostMapping("/userDelete")
    @ApiOperation(notes = "删除用户", value = "删除用户")
    public R userDelete(Integer userId){
       testService.userDelete(userId);
       return R.suc();
    }

    @GetMapping("/userInfoById")
    @ApiOperation(notes = "通过id获取用户信息", value = "通过id获取用户信息")
    public Wrapper selectUByPrimaryKey(Integer userId){
        UserInfo userInfo = testService.selectUByPrimaryKey(userId);
        return WrapMapper.ok(userInfo);
    }

    @GetMapping("/userInfoByName")
    @ApiOperation(notes = "通过名字获取用户信息", value = "通过名字获取用户信息")
    public Wrapper selectByUserName(String userName){
        UserInfo userInfo = testService.selectByUserName(userName);
        return WrapMapper.ok(userInfo);
    }

    @GetMapping("/userInfoByPhone")
    @ApiOperation(notes = "通过手机号获取用户信息", value = "通过手机号获取用户信息")
    public Wrapper selectByUserPhone(String userPhone){
        UserInfo userInfo = testService.selectByUserPhone(userPhone);
        return WrapMapper.ok(userInfo);
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
    public Wrapper selectAInAssocM(Integer userId){
        List<AssociationInfo> associationInfos = testService.selectAInAssocM(userId);
        return WrapMapper.ok(associationInfos);
    }

    @GetMapping("/userInAssociation")
    @ApiOperation(notes = "协会中的成员", value = "协会中的成员")
    public Wrapper selectUInAssocM(Integer assocId){
        List<UserInfo> userInfos = testService.selectUInAssocM(assocId);
        return WrapMapper.ok(userInfos);
    }

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

    /**用户展览表*/
    @GetMapping("/selectByUEKey")
    @ApiOperation(notes = "是否参加展览", value = "是否参加展览")
    public Wrapper selectByUEKey(Integer userId, Integer activityId){
        UserExhibition userExhibition = testService.selectByUEKey(userId, activityId);
        return WrapMapper.ok(userExhibition);
    }

    @GetMapping("/selectEByUserKey")
    @ApiOperation(notes = "用户参加的全部展览", value = "用户参加的全部展览")
    public Wrapper selectEByUserKey(Integer userId){
        List<ExhibitionVote> exhibitionVotes = testService.selectEByUserKey(userId);
        return WrapMapper.ok(exhibitionVotes);
    }

    /**管理员**/
    @PostMapping("/adminLogin")
    @ApiOperation(notes = "管理员登录", value = "管理员登录")
    public Wrapper adminLogin(String adminName, String passWord){
        String token= testService.adminLogin(adminName, passWord);
        if (StringUtils.isBlank(token)){
            return WrapMapper.ok(new ResponseEntity<>(HttpStatus.UNAUTHORIZED));
        }
        AdminInfo adminInfo = testService.selectByAdminName(adminName);
        adminInfo.setSessionId(token);
        testService.updateAdminInfo(adminInfo);
        return WrapMapper.ok(token);
    }

    @PostMapping("/adminRegister")
    @ApiOperation(notes = "管理员注册", value = "管理员注册")
    public R adminRegister(AdminInfo adminInfo){
        testService.adminRegister(adminInfo);
        return R.suc();
    }

    @PostMapping("/adminUpdate")
    @ApiOperation(notes = "修改管理员信息", value = "修改管理员信息")
    public R updateAdminInfo(AdminInfo adminInfo){
        testService.updateAdminInfo(adminInfo);
        return R.suc();
    }

    @GetMapping("/adminInfoById")
    @ApiOperation(notes = "通过id获取管理员信息", value = "通过id获取管理员信息")
    public Wrapper selectAByPrimaryKey(Integer adminId){
        AdminInfo adminInfo = testService.selectAByPrimaryKey(adminId);
        return WrapMapper.ok(adminInfo);
    }

    @GetMapping("/adminInfoByName")
    @ApiOperation(notes = "通过名字获取管理员信息", value = "通过名字获取管理员信息")
    public Wrapper selectByAdminName(String adminName){
        AdminInfo adminInfo = testService.selectByAdminName(adminName);
        return WrapMapper.ok(adminInfo);
    }

    @GetMapping("/adminInfoByPhone")
    @ApiOperation(notes = "通过手机号获取管理员信息", value = "通过手机号获取管理员信息")
    public Wrapper selectByAdminPhone(String adminPhone){
        AdminInfo adminInfo = testService.selectByAdminPhone(adminPhone);
        return WrapMapper.ok(adminInfo);
    }

    @PostMapping("/adminDelete")
    @ApiOperation(notes = "删除管理员", value = "删除管理员")
    public R adminDelete(Integer adminId){
        testService.adminDelete(adminId);
        return R.suc();
    }
}

