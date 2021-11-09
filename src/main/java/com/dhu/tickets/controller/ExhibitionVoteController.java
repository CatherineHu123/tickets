package com.dhu.tickets.controller;

import com.dhu.tickets.common.R;
import com.dhu.tickets.common.WrapMapper;
import com.dhu.tickets.common.Wrapper;
import com.dhu.tickets.entity.ExhibitionVote;
import com.dhu.tickets.service.TestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exhibitionVote")
public class ExhibitionVoteController {
    @Autowired
    TestService testService;

    /**展览*/
    @PostMapping("/addExhibition")
    @ApiOperation(notes = "创建展览（投票）", value = "创建展览（投票）")
    public R addExhibition(@RequestBody ExhibitionVote exhibitionVote){
        testService.addExhibition(exhibitionVote);
        return R.suc();
    }

    @GetMapping("/deleteExhibition")
    @ApiOperation(notes = "删除展览（投票）", value = "删除展览（投票）")
    public R deleteExhibition(Integer exhibitionVoteId){
        testService.deleteExhibition(exhibitionVoteId);
        return R.suc();
    }

    @PostMapping("/updateExhibition")
    @ApiOperation(notes = "修改展览（投票）信息", value = "修改展览（投票）信息")
    public R updateExhibition(@RequestBody ExhibitionVote exhibitionVote){
        testService.updateExhibition(exhibitionVote);
        return R.suc();
    }

    @GetMapping("/exhibitionByStatus")
    @ApiOperation(notes = "查询指定状态展览列表", value = "查询指定状态展览列表")
    public Wrapper getExhibitionByStatus(Integer exhibitionStatus){
        List<ExhibitionVote> exhibitionVotes = testService.getExhibitionByStatus(exhibitionStatus);
        return WrapMapper.ok(exhibitionVotes);
    }

    @GetMapping("/allExhibition")
    @ApiOperation(notes = "查询所有展览", value = "查询所有展览")
    public Wrapper getAllExhibition(){
        List<ExhibitionVote> exhibitionVotes = testService.getAllExhibition();
        return WrapMapper.ok(exhibitionVotes);
    }

    @GetMapping("/exhibitionByPrimaryKey")
    @ApiOperation(notes = "查询指定展览", value = "查询指定展览")
    public Wrapper selectEByPrimaryKey(Integer exhibitionVoteId){
        ExhibitionVote exhibitionVote = testService.selectEByPrimaryKey(exhibitionVoteId);
        return WrapMapper.ok(exhibitionVote);
    }

}
