package com.dhu.tickets.mapper;

import com.dhu.tickets.entity.ActivityInfo;
import com.dhu.tickets.entity.ExhibitionVote;
import com.dhu.tickets.entity.ExhibitionVoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface ExhibitionVoteMapper {
    int countByExample(ExhibitionVoteExample example);

    int deleteByExample(ExhibitionVoteExample example);

    int deleteByPrimaryKey(Integer exhibitionVoteId);

    int insert(ExhibitionVote record);

    int insertSelective(ExhibitionVote record);

    List<ExhibitionVote> selectByExample(ExhibitionVoteExample example);

    ExhibitionVote selectByPrimaryKey(Integer exhibitionVoteId);

    int updateByExampleSelective(@Param("record") ExhibitionVote record, @Param("example") ExhibitionVoteExample example);

    int updateByExample(@Param("record") ExhibitionVote record, @Param("example") ExhibitionVoteExample example);

    int updateByPrimaryKeySelective(ExhibitionVote record);

    int updateByPrimaryKey(ExhibitionVote record);

    @Select("select * from exhibition_vote where exhibitionStatus = #{exhibitionStatus}")
    List<ExhibitionVote> getExhibitionByStatus(@Param("exhibitionStatus") Integer exhibitionStatus);
}