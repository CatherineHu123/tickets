package com.dhu.tickets.entity;

import com.dhu.tickets.DateToLongSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UserActivity {
    private Integer userActivityId;

    private Integer userId;

    private Integer activityId;

    private Integer ifDelete;

    @JsonSerialize(using = DateToLongSerializer.class)
    private Date createDate;

    @JsonSerialize(using = DateToLongSerializer.class)
    private Date updateDate;

    public Integer getUserActivityId() {
        return userActivityId;
    }

    public void setUserActivityId(Integer userActivityId) {
        this.userActivityId = userActivityId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getIfDelete() {
        return ifDelete;
    }

    public void setIfDelete(Integer ifDelete) {
        this.ifDelete = ifDelete;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        if(createDate.contains("-")){
            DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                this.createDate = sdf.parse(createDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else{
            this.createDate = new Date(Long.parseLong(createDate));
        }
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(String updateDate) {
        if(updateDate.contains("-")){
            DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                this.updateDate = sdf.parse(updateDate);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else{
            this.updateDate = new Date(Long.parseLong(updateDate));
        }
    }
}