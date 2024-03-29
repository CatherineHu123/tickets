package com.dhu.tickets.mapper;

import com.dhu.tickets.entity.UserInfo;
import com.dhu.tickets.entity.UserInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserInfoMapper {
    int countByExample(UserInfoExample example);

    int deleteByExample(UserInfoExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    List<UserInfo> selectByExample(UserInfoExample example);

    UserInfo selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByExample(@Param("record") UserInfo record, @Param("example") UserInfoExample example);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateUserInfo(UserInfo record);

    UserInfo selectByUserName(String userName);

    UserInfo selectByUserPhone(String userPhone);

    List<UserInfo> getAllUser();

    List<UserInfo> findUserByToken(@Param("token") String token);
}