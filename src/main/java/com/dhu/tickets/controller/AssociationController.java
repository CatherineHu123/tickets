package com.dhu.tickets.controller;

import com.dhu.tickets.common.R;
import com.dhu.tickets.common.WrapMapper;
import com.dhu.tickets.common.Wrapper;
import com.dhu.tickets.entity.AssociationInfo;
import com.dhu.tickets.service.TestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/association")
public class AssociationController {
    @Autowired
    private TestService testService;

    /**协会*/
    @PostMapping("/addAssociation")
    @ApiOperation(notes = "创建协会", value = "创建协会")
    public R addAssociation(@RequestBody AssociationInfo associationInfo){
        testService.addAssociation(associationInfo);
        return R.suc();
    }

    @GetMapping("/deleteAssociation")
    @ApiOperation(notes = "删除协会", value = "删除协会")
    public R deleteAssociation(Integer assocId){
        testService.deleteAssociation(assocId);
        return R.suc();
    }

    @PostMapping("/updateAssociation")
    @ApiOperation(notes = "修改协会信息", value = "修改协会信息")
    public R updateAssociation(@RequestBody AssociationInfo associationInfo){
        testService.updateAssociation(associationInfo);
        return R.suc();
    }

    @GetMapping("/association")
    @ApiOperation(notes = "协会列表", value = "协会列表")
    public Wrapper getAllAssoc(Integer ifDelete){
        List<AssociationInfo> associationInfos = testService.getAllAssoc(ifDelete);
        return WrapMapper.ok(associationInfos);
    }

    @GetMapping("/associationByPrimaryKey")
    @ApiOperation(notes = "查询指定协会", value = "查询指定协会")
    public Wrapper selectAssByPrimaryKey(Integer assocId){
        AssociationInfo associationInfo = testService.selectAssByPrimaryKey(assocId);
        return WrapMapper.ok(associationInfo);
    }

    @GetMapping("/associationByActivity")
    @ApiOperation(notes = "根据活动查询协会", value = "根据活动查询协会")
    public Wrapper getAssocByActivity(Integer activityId){
        AssociationInfo associationInfos = testService.getAssocByActivity(activityId);
        return WrapMapper.ok(associationInfos);
    }

    @ApiOperation(value = "根据名字查询协会")
    @GetMapping("/associationByName/{name}")
    public Wrapper getAssocByName(@PathVariable String name){
        List<AssociationInfo> associationInfos = testService.getAssocByName(name);
        if (associationInfos.size() == 0){
            return WrapMapper.error("没有相关协会，请重新查询");
        }
        return WrapMapper.ok(associationInfos);
    }
}
