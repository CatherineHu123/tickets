package com.dhu.tickets.service.impl;

import com.dhu.tickets.entity.UserInfo;
import com.dhu.tickets.mapper.UserInfoMapper;
import com.dhu.tickets.service.UserService;
import com.dhu.tickets.utils.AESUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Catherine
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUser(HttpServletRequest request){
        String openidStr = request.getHeader("openid");
        byte[] openidCode = AESUtils.parseHexStr2Byte(openidStr);
        String openid = new String(AESUtils.decrypt(openidCode, "tickets"));
        Integer id = (Integer) redisTemplate.opsForValue().get(openid);
        return userInfoMapper.selectByPrimaryKey(id);
    }
}
