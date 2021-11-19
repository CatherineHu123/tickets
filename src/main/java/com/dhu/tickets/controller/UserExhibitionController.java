package com.dhu.tickets.controller;

import com.dhu.tickets.common.R;
import com.dhu.tickets.common.WrapMapper;
import com.dhu.tickets.common.Wrapper;
import com.dhu.tickets.entity.ExhibitionVote;
import com.dhu.tickets.entity.UserExhibition;
import com.dhu.tickets.service.TestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/userExhibition")
public class UserExhibitionController {
    @Autowired
    private TestService testService;

    /**用户展览表*/
    @GetMapping("/selectByUEKey/{userId}/{activityId}")
    @ApiOperation(notes = "是否参加展览", value = "是否参加展览")
    public Wrapper selectByUEKey(@PathVariable Integer userId, @PathVariable Integer activityId){
        UserExhibition userExhibition = testService.selectByUEKey(userId, activityId);
        return WrapMapper.ok(userExhibition);
    }

    @GetMapping("/selectEByUserKey/{userId}")
    @ApiOperation(notes = "用户参加的全部展览", value = "用户参加的全部展览")
    public Wrapper selectEByUserKey(@PathVariable Integer userId){
        List<ExhibitionVote> exhibitionVotes = testService.selectEByUserKey(userId);
        return WrapMapper.ok(exhibitionVotes);
    }

    @PostMapping("/addUserExhibition")
    @ApiOperation(notes = "用户参加展览", value = "用户参加展览")
    public R addUserExhibition(@RequestBody UserExhibition userExhibition){
        testService.addUserExhibition(userExhibition);
        return R.suc();
    }

    @GetMapping("/deleteUserExhibition/{userId}/{exhibitionId}")
    @ApiOperation(notes = "用户取消参加展览", value = "用户取消参加展览")
    public R deleteUserExhibition(@PathVariable Integer userId, @PathVariable Integer exhibitionId){
        testService.deleteUserExhibition(userId, exhibitionId);
        return R.suc();
    }

}
