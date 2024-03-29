package com.dhu.tickets.controller;

import com.dhu.tickets.common.R;
import com.dhu.tickets.common.WrapMapper;
import com.dhu.tickets.common.Wrapper;
import com.dhu.tickets.entity.UserInfo;
import com.dhu.tickets.service.TestService;
import com.dhu.tickets.service.UserService;
import com.dhu.tickets.utils.OpenidUtils;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private TestService testService;

    @Autowired
    private UserService userService;

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

    @GetMapping("/userDelete")
    @ApiOperation(notes = "删除用户", value = "删除用户")
    public R userDelete(Integer userId){
        testService.userDelete(userId);
        return R.suc();
    }

    @GetMapping("/allUser")
    @ApiOperation(notes = "查询所有用户", value = "查询所有用户")
    public Wrapper getAllUser(){
        List<UserInfo> userInfos = testService.getAllUser();
        return WrapMapper.ok(userInfos);
    }

    @GetMapping("/getUser")
    @ApiOperation(value = "获取当前用户信息")
    public Wrapper getUserInfo(HttpServletRequest request) throws Exception {
        List<UserInfo> userInfos = testService.findUserByOpenid(OpenidUtils.getOpenId(request));
        if (userInfos == null){
            return WrapMapper.error("opeind错误");
        }
        userInfos.get(0).setWxToken(null);
        return WrapMapper.ok(userInfos.get(0));
    }

    @GetMapping("/userInfoById")
    @ApiOperation(notes = "通过id获取用户信息", value = "通过id获取用户信息")
    public Wrapper selectUByPrimaryKey(Integer userId, HttpServletRequest request) throws Exception {
        List<UserInfo> userInfos = testService.findUserByOpenid(OpenidUtils.getOpenId(request));
        if (userInfos == null||userInfos.get(0).getUserId() != userId){
            return WrapMapper.error("opeind或id错误");
        }
        userInfos.get(0).setWxToken(null);
        return WrapMapper.ok(userInfos.get(0));
    }

    @GetMapping("/userInfoByName")
    @ApiOperation(notes = "通过名字获取用户信息", value = "通过名字获取用户信息")
    public Wrapper selectByUserName(String userName, HttpServletRequest request) throws Exception {
        List<UserInfo> userInfos = testService.findUserByOpenid(OpenidUtils.getOpenId(request));
        System.out.println(userInfos.get(0).getUserName()+" "+userName);
        if (userInfos == null||!userInfos.get(0).getUserName().equals(userName)){
            return WrapMapper.error("opeind或name错误");
        }
        userInfos.get(0).setWxToken(null);
        return WrapMapper.ok(userInfos.get(0));
    }

    @GetMapping("/userInfoByPhone")
    @ApiOperation(notes = "通过手机号获取用户信息", value = "通过手机号获取用户信息")
    public Wrapper selectByUserPhone(String userPhone, HttpServletRequest request) throws Exception {
        List<UserInfo> userInfos = testService.findUserByOpenid(OpenidUtils.getOpenId(request));
        if (userInfos == null||!userInfos.get(0).getUserPhone().equals(userPhone)){
            return WrapMapper.error("opeind或phone错误");
        }
        userInfos.get(0).setWxToken(null);
        return WrapMapper.ok(userInfos.get(0));
    }

    // 判断用户是否是第一次登陆

    /**
     * 已作废，拦截器拦截
     * 如存在 openid，则redis中已经存入userid
     * 若不存在，则跳转到userSign中，存入用户信息
     */
    @GetMapping("/isFirstLogin/openid={openid}")
    @ApiOperation(value = "判断是否是第一次登陆（作废）")
    public Wrapper isFirstLogin(@PathVariable String openid) {
        System.out.println("firstLogin");
        List<UserInfo> userByOpenid = testService.isFirstLogin(openid);
        if (0 != userByOpenid.size()){
            return WrapMapper.ok(userByOpenid.get(0));
        }
        return WrapMapper.error("第一次登陆");
    }

    @PostMapping("/userSign")
    @ApiOperation(value = "录入用户信息")
    public R userSign(@RequestBody UserInfo userInfo, HttpServletRequest request) throws Exception {
        String openId = OpenidUtils.getOpenId(request);
        userInfo.setWxToken(openId);
        testService.insert(userInfo);
        return R.suc();
    }

    @GetMapping("/getOpenId")
    @ApiOperation(value = "获取openid")
    public Wrapper getOpenId(String code){
        return testService.getOpenId(code);
    }
}
