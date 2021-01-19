package com.dhu.tickets.mapper;

import com.dhu.tickets.entity.UserActivity;
import com.dhu.tickets.entity.UserActivityExample;
import java.util.List;
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
}