package com.dhu.tickets.controller;

import com.dhu.tickets.common.R;
import com.dhu.tickets.common.WrapMapper;
import com.dhu.tickets.common.Wrapper;
import com.dhu.tickets.entity.UserInfo;
import com.dhu.tickets.mapper.UserInfoMapper;
import com.dhu.tickets.service.TestService;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private TestService testService;

    /**用户*/
//    @GetMapping("/userLogin")
//    @ApiOperation(notes = "用户登录", value = "用户登录")
//    public Wrapper usrLogin(@RequestParam("username") String userName, @RequestParam("password")String passWord){
//        String token= testService.userLogin(userName, passWord);
//        if (StringUtils.isBlank(token)){
//            return WrapMapper.error("HttpStatus.UNAUTHORIZED");
//        }
//        UserInfo userInfo = testService.selectByUserName(userName);
//        if (!passWord.equals(userInfo.getUserPassword())){
//            return WrapMapper.error("用户名、密码不对");
//        }
//        userInfo.setWxToken(token);
//        testService.updateUserInfo(userInfo);
//        return WrapMapper.ok(userInfo);
//    }

    @PostMapping("/userUpdate")
    @ApiOperation(notes = "修改用户信息", value = "修改用户信息")
    public R userInfoUpdate(@RequestBody UserInfo userInfo){
        testService.updateUserInfo(userInfo);
        return R.suc();
    }

    @PostMapping("/userRegister")
    @ApiOperation(notes = "用户注册", value = "用户注册")
    public R userRegister(@RequestBody UserInfo userInfo){
        testService.userRegister(userInfo);
        return R.suc();
    }

    @GetMapping("/userDelete/{userId}")
    @ApiOperation(notes = "删除用户", value = "删除用户")
    public R userDelete(@PathVariable Integer userId){
        testService.userDelete(userId);
        return R.suc();
    }

    @GetMapping("/allUser")
    @ApiOperation(notes = "查询所有用户", value = "查询所有用户")
    public Wrapper getAllUser(){
        List<UserInfo> userInfos = testService.getAllUser();
        return WrapMapper.ok(userInfos);
    }

    @GetMapping("/userInfoById/{userId}")
    @ApiOperation(notes = "通过id获取用户信息", value = "通过id获取用户信息")
    public Wrapper selectUByPrimaryKey(@PathVariable Integer userId){
        UserInfo userInfo = testService.selectUByPrimaryKey(userId);
        return WrapMapper.ok(userInfo);
    }

    @GetMapping("/userInfoByName/{userName}")
    @ApiOperation(notes = "通过名字获取用户信息", value = "通过名字获取用户信息")
    public Wrapper selectByUserName(@PathVariable String userName){
        UserInfo userInfo = testService.selectByUserName(userName);
        return WrapMapper.ok(userInfo);
    }

    @GetMapping("/userInfoByPhone/{userPhone}")
    @ApiOperation(notes = "通过手机号获取用户信息", value = "通过手机号获取用户信息")
    public Wrapper selectByUserPhone(@PathVariable String userPhone){
        UserInfo userInfo = testService.selectByUserPhone(userPhone);
        return WrapMapper.ok(userInfo);
    }

    // 判断用户是否是第一次登陆
    @GetMapping("/isFirstLogin/{openid}")
    @ApiOperation(value = "判断是否是第一次登陆")
    public Wrapper isFirstLogin(@PathVariable(value = "openid") String openid){
        List<UserInfo> userByOpenid = testService.findUserByOpenid(openid);
        for (UserInfo user : userByOpenid) {
            System.out.println(user);
        }
        if (0 != userByOpenid.size()){
            return WrapMapper.ok(userByOpenid.get(0));
        }
        return WrapMapper.ok("第一次登陆");
    }

    @PostMapping("/userSign")
    @ApiOperation(value = "录入用户信息")
    public R userSign(@RequestBody UserInfo userInfo){
        testService.insert(userInfo);
        return R.suc();
    }

    @GetMapping("/getOpenId/{code}")
    @ApiOperation(value = "获取openid")
    public Wrapper getOpenId(@PathVariable String code){
        return testService.getOpenId(code);
    }
}
