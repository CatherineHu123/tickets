package com.dhu.tickets.interceptor;

import com.alibaba.fastjson.JSONObject;
import com.dhu.tickets.common.TokenUtil;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class TokenInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response,Object handler)throws Exception{
        String token = request.getHeader("token");
        if(token==null){
            return false;
        }
        return TokenUtil.verify(token);
    }
}
