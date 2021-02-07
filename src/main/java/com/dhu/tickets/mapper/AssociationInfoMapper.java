package com.dhu.tickets.mapper;

import com.dhu.tickets.entity.AssociationInfo;
import com.dhu.tickets.entity.AssociationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AssociationInfoMapper {
    int countByExample(AssociationInfoExample example);

    int deleteByExample(AssociationInfoExample example);

    int deleteByPrimaryKey(Integer assocId);

    int insert(AssociationInfo record);

    int insertSelective(AssociationInfo record);

    List<AssociationInfo> selectByExample(AssociationInfoExample example);

    AssociationInfo selectByPrimaryKey(Integer assocId);

    int updateByExampleSelective(@Param("record") AssociationInfo record, @Param("example") AssociationInfoExample example);

    int updateByExample(@Param("record") AssociationInfo record, @Param("example") AssociationInfoExample example);

    int updateByPrimaryKeySelective(AssociationInfo record);

    int updateByPrimaryKey(AssociationInfo record);

    List<AssociationInfo> getAllAssoc(Integer ifDelete);

    List<AssociationInfo> getAssocByActivity(Integer activityId);
}