package com.dhu.tickets.controller;

import com.dhu.tickets.common.WrapMapper;
import com.dhu.tickets.common.Wrapper;
import com.dhu.tickets.entity.AssociationInfo;
import com.dhu.tickets.entity.AssociationMember;
import com.dhu.tickets.entity.UserInfo;
import com.dhu.tickets.service.TestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/associationMember")
public class AssociationMemberController {
    @Autowired
    private TestService testService;

    /**协会成员表*/
    @PostMapping("/addAssocMember")
    @ApiOperation(notes = "加入协会", value = "加入协会")
    public void addAssociationMember(@RequestBody AssociationMember associationMember){
        testService.addAssociationMember(associationMember);
    }

    @GetMapping("/deleteAssocMember/{memberId}")
    @ApiOperation(notes = "删除成员", value = "删除成员")
    public void deleteAssociationMember(@PathVariable(value = "memberId") Integer memberId){
        testService.deleteAssociationMember(memberId);
    }

    @PostMapping("/updateAssocMember")
    @ApiOperation(notes = "修改头衔", value = "修改头衔")
    public void updateAssociationMember(@RequestBody AssociationMember associationMember){
        testService.updateAssociationMember(associationMember);
    }

    @GetMapping("/associationByUser")
    @ApiOperation(notes = "用户加入的协会", value = "用户加入的协会")
    public Wrapper selectAInAssocM(Integer userId){
        List<AssociationInfo> associationInfos = testService.selectAInAssocM(userId);
        return WrapMapper.ok(associationInfos);
    }

    @GetMapping("/userInAssociation")
    @ApiOperation(notes = "协会中的成员", value = "协会中的成员")
    public Wrapper selectUInAssocM(Integer assocId){
        List<UserInfo> userInfos = testService.selectUInAssocM(assocId);
        return WrapMapper.ok(userInfos);
    }

}
