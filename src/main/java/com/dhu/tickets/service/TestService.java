package com.dhu.tickets.service;

import com.dhu.tickets.common.TokenUtil;
import com.dhu.tickets.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestService {

    /**活动*/
    void addActivityInfo(ActivityInfo activityInfo);

    void deleteActivity(Integer activityId);

    void updateActivity(ActivityInfo activityInfo);

    List<ActivityInfo> getActivityByStatus(Integer activitystatus);

    List<ActivityInfo> getAllActivity();

    ActivityInfo selectByPrimaryKey(Integer activityId);

    List<ActivityInfo> getActivityByAss(Integer assocId);

    List<ActivityInfo> getActivityByStaVote(Integer activityStatus, Integer ifVote);

    /**展览*/
    void addExhibition(ExhibitionVote exhibitionVote);

    void deleteExhibition(Integer exhibitionVoteId);

    void updateExhibition(ExhibitionVote exhibitionVote);

    List<ExhibitionVote> getExhibitionByStatus(Integer exhibitionStatus);

    List<ExhibitionVote> getAllExhibition();

    ExhibitionVote selectEByPrimaryKey(Integer exhibitionVoteId);

    /**协会*/
    void addAssociation(AssociationInfo associationInfo);

    void deleteAssociation(Integer assocId);

    void updateAssociation(AssociationInfo associationInfo);

    List<AssociationInfo> getAllAssoc(Integer ifDelete);

    AssociationInfo selectAssByPrimaryKey(Integer assocId);

    AssociationInfo getAssocByActivity(Integer activityId);

    /**用户*/
    String userLogin(String name,String password);

    void userRegister(UserInfo userInfo);

    UserInfo selectUByPrimaryKey(Integer userId);

    UserInfo selectByUserName(String userName);

    UserInfo selectByUserPhone(String userPhone);

    void updateUserInfo(UserInfo userInfo);

    void userDelete(Integer userId);

    List<UserInfo> getAllUser();

    /**协会成员表*/
    void addAssociationMember(AssociationMember associationMember);

    void deleteAssociationMember(Integer memberId);

    void updateAssociationMember(AssociationMember associationMember);

    List<AssociationInfo> selectAInAssocM(Integer userId);

    List<UserInfo> selectUInAssocM(Integer assocId);

    /**用户活动表*/
    UserActivity selectByUAKey(Integer userId, Integer activityId);

    List<ActivityInfo> selectAByUserKey(Integer userId);

    List<UserInfo> selectUByActivityKey(Integer activityId);

    void deleteByUserActivity(Integer userId, Integer activityId);

    void addUserActivity(UserActivity userActivity);

    /**用户展览表*/
    UserExhibition selectByUEKey(Integer userId, Integer activityId);

    List<ExhibitionVote> selectEByUserKey(Integer userId);

    void addUserExhibition(UserExhibition userExhibition);

    void deleteUserExhibition(Integer userId, Integer exhibitionId);

    /**管理员表**/
    String adminLogin(String name,String passWord);

    void adminRegister(AdminInfo adminInfo);

    void updateAdminInfo(AdminInfo adminInfo);

    void adminDelete(Integer adminId);

    AdminInfo selectAByPrimaryKey(Integer adminId);

    AdminInfo selectByAdminName(String adminName);

    AdminInfo selectByAdminPhone(String adminPhone);
}
