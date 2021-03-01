package com.dhu.tickets.common;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.dhu.tickets.entity.UserInfo;

import java.util.Date;

public class TokenUtil {

    private static final long EXPIRE_TIME = 60 * 24 * 7 * 60 * 1000;

    private static String TOKEN_SECRET;

    public void setSecret(String password){
        TOKEN_SECRET = password;
    }

    /**生成签名*/
    public static String sign(String name){
        String token = null;
        try {
            Date expiresAt = new Date(System.currentTimeMillis() + EXPIRE_TIME);
            token = JWT.create()
                    .withIssuer("auth")
                    .withClaim("username", name)
                    .withExpiresAt(expiresAt)
                    .sign(Algorithm.HMAC256(TOKEN_SECRET));
        } catch (Exception e){
            e.printStackTrace();
        }
        return token;
    }

    /**验证签名*/
    public static boolean verify(String token){
        try {
            JWTVerifier verifier = JWT.require(Algorithm.HMAC256(TOKEN_SECRET)).withIssuer("auth").build();
            DecodedJWT jwt = verifier.verify(token);
            System.out.println("认证通过：");
            System.out.println("username: " + jwt.getClaim("name").asString());
            System.out.println("过期时间：      " + jwt.getExpiresAt());
            return true;
        } catch (Exception e){
            return false;
        }
    }
}
