package com.dhu.tickets.interceptor;

import com.dhu.tickets.common.WrapMapper;
import com.dhu.tickets.entity.UserInfo;
import com.dhu.tickets.mapper.UserInfoMapper;
import com.dhu.tickets.service.TestService;
import com.dhu.tickets.utils.AESUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 请求头openId
 *
 * @Author: Catherine
 */
@Component
public class OpenidInterceptor implements HandlerInterceptor {
    private static Logger logger = LoggerFactory.getLogger(OpenidInterceptor.class);

    @Autowired
    private TestService testService;

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String openidStr = request.getHeader("openid");
        String token = request.getHeader("token");
        System.out.println("openidStr=====>"+openidStr);
        System.out.println("token=====>"+token);
        byte[] openidCode = AESUtils.parseHexStr2Byte(openidStr);
        String openid = new String(AESUtils.decrypt(openidCode, "tickets"));
        logger.info("openidCode是=====>{}",openidCode);
        logger.info("openid是=====>{}",openid);
        List<UserInfo> userInfos =  userInfoMapper.findUserByToken(openid);
        logger.info("userInfos.size() ====> {}", userInfos.size());
        if (0 != userInfos.size()){
            logger.info("有openid=====>{}", openid);
            ValueOperations<String, Integer> operations = redisTemplate.opsForValue();
            // 如果缓存中不存在
            if (!redisTemplate.hasKey(openid)){
                operations.set(openid, userInfos.get(0).getUserId());
            }
            return true;
        }
        response.sendRedirect(request.getContextPath()+"/user/userSign");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
