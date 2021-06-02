package com.dhu.tickets.entity;

import com.dhu.tickets.DateToLongSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AssociationInfo {
    private Integer assocId;

    private String assocText;

    private String assocImg;

    private String assocContact;

    private Integer ifDelete;

    @JsonSerialize(using = DateToLongSerializer.class)
    private Date createDate;

    @JsonSerialize(using = DateToLongSerializer.class)
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

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }
}