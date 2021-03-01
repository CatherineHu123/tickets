package com.dhu.tickets.mapper;

import com.dhu.tickets.entity.AdminInfo;
import com.dhu.tickets.entity.AdminInfoExample;
import java.util.List;

import com.dhu.tickets.entity.UserInfo;
import org.apache.ibatis.annotations.Param;

public interface AdminInfoMapper {
    int countByExample(AdminInfoExample example);

    int deleteByExample(AdminInfoExample example);

    int deleteByPrimaryKey(Integer adminId);

    int insert(AdminInfo record);

    int insertSelective(AdminInfo record);

    List<AdminInfo> selectByExample(AdminInfoExample example);

    AdminInfo selectByPrimaryKey(Integer adminId);

    int updateByExampleSelective(@Param("record") AdminInfo record, @Param("example") AdminInfoExample example);

    int updateByExample(@Param("record") AdminInfo record, @Param("example") AdminInfoExample example);

    int updateByPrimaryKeySelective(AdminInfo record);

    int updateByPrimaryKey(AdminInfo record);

    int updateAdminInfo(AdminInfo record);

    AdminInfo selectByAdminName(String adminName);

    AdminInfo selectByAdminPhone(String adminPhone);
}