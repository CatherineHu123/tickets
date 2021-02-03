package com.dhu.tickets.mapper;

import com.dhu.tickets.entity.ActivityInfo;
import com.dhu.tickets.entity.ActivityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ActivityInfoMapper {
    int countByExample(ActivityInfoExample example);

    int deleteByExample(ActivityInfoExample example);

    int deleteByPrimaryKey(Integer activityId);

    int insert(ActivityInfo record);

    int insertSelective(ActivityInfo record);

    List<ActivityInfo> selectByExample(ActivityInfoExample example);

    ActivityInfo selectByPrimaryKey(Integer activityId);

    int updateByExampleSelective(@Param("record") ActivityInfo record, @Param("example") ActivityInfoExample example);

    int updateByExample(@Param("record") ActivityInfo record, @Param("example") ActivityInfoExample example);

    int updateByPrimaryKeySelective(ActivityInfo record);

    int updateByPrimaryKey(ActivityInfo record);

    @Select("select * from activity_info where activityStatus = #{activityStatus}")
    List<ActivityInfo> getActivityByStatus(@Param("activityStatus") Integer activityStatus);

    @Select("select * from activity_info where assocId = #{assocId}")
    List<ActivityInfo> getActivityByAss(@Param("assocId") Integer assocId);
}