package com.dhu.tickets.mq;

import com.dhu.tickets.entity.UserActivity;
import com.dhu.tickets.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 接收消息
 *
 * @Author: Catherine
 */
@Service
public class MQReceiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(MQReceiver.class);

    @Autowired
    private TestService testService;

    @RabbitListener(queues = "goupiao")
    public void receiver(UserActivity userActivity){
        // 查询数据库中的库存
        LOGGER.info("max:"+testService.getMaxInActivity(userActivity.getActivityId()));
        int left = testService.getMaxInActivity(userActivity.getActivityId()) - testService.getNowInActivity(userActivity.getActivityId());
        // 库存不足，返回
        if (left <= 0) {
            LOGGER.info("库存不足");
            return;
        }
        // 是否已经报名了
        UserActivity tickets = testService.selectByUAKey(userActivity.getUserId(), userActivity.getActivityId());
        if (null != tickets){
            LOGGER.info("已报名");
            return;
        }
        // 减少库存
        testService.addNowInAct(userActivity.getActivityId());
        // 报名
        UserActivity user = new UserActivity();
        user.setActivityId(userActivity.getActivityId());
        user.setUserId(userActivity.getUserId());
        testService.addUserActivity(user);
    }
}
