package com.dhu.tickets.mapper;

import com.dhu.tickets.entity.AssociationMember;
import com.dhu.tickets.entity.AssociationMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssociationMemberMapper {
    int countByExample(AssociationMemberExample example);

    int deleteByExample(AssociationMemberExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(AssociationMember record);

    int insertSelective(AssociationMember record);

    List<AssociationMember> selectByExample(AssociationMemberExample example);

    AssociationMember selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") AssociationMember record, @Param("example") AssociationMemberExample example);

    int updateByExample(@Param("record") AssociationMember record, @Param("example") AssociationMemberExample example);

    int updateByPrimaryKeySelective(AssociationMember record);

    int updateByPrimaryKey(AssociationMember record);
}