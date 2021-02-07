package com.dhu.tickets.entity;

import java.util.Date;

public class ActivityInfo {
    private Integer activityId;

    private String activityName;

    private String activityLocation;

    private String activityIntroduction;

    private Integer defaultNumbers;

    private String activityImg;

    private Integer nowNumbers;

    private Integer activityStatus;

    private Date startTime;

    private Date endTime;

    private Integer ifVote;

    private Integer assocId;

    private Integer ifDelete;

    private Date createDate;

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

    public Integer getDefaultNumbers() {
        return defaultNumbers;
    }

    public void setDefaultNumbers(Integer defaultNumbers) {
        this.defaultNumbers = defaultNumbers;
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

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getIfVote() {
        return ifVote;
    }

    public void setIfVote(Integer ifVote) {
        this.ifVote = ifVote;
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

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}