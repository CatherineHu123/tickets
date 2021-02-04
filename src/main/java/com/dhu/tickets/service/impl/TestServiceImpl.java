package com.dhu.tickets.service.impl;

import com.dhu.tickets.entity.*;
import com.dhu.tickets.mapper.*;
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

    @Autowired
    AssociationMemberMapper associationMemberMapper;

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
    public void addExhibition(ExhibitionVote exhibitionVote){
        exhibitionVoteMapper.insert(exhibitionVote);
    }

    @Override
    public void deleteExhibition(Integer exhibitionVoteId){
        exhibitionVoteMapper.deleteByPrimaryKey(exhibitionVoteId);
    }

    @Override
    public void updateExhibition(ExhibitionVote exhibitionVote){
        exhibitionVoteMapper.updateByPrimaryKey(exhibitionVote);
    }

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
    public void addAssociation(AssociationInfo associationInfo){
        associationInfoMapper.insert(associationInfo);
    }

    @Override
    public void deleteAssociation(Integer assocId){
        associationInfoMapper.deleteByPrimaryKey(assocId);
    }

    @Override
    public void updateAssociation(AssociationInfo associationInfo){
        associationInfoMapper.updateByPrimaryKey(associationInfo);
    }

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
    @Override
    public UserInfo selectUByPrimaryKey(Integer userId){
        UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userId);
        return userInfo;
    }

    @Override
    public UserInfo selectByUserName(String userName){
        UserInfo userInfo = userInfoMapper.selectByUserName(userName);
        return userInfo;
    }

    @Override
    public UserInfo selectByUserPhone(String userPhone){
        UserInfo userInfo = userInfoMapper.selectByUserPhone(userPhone);
        return userInfo;
    }

    /**协会成员表*/
    @Override
    public void addAssociationMember(AssociationMember associationMember){
        associationMemberMapper.insert(associationMember);
    }

    @Override
    public void deleteAssociationMember(Integer memberId){
        associationMemberMapper.deleteByPrimaryKey(memberId);
    }

    @Override
    public void updateAssociationMember(AssociationMember associationMember){
        associationMemberMapper.updateByPrimaryKey(associationMember);
    }

    @Override
    public List<AssociationInfo> selectAInAssocM(Integer userId){
        List<AssociationMember> associationMembers = associationMemberMapper.selectByUserKey(userId);
        List<AssociationInfo> associationInfos = null;
        for(AssociationMember associationMember : associationMembers){
            AssociationInfo associationInfo = associationInfoMapper.selectByPrimaryKey(associationMember.getAssocId());
            associationInfos.add(associationInfo);
        }
        return associationInfos;
    }

    @Override
    public List<UserInfo> selectUInAssocM(Integer assocId){
        List<AssociationMember> associationMembers = associationMemberMapper.selectByAssocKey(assocId);
        List<UserInfo> userInfos = null;
        for(AssociationMember associationMember : associationMembers){
            UserInfo userInfo = userInfoMapper.selectByPrimaryKey(associationMember.getUserId());
            userInfos.add(userInfo);
        }
        return userInfos;
    }
}
