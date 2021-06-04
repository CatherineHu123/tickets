package com.dhu.tickets.entity;

import com.dhu.tickets.DateToLongSerializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.springframework.format.annotation.DateTimeFormat;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExhibitionVote {
    private Integer exhibitionVoteId;

    private String exhibitionName;

    private String exhibitionText;

    private String exhibitionImg;

    private Integer voteNumber;

    private Integer ifDelete;

    @JsonSerialize(using = DateToLongSerializer.class)
    private Date createDate;

    @JsonSerialize(using = DateToLongSerializer.class)
    private Date updateDate;

    @JsonSerialize(using = DateToLongSerializer.class)
    private Date startData;

    @JsonSerialize(using = DateToLongSerializer.class)
    private Date endData;

    private String exhibitionPlace;

    private Integer exhibitionStatus;

    public Integer getExhibitionVoteId() {
        return exhibitionVoteId;
    }

    public void setExhibitionVoteId(Integer exhibitionVoteId) {
        this.exhibitionVoteId = exhibitionVoteId;
    }

    public String getExhibitionName() {
        return exhibitionName;
    }

    public void setExhibitionName(String exhibitionName) {
        this.exhibitionName = exhibitionName == null ? null : exhibitionName.trim();
    }

    public String getExhibitionText() {
        return exhibitionText;
    }

    public void setExhibitionText(String exhibitionText) {
        this.exhibitionText = exhibitionText == null ? null : exhibitionText.trim();
    }

    public String getExhibitionImg() {
        return exhibitionImg;
    }

    public void setExhibitionImg(String exhibitionImg) {
        this.exhibitionImg = exhibitionImg == null ? null : exhibitionImg.trim();
    }

    public Integer getVoteNumber() {
        return voteNumber;
    }

    public void setVoteNumber(Integer voteNumber) {
        this.voteNumber = voteNumber;
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

    public Date getStartData() {
        return startData;
    }

    public void setStartData(String startData) {
        if(startData.contains("-")){
            DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                this.startData = sdf.parse(startData);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else{
            this.startData = new Date(Long.parseLong(startData));
        }
    }

    public Date getEndData() {
        return endData;
    }

    public void setEndData(String endData) {
        if(endData.contains("-")){
            DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            try {
                this.endData = sdf.parse(endData);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }else{
            this.endData = new Date(Long.parseLong(endData));
        }
    }

    public String getExhibitionPlace() {
        return exhibitionPlace;
    }

    public void setExhibitionPlace(String exhibitionPlace) {
        this.exhibitionPlace = exhibitionPlace == null ? null : exhibitionPlace.trim();
    }

    public Integer getExhibitionStatus() {
        return exhibitionStatus;
    }

    public void setExhibitionStatus(Integer exhibitionStatus) {
        this.exhibitionStatus = exhibitionStatus;
    }
}