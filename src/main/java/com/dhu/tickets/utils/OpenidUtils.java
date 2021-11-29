package com.dhu.tickets.utils;

import com.dhu.tickets.entity.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Author: Catherine
 */
public class OpenidUtils {

    public static String getOpenId(HttpServletRequest request) throws Exception {
        String openidStr = request.getHeader("openid");
        byte[] openidCode = AESUtils.parseHexStr2Byte(openidStr);
        String openid = new String(AESUtils.decrypt(openidCode, "tickets"));
        return openid;
    }
}
