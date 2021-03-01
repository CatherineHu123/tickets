package com.dhu.tickets.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class UserExhibition {
    private Integer userExhibitId;

    private Integer userId;

    private Integer exhibitId;

    private Integer ifDelete;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateDate;

    public Integer getUserExhibitId() {
        return userExhibitId;
    }

    public void setUserExhibitId(Integer userExhibitId) {
        this.userExhibitId = userExhibitId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getExhibitId() {
        return exhibitId;
    }

    public void setExhibitId(Integer exhibitId) {
        this.exhibitId = exhibitId;
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