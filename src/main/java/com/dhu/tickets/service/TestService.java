package com.dhu.tickets.service;

import com.dhu.tickets.entity.ActivityInfo;
import com.dhu.tickets.entity.AssociationInfo;
import com.dhu.tickets.entity.ExhibitionVote;
import com.dhu.tickets.entity.UserInfo;
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
    List<ExhibitionVote> getExhibitionByStatus(Integer exhibitionStatus);

    ExhibitionVote selectEByPrimaryKey(Integer exhibitionVoteId);

    /**协会*/
    List<AssociationInfo> getAllAssoc(Integer ifDelete);

    AssociationInfo selectAssByPrimaryKey(Integer assocId);

    List<AssociationInfo> getAssocByActivity(Integer activityId);

    /**用户*/
    UserInfo selectUByPrimaryKey(Integer userId);
}
