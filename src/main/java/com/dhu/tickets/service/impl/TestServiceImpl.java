package com.dhu.tickets.service.impl;

import com.dhu.tickets.entity.ActivityInfo;
import com.dhu.tickets.entity.AssociationInfo;
import com.dhu.tickets.entity.ExhibitionVote;
import com.dhu.tickets.entity.UserInfo;
import com.dhu.tickets.mapper.ActivityInfoMapper;
import com.dhu.tickets.mapper.AssociationInfoMapper;
import com.dhu.tickets.mapper.ExhibitionVoteMapper;
import com.dhu.tickets.mapper.UserInfoMapper;
import com.dhu.tickets.service.TestService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TestServiceImpl implements TestService {

    @Autowired
    ActivityInfoMapper activityInfoMapper;

    @Autowired
    ExhibitionVoteMapper exhibitionVoteMapper;

    @Autowired
    AssociationInfoMapper associationInfoMapper;

    @Autowired
    UserInfoMapper userInfoMapper;

    /**活动*/
    @Override
    public void addActivityInfo(ActivityInfo activityInfo){
        activityInfoMapper.insert(activityInfo);
    }

    @Override
    public void deleteActivity(Integer activityId){
        activityInfoMapper.deleteByPrimaryKey(activityId);
    }

    @Override
    public void updateActivity(ActivityInfo activityInfo){
        activityInfoMapper.updateByPrimaryKey(activityInfo);
    }

    @Override
    public List<ActivityInfo>  getActivityByStatus(Integer activitystatus){
        List<ActivityInfo> activityInfoList = activityInfoMapper.getActivityByStatus(activitystatus);
        return activityInfoList;
    }

    @Override
    public ActivityInfo selectByPrimaryKey(Integer activityId){
        ActivityInfo activityInfo = activityInfoMapper.selectByPrimaryKey(activityId);
        return activityInfo;
    }

    @Override
    public List<ActivityInfo> getActivityByAss(Integer assocId){
        List<ActivityInfo> activityInfoList = activityInfoMapper.getActivityByAss(assocId);
        return activityInfoList;
    }

    /**展览*/
    @Override
    public List<ExhibitionVote> getExhibitionByStatus(Integer exhibitionStatus){
        List<ExhibitionVote> exhibitionVotes = exhibitionVoteMapper.getExhibitionByStatus(exhibitionStatus);
        return exhibitionVotes;
    }

    @Override
    public ExhibitionVote selectEByPrimaryKey(Integer exhibitionVoteId){
        ExhibitionVote exhibitionVote = exhibitionVoteMapper.selectByPrimaryKey(exhibitionVoteId);
        return exhibitionVote;
    }

    /**协会*/
    @Override
    public List<AssociationInfo> getAllAssoc(Integer ifDelete){
        List<AssociationInfo> associationInfos = associationInfoMapper.getAllAssoc(ifDelete);
        return associationInfos;
    }

    @Override
    public AssociationInfo selectAssByPrimaryKey(Integer assocId){
        AssociationInfo associationInfo = associationInfoMapper.selectByPrimaryKey(assocId);
        return associationInfo;
    }

    @Override
    public List<AssociationInfo> getAssocByActivity(Integer activityId){
        List<AssociationInfo> associationInfos = associationInfoMapper.getAssocByActivity(activityId);
        return associationInfos;
    }

    /**用户*/
    public UserInfo selectUByPrimaryKey(Integer userId){
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userId);
        return userInfo;
    }
}
