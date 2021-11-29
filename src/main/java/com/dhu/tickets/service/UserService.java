package com.dhu.tickets.service;

import com.dhu.tickets.entity.UserInfo;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Catherine
 */
public interface UserService {
    // 从缓存中获取User
    UserInfo getUser(HttpServletRequest request);
}
