package com.dhu.tickets.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class AssociationInfo {
    private Integer assocId;

    private String assocText;

    private String assocImg;

    private String assocContact;

    private Integer ifDelete;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date createDate;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date updateDate;

    private Integer activityId;

    public Integer getAssocId() {
        return assocId;
    }

    public void setAssocId(Integer assocId) {
        this.assocId = assocId;
    }

    public String getAssocText() {
        return assocText;
    }

    public void setAssocText(String assocText) {
        this.assocText = assocText == null ? null : assocText.trim();
    }

    public String getAssocImg() {
        return assocImg;
    }

    public void setAssocImg(String assocImg) {
        this.assocImg = assocImg == null ? null : assocImg.trim();
    }

    public String getAssocContact() {
        return assocContact;
    }

    public void setAssocContact(String assocContact) {
        this.assocContact = assocContact == null ? null : assocContact.trim();
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

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }
}