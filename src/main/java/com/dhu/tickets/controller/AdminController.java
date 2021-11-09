package com.dhu.tickets.controller;

import com.dhu.tickets.common.R;
import com.dhu.tickets.common.WrapMapper;
import com.dhu.tickets.common.Wrapper;
import com.dhu.tickets.entity.AdminInfo;
import com.dhu.tickets.service.TestService;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/system/admin")
public class AdminController {
    @Autowired
    private TestService testService;

    /**管理员**/
    @PostMapping("/adminLogin")
    @ApiOperation(notes = "管理员登录", value = "管理员登录")
    public Wrapper adminLogin(@RequestBody AdminInfo adminInfo){
        String adminName = adminInfo.getAdminName();
        String passWord = adminInfo.getAdminPassword();
        String token= testService.adminLogin(adminName, passWord);
        if (StringUtils.isBlank(token)){
            return WrapMapper.ok(new ResponseEntity<>(HttpStatus.UNAUTHORIZED));
        }
        adminInfo.setSessionId(token);
        testService.updateAdminInfo(adminInfo);
        return WrapMapper.ok(token);
    }

    @PostMapping("/adminRegister")
    @ApiOperation(notes = "管理员注册", value = "管理员注册")
    public R adminRegister(@RequestBody AdminInfo adminInfo){
        testService.adminRegister(adminInfo);
        return R.suc();
    }

    @PostMapping("/adminUpdate")
    @ApiOperation(notes = "修改管理员信息", value = "修改管理员信息")
    public R updateAdminInfo(@RequestBody AdminInfo adminInfo){
        testService.updateAdminInfo(adminInfo);
        return R.suc();
    }

    @GetMapping("/adminInfoById")
    @ApiOperation(notes = "通过id获取管理员信息", value = "通过id获取管理员信息")
    public Wrapper selectAByPrimaryKey(Integer adminId){
        AdminInfo adminInfo = testService.selectAByPrimaryKey(adminId);
        return WrapMapper.ok(adminInfo);
    }

    @GetMapping("/adminInfoByName")
    @ApiOperation(notes = "通过名字获取管理员信息", value = "通过名字获取管理员信息")
    public Wrapper selectByAdminName(String adminName){
        AdminInfo adminInfo = testService.selectByAdminName(adminName);
        return WrapMapper.ok(adminInfo);
    }

    @GetMapping("/adminInfoByPhone")
    @ApiOperation(notes = "通过手机号获取管理员信息", value = "通过手机号获取管理员信息")
    public Wrapper selectByAdminPhone(String adminPhone){
        AdminInfo adminInfo = testService.selectByAdminPhone(adminPhone);
        return WrapMapper.ok(adminInfo);
    }

    @PostMapping("/adminDelete")
    @ApiOperation(notes = "删除管理员", value = "删除管理员")
    public R adminDelete(@RequestBody Integer adminId){
        testService.adminDelete(adminId);
        return R.suc();
    }
}
