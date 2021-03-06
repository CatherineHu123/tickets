package com.dhu.tickets.service.impl;

import com.dhu.tickets.common.TokenUtil;
import com.dhu.tickets.entity.*;
import com.dhu.tickets.mapper.*;
import com.dhu.tickets.service.TestService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
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

    @Autowired
    UserActivityMapper userActivityMapper;

    @Autowired
    UserExhibitionMapper userExhibitionMapper;

    @Autowired
    AdminInfoMapper adminInfoMapper;

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
        ActivityInfo activity = activityInfoMapper.selectByPrimaryKey(activityInfo.getActivityId());
        if(activityInfo.getActivityName() == null){
            activityInfo.setActivityName(activity.getActivityName());
        }
        if(activityInfo.getActivityLocation() == null){
            activityInfo.setActivityLocation(activity.getActivityLocation());
        }
        if(activityInfo.getActivityIntroduction() == null){
            activityInfo.setActivityIntroduction(activity.getActivityIntroduction());
        }
        if(activityInfo.getMaxNumbers() == null){
            activityInfo.setMaxNumbers(activity.getMaxNumbers());
        }
        if(activityInfo.getActivityImg() == null){
            activityInfo.setActivityImg(activity.getActivityImg());
        }
        if(activityInfo.getNowNumbers() == null){
            activityInfo.setNowNumbers(activity.getNowNumbers());
        }
        if(activityInfo.getActivityStatus() == null){
            activityInfo.setActivityStatus(activity.getActivityStatus());
        }
        if(activityInfo.getStartTime() == null){
            Date date = activity.getStartTime();
            if(date != null){
                activityInfo.setStartTime(String.valueOf(date.getTime()));
            }
        }
        if(activityInfo.getEndTime() == null){
            Date date = activity.getEndTime();
            if(date != null){
                activityInfo.setEndTime(String.valueOf(date.getTime()));
            }
        }
        if(activityInfo.getIfLimit() == null){
            activityInfo.setIfLimit(activity.getIfLimit());
        }
        if(activityInfo.getAssocId() == null){
            activityInfo.setAssocId(activity.getAssocId());
        }
        if(activityInfo.getIfDelete() == null){
            activityInfo.setIfDelete(activity.getIfDelete());
        }
        if(activityInfo.getCreateDate() == null){
            Date date = activity.getCreateDate();
            if(date != null){
                activityInfo.setCreateDate(String.valueOf(date.getTime()));
            }
        }
        if(activityInfo.getUpdateDate() == null){
            Date date = activity.getUpdateDate();
            if(date != null){
                activityInfo.setUpdateDate(String.valueOf(date.getTime()));
            }
        }
        activityInfoMapper.updateByPrimaryKey(activityInfo);
    }

    @Override
    public List<ActivityInfo>  getActivityByStatus(Integer activitystatus){
        List<ActivityInfo> activityInfoList = activityInfoMapper.getActivityByStatus(activitystatus);
        return activityInfoList;
    }

    @Override
    public List<ActivityInfo>  getAllActivity(){
        List<ActivityInfo> activityInfoList = activityInfoMapper.getAllActivity();
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

    @Override
    public List<ActivityInfo> getActivityByStaVote(Integer activityStatus, Integer ifVote){
        List<ActivityInfo> activityInfoList = activityInfoMapper.getActivityByStaVote(activityStatus, ifVote);
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
        ExhibitionVote vote = exhibitionVoteMapper.selectByPrimaryKey(exhibitionVote.getExhibitionVoteId());
        if(exhibitionVote.getExhibitionName() == null){
            exhibitionVote.setExhibitionName(vote.getExhibitionName());
        }
        if(exhibitionVote.getExhibitionText() == null){
            exhibitionVote.setExhibitionText(vote.getExhibitionText());
        }
        if(exhibitionVote.getExhibitionImg() == null){
            exhibitionVote.setExhibitionImg(vote.getExhibitionImg());
        }
        if(exhibitionVote.getVoteNumber() == null){
            exhibitionVote.setVoteNumber(vote.getVoteNumber());
        }
        if(exhibitionVote.getIfDelete() == null){
            exhibitionVote.setIfDelete(vote.getIfDelete());
        }
        if(exhibitionVote.getCreateDate() == null){
            Date date = vote.getCreateDate();
            if(date != null){
                exhibitionVote.setCreateDate(String.valueOf(date.getTime()));
            }
        }
        if(exhibitionVote.getUpdateDate() == null){
            Date date = vote.getUpdateDate();
            if(date != null){
                exhibitionVote.setUpdateDate(String.valueOf(date.getTime()));
            }
        }
        if(exhibitionVote.getStartData() == null){
            Date date = vote.getStartData();
            if(date != null){
                exhibitionVote.setStartData(String.valueOf(date.getTime()));
            }
        }
        if(exhibitionVote.getEndData() == null){
            Date date = vote.getEndData();
            if(date != null){
                exhibitionVote.setEndData(String.valueOf(date.getTime()));
            }
        }
        if(exhibitionVote.getExhibitionPlace() == null){
            exhibitionVote.setExhibitionPlace(vote.getExhibitionPlace());
        }
        if(exhibitionVote.getExhibitionStatus() == null){
            exhibitionVote.setExhibitionStatus(vote.getExhibitionStatus());
        }
        exhibitionVoteMapper.updateExhibition(exhibitionVote);
    }

    @Override
    public List<ExhibitionVote> getExhibitionByStatus(Integer exhibitionStatus){
        List<ExhibitionVote> exhibitionVotes = exhibitionVoteMapper.getExhibitionByStatus(exhibitionStatus);
        return exhibitionVotes;
    }

    @Override
    public List<ExhibitionVote> getAllExhibition(){
        List<ExhibitionVote> exhibitionVotes = exhibitionVoteMapper.getAllExhibition();
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
        AssociationInfo association = associationInfoMapper.selectByPrimaryKey(associationInfo.getAssocId());
        if(associationInfo.getAssocText() == null){
            associationInfo.setAssocText(association.getAssocText());
        }
        if(associationInfo.getAssocImg() == null){
            associationInfo.setAssocImg(association.getAssocImg());
        }
        if(associationInfo.getAssocContact() == null){
            associationInfo.setAssocContact(association.getAssocContact());
        }
        if(associationInfo.getIfDelete() == null){
            associationInfo.setIfDelete(association.getIfDelete());
        }
        if(associationInfo.getCreateDate() == null){
            Date date = association.getCreateDate();
            if(date != null){
                associationInfo.setCreateDate(String.valueOf(date.getTime()));
            }
        }
        if(associationInfo.getUpdateDate() == null){
            Date date = association.getUpdateDate();
            if(date != null){
                associationInfo.setUpdateDate(String.valueOf(date.getTime()));
            }
        }
        if(associationInfo.getActivityId() == null){
            associationInfo.setActivityId(association.getActivityId());
        }
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
    public AssociationInfo getAssocByActivity(Integer activityId){
        Integer assocId = activityInfoMapper.selectByPrimaryKey(activityId).getAssocId();
        AssociationInfo associationInfos = associationInfoMapper.selectByPrimaryKey(assocId);
        return associationInfos;
    }

    /**用户*/
    @Override
    public String userLogin(String userName,String passWord){
        UserInfo userInfo = userInfoMapper.selectByUserName(userName);
        if(userInfo == null)
            return null;
        TokenUtil tokenUtil = new TokenUtil();
        tokenUtil.setSecret(passWord);
        String token = tokenUtil.sign(userName);
        return token;
    }

    @Override
    public void userRegister(UserInfo userInfo){
        userInfoMapper.insert(userInfo);
    }

    @Override
    public List<UserInfo> getAllUser(){
        List<UserInfo> userInfos = userInfoMapper.getAllUser();
        return userInfos;
    }

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

    @Override
    public void updateUserInfo(UserInfo userInfo){
        UserInfo user = userInfoMapper.selectByPrimaryKey(userInfo.getUserId());
        if(userInfo.getUserName() == null)
            userInfo.setUserName(user.getUserName());
        if(userInfo.getUserPhone() == null)
            userInfo.setUserPhone(user.getUserPhone());
        if(userInfo.getWxToken() == null)
            userInfo.setWxToken(user.getWxToken());
        if(userInfo.getIfDelete() == null)
            userInfo.setIfDelete(user.getIfDelete());
        if(userInfo.getCreateDate() == null){
            Date date = user.getCreateDate();
            if(date != null){
                userInfo.setCreateDate(String.valueOf(date.getTime()));
            }
        }
        if(userInfo.getUpdateDate() == null){
            Date date = user.getUpdateDate();
            if(date != null){
                userInfo.setUpdateDate(String.valueOf(date.getTime()));
            }
        }
        if(userInfo.getUserPassword() == null)
            userInfo.setUserPassword(user.getUserPassword());
        userInfoMapper.updateUserInfo(userInfo);
    }

    @Override
    public void userDelete(Integer userId){
        userInfoMapper.deleteByPrimaryKey(userId);
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
        AssociationMember member = associationMemberMapper.selectByPrimaryKey(associationMember.getMemberId());
        if(associationMember.getMemberTitle() == null){
            associationMember.setMemberTitle(member.getMemberTitle());
        }
        if(associationMember.getUserId() == null){
            associationMember.setUserId(member.getUserId());
        }
        if(associationMember.getAssocId() == null){
            associationMember.setAssocId(member.getAssocId());
        }
        if(associationMember.getIfDelete() == null){
            associationMember.setIfDelete(member.getIfDelete());
        }
        if(associationMember.getCreateDate() == null){
            Date date = member.getCreateDate();
            if(date != null){
                associationMember.setCreateDate(String.valueOf(date.getTime()));
            }
        }
        if(associationMember.getUpdateDate() == null){
            Date date = member.getUpdateDate();
            if(date != null){
                associationMember.setUpdateDate(String.valueOf(date.getTime()));
            }
        }
        associationMemberMapper.updateByPrimaryKey(associationMember);
    }

    @Override
    public List<AssociationInfo> selectAInAssocM(Integer userId){
        List<AssociationMember> associationMembers = associationMemberMapper.selectByUserKey(userId);
        List<AssociationInfo> associationInfos = new ArrayList<>();
        for(AssociationMember associationMember : associationMembers){
            AssociationInfo associationInfo = associationInfoMapper.selectByPrimaryKey(associationMember.getAssocId());
            associationInfos.add(associationInfo);
        }
        return associationInfos;
    }

    @Override
    public List<UserInfo> selectUInAssocM(Integer assocId){
        List<AssociationMember> associationMembers = associationMemberMapper.selectByAssocKey(assocId);
        List<UserInfo> userInfos =  new ArrayList<>();
        for(AssociationMember associationMember : associationMembers){
            UserInfo userInfo = userInfoMapper.selectByPrimaryKey(associationMember.getUserId());
            userInfos.add(userInfo);
        }
        return userInfos;
    }

    /**用户活动表*/
    @Override
    public UserActivity selectByUAKey(Integer userId, Integer activityId){
        UserActivity userActivity = userActivityMapper.selectByUAKey(userId, activityId);
        return userActivity;
    }

    @Override
    public List<ActivityInfo> selectAByUserKey(Integer userId){
        List<UserActivity> userActivities = userActivityMapper.selectAByUserKey(userId);
        List<ActivityInfo> activityInfos = new ArrayList<>();
        for(UserActivity userActivity : userActivities){
            ActivityInfo activityInfo = activityInfoMapper.selectByPrimaryKey(userActivity.getActivityId());
            activityInfos.add(activityInfo);
        }
        return activityInfos;
    }

    @Override
    public List<UserInfo> selectUByActivityKey(Integer activityId){
        List<UserActivity> userActivities = userActivityMapper.selectUByActivityKey(activityId);
        //System.out.println("******size = *********"+userActivities.size());
        List<UserInfo> userInfos = new ArrayList<>();
        for(UserActivity userActivity : userActivities){
            UserInfo userInfo = userInfoMapper.selectByPrimaryKey(userActivity.getUserId());
            userInfos.add(userInfo);
        }
        return userInfos;
    }

    @Override
    public void deleteByUserActivity(Integer userId, Integer activityId){
        userActivityMapper.deleteByUserActivity(userId, activityId);
    }

    @Override
    public void addUserActivity(UserActivity userActivity){
        userActivityMapper.insert(userActivity);
    }

    /**用户展览表*/
    @Override
    public UserExhibition selectByUEKey(Integer userId, Integer exhibitId){
        UserExhibition userExhibition = userExhibitionMapper.selectByUEKey(userId, exhibitId);
        return userExhibition;
    }

    @Override
    public List<ExhibitionVote> selectEByUserKey(Integer userId){
        List<UserExhibition> userExhibitions = userExhibitionMapper.selectEByUserKey(userId);
        List<ExhibitionVote> exhibitionVotes = new ArrayList<>();
        for(UserExhibition userExhibition: userExhibitions){
            ExhibitionVote exhibitionVote = exhibitionVoteMapper.selectByPrimaryKey(userExhibition.getExhibitId());
            exhibitionVotes.add(exhibitionVote);
        }
        return exhibitionVotes;
    }

    @Override
    public void addUserExhibition(UserExhibition userExhibition){
        userExhibitionMapper.insert(userExhibition);
    }

    @Override
    public void deleteUserExhibition(Integer userId, Integer exhibitionId){
        userExhibitionMapper.deleteUserExhibition(userId, exhibitionId);
    }

    /**管理员表**/
    @Override
    public String adminLogin(String adminName,String passWord){
        AdminInfo adminInfo = adminInfoMapper.selectByAdminName(adminName);
        if(adminInfo == null)
            return null;
        TokenUtil tokenUtil = new TokenUtil();
        tokenUtil.setSecret(passWord);
        String token = tokenUtil.sign(adminName);
        return token;
    }

    @Override
    public void adminRegister(AdminInfo adminInfo){
        adminInfoMapper.insert(adminInfo);
    }

    @Override
    public void updateAdminInfo(AdminInfo adminInfo){
        AdminInfo admin = adminInfoMapper.selectByPrimaryKey(adminInfo.getAdminId());
        if(adminInfo.getAdminName() == null)
            adminInfo.setAdminName(admin.getAdminName());
        if(adminInfo.getAdminPassword() == null)
            adminInfo.setAdminPassword(admin.getAdminPassword());
        if(adminInfo.getAdminPhone() == null)
            adminInfo.setAdminPhone(admin.getAdminPhone());
        if(adminInfo.getSessionId() == null)
            adminInfo.setSessionId(admin.getSessionId());
        adminInfoMapper.updateAdminInfo(adminInfo);
    }

    @Override
    public void adminDelete(Integer adminId){
        adminInfoMapper.deleteByPrimaryKey(adminId);
    }

    @Override
    public AdminInfo selectAByPrimaryKey(Integer adminId){
        AdminInfo adminInfo = adminInfoMapper.selectByPrimaryKey(adminId);
        return adminInfo;
    }

    @Override
    public AdminInfo selectByAdminName(String adminName){
        AdminInfo adminInfo = adminInfoMapper.selectByAdminName(adminName);
        return adminInfo;
    }

    @Override
    public AdminInfo selectByAdminPhone(String adminPhone){
        AdminInfo adminInfo = adminInfoMapper.selectByAdminPhone(adminPhone);
        return adminInfo;
    }
}
