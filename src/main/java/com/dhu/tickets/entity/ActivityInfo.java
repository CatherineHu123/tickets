package com.dhu.tickets.entity;

import com.dhu.tickets.DateToLongSerializer;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.*;
import java.util.Date;
import java.util.TimeZone;

public class ActivityInfo {
    private Integer activityId;

    private String activityName;

    private String activityLocation;

    private String activityIntroduction;

    private Integer maxNumbers;

    private String activityImg;

    private Integer nowNumbers;

    private Integer activityStatus;

    @JsonSerialize(using = DateToLongSerializer.class)
    private Date startTime;

    @JsonSerialize(using = DateToLongSerializer.class)
    private Date endTime;

    private Integer ifLimit;

    private Integer assocId;

    private Integer ifDelete;

    @JsonSerialize(using = DateToLongSerializer.class)
    private Date createDate;

    @JsonSerialize(using = DateToLongSerializer.class)
    private Date updateDate;

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    public String getActivityLocation() {
        return activityLocation;
    }

    public void setActivityLocation(String activityLocation) {
        this.activityLocation = activityLocation == null ? null : activityLocation.trim();
    }

    public String getActivityIntroduction() {
        return activityIntroduction;
    }

    public void setActivityIntroduction(String activityIntroduction) {
        this.activityIntroduction = activityIntroduction == null ? null : activityIntroduction.trim();
    }

    public Integer getMaxNumbers() {
        return maxNumbers;
    }

    public void setMaxNumbers(Integer maxNumbers) {
        this.maxNumbers = maxNumbers;
    }

    public String getActivityImg() {
        return activityImg;
    }

    public void setActivityImg(String activityImg) {
        this.activityImg = activityImg == null ? null : activityImg.trim();
    }

    public Integer getNowNumbers() {
        return nowNumbers;
    }

    public void setNowNumbers(Integer nowNumbers) {
        this.nowNumbers = nowNumbers;
    }

    public Integer getActivityStatus() {
        return activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        if(startTime.contains("-")){
            DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                this.startTime = sdf.parse(startTime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else{
            this.startTime = new Date(Long.parseLong(startTime));
        }
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        if(endTime.contains("-")){
            DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                this.endTime = sdf.parse(endTime);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else{
            this.endTime = new Date(Long.parseLong(endTime));
        }
    }

    public Integer getIfLimit() {
        return ifLimit;
    }

    public void setIfLimit(Integer ifLimit) {
        this.ifLimit = ifLimit;
    }

    public Integer getAssocId() {
        return assocId;
    }

    public void setAssocId(Integer assocId) {
        this.assocId = assocId;
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