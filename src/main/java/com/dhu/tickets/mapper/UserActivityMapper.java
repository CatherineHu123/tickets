package com.dhu.tickets.mapper;

import com.dhu.tickets.entity.ActivityInfo;
import com.dhu.tickets.entity.UserActivity;
import com.dhu.tickets.entity.UserActivityExample;
import java.util.List;

import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Param;

public interface UserActivityMapper {
    int countByExample(UserActivityExample example);

    int deleteByExample(UserActivityExample example);

    int deleteByPrimaryKey(Integer userActivityId);

    int insert(UserActivity record);

    int insertSelective(UserActivity record);

    List<UserActivity> selectByExample(UserActivityExample example);

    UserActivity selectByPrimaryKey(Integer userActivityId);

    int updateByExampleSelective(@Param("record") UserActivity record, @Param("example") UserActivityExample example);

    int updateByExample(@Param("record") UserActivity record, @Param("example") UserActivityExample example);

    int updateByPrimaryKeySelective(UserActivity record);

    int updateByPrimaryKey(UserActivity record);

    UserActivity selectByUAKey(Integer userId, Integer activityId);

    List<UserActivity> selectAByUserKey(Integer userId);

    List<UserActivity> selectUByActivityKey(Integer activityId);

    int deleteByUserActivity(Integer userId, Integer activityId);
}