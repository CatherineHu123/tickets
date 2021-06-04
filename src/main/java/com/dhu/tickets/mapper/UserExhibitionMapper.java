package com.dhu.tickets.mapper;

import com.dhu.tickets.entity.UserActivity;
import com.dhu.tickets.entity.UserExhibition;
import com.dhu.tickets.entity.UserExhibitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserExhibitionMapper {
    int countByExample(UserExhibitionExample example);

    int deleteByExample(UserExhibitionExample example);

    int deleteByPrimaryKey(Integer userExhibitId);

    int insert(UserExhibition record);

    int insertSelective(UserExhibition record);

    List<UserExhibition> selectByExample(UserExhibitionExample example);

    UserExhibition selectByPrimaryKey(Integer userExhibitId);

    int updateByExampleSelective(@Param("record") UserExhibition record, @Param("example") UserExhibitionExample example);

    int updateByExample(@Param("record") UserExhibition record, @Param("example") UserExhibitionExample example);

    int updateByPrimaryKeySelective(UserExhibition record);

    int updateByPrimaryKey(UserExhibition record);

    UserExhibition selectByUEKey(Integer userId, Integer exhibitId);

    List<UserExhibition> selectEByUserKey(Integer userId);

    int deleteUserExhibition(Integer userId, Integer exhibitionId);
}