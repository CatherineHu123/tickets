package com.dhu.tickets.mapper;

import com.dhu.tickets.entity.ActivityInfo;
import com.dhu.tickets.entity.ActivityInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

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

    List<ActivityInfo> getActivityByStatus(Integer activitystatus);

    List<ActivityInfo> getAllActivity();

    List<ActivityInfo> getActivityByAss(Integer assocId);

    List<ActivityInfo> getActivityByStaVote(Integer activityStatus, Integer ifLimit);

    Integer getMaxInActivity(@Param("id") Integer id);

    @Select("select now_numbers from activity_info where activity_id = #{id}")
    Integer getNowInActivity(@Param("id")Integer id);

    @Update("update activity_info set now_numbers = now_numbers+1 where activity_id = #{id}")
    int addNowInAct(@Param("id")Integer id);

    @Update("update activity_info set now_numbers = now_numbers-1 where activity_id = #{id}")
    int decNowInAct(@Param("id") Integer id);
}