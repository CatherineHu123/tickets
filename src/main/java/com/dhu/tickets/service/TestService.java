package com.dhu.tickets.service;

import com.dhu.tickets.entity.*;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TestService {

    /**活动*/
    void addActivityInfo(ActivityInfo activityInfo);

    void deleteActivity(Integer activityId);

    void updateActivity(ActivityInfo activityInfo);

    List<ActivityInfo> getActivityByStatus(Integer activitystatus);

    ActivityInfo selectByPrimaryKey(Integer activityId);

    List<ActivityInfo> getActivityByAss(Integer assocId);

    /**展览*/
    void addExhibition(ExhibitionVote exhibitionVote);

    void deleteExhibition(Integer exhibitionVoteId);

    void updateExhibition(ExhibitionVote exhibitionVote);

    List<ExhibitionVote> getExhibitionByStatus(Integer exhibitionStatus);

    ExhibitionVote selectEByPrimaryKey(Integer exhibitionVoteId);

    /**协会*/
    void addAssociation(AssociationInfo associationInfo);

    void deleteAssociation(Integer assocId);

    void updateAssociation(AssociationInfo associationInfo);

    List<AssociationInfo> getAllAssoc(Integer ifDelete);

    AssociationInfo selectAssByPrimaryKey(Integer assocId);

    List<AssociationInfo> getAssocByActivity(Integer activityId);

    /**用户*/
    UserInfo selectUByPrimaryKey(Integer userId);

    UserInfo selectByUserName(String userName);

    UserInfo selectByUserPhone(String userPhone);

    /**协会成员表*/
    void addAssociationMember(AssociationMember associationMember);

    void deleteAssociationMember(Integer memberId);

    void updateAssociationMember(AssociationMember associationMember);

    List<AssociationInfo> selectAInAssocM(Integer userId);

    List<UserInfo> selectUInAssocM(Integer assocId);
}
