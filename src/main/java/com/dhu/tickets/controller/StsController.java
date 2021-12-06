package com.dhu.tickets.controller;

import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.auth.sts.AssumeRoleRequest;
import com.aliyuncs.auth.sts.AssumeRoleResponse;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.http.ProtocolType;
import com.aliyuncs.profile.DefaultProfile;
import com.aliyuncs.profile.IClientProfile;
import com.dhu.tickets.common.WrapMapper;
import com.dhu.tickets.common.Wrapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author: Catherine
 */

@RestController
@RequestMapping("StsController")
public class StsController {
    @ResponseBody
    @GetMapping("/sts")
    public Wrapper sts(HttpServletRequest req) {

        AssumeRoleResponse.Credentials credentials = null;
        String endpoint = "sts.cn-beijing.aliyuncs.com";
        String accessKeyId = "LTAI5tLHH1mpmfgMmuREnNDB";
        String accessKeySecret = "aPgQOBbesXw7qJ6lAnfsH8J0h0zUiP";
        String roleArn = "acs:ram::1053330913923211:role/ramosstest";
        String roleSessionName = "SessionTest";
        String policy = "{\n" +
                "    \"Statement\": [\n" +
                "        {\n" +
                "            \"Action\": [\n" +
                "                \"oss:GetObject\",\n" +
                "                \"oss:PutObject\",\n" +
                "                \"oss:DeleteObject\",\n" +
                "                \"oss:ListParts\",\n" +
                "                \"oss:AbortMultipartUpload\",\n" +
                "                \"oss:ListObjects\"\n" +
                "            ],\n" +
                "            \"Effect\": \"Allow\",\n" +
                "            \"Resource\": [\n" +
                "                \"acs:oss:*:*:ram-test/*\",\n" +
                "                \"acs:oss:*:*:ram-test\"\n" +
                "            ]\n" +
                "        }\n" +
                "    ],\n" +
                "    \"Version\": \"1\"\n" +
                "}";
        try {
            // 添加endpoint（直接使用STS endpoint，前两个参数留空，无需添加region ID）
            DefaultProfile.addEndpoint("", "", "Sts", endpoint);
            // 构造default profile（参数留空，无需添加region ID）
            IClientProfile profile = DefaultProfile.getProfile("", accessKeyId, accessKeySecret);
            // 用profile构造client
            DefaultAcsClient client = new DefaultAcsClient(profile);
            final AssumeRoleRequest request = new AssumeRoleRequest();
            request.setMethod(MethodType.POST);
            request.setRoleArn(roleArn);
            request.setRoleSessionName(roleSessionName);
            request.setPolicy(policy); // Optional
            request.setProtocol(ProtocolType.HTTPS); // 必须使用HTTPS协议访问STS服务);
            final AssumeRoleResponse response = client.getAcsResponse(request);
            credentials = response.getCredentials();
            System.out.println("Expiration: " + credentials.getExpiration());
            System.out.println("Access Key Id: " + credentials.getAccessKeyId());
            System.out.println("Access Key Secret: " + credentials.getAccessKeySecret());
            System.out.println("Security Token: " + credentials.getSecurityToken());
            System.out.println("RequestId: " + response.getRequestId());
        } catch (ClientException e) {
            System.out.println("Failed：");
            System.out.println("Error code: " + e.getErrCode());
            System.out.println("Error message: " + e.getErrMsg());
            System.out.println("RequestId: " + e.getRequestId());
        }
        return WrapMapper.ok(credentials);
    }
}
