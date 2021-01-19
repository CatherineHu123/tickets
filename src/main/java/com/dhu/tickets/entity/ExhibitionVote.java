package com.dhu.tickets.entity;

import java.util.Date;

public class ExhibitionVote {
    private Integer exhibitionVoteId;

    private String exhibitionName;

    private String exhibitionText;

    private String exhibitionImg;

    private Integer voteNumber;

    private Integer ifDelete;

    private Date createDate;

    private Date updateDate;

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