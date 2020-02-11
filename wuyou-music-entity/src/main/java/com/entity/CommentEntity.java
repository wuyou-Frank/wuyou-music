package com.entity;

import java.util.Date;

public class CommentEntity {
    private Integer commentid;
    private String commentcontent;
    private Date Commenttime;
    private String ulname;

    @Override
    public String toString() {
        return "CommentEntity{" +
                "commentid=" + commentid +
                ", commentcontent='" + commentcontent + '\'' +
                ", Commenttime=" + Commenttime +
                ", ulname='" + ulname + '\'' +
                '}';
    }

    public String getUlname() {
        return ulname;
    }

    public void setUlname(String ulname) {
        this.ulname = ulname;
    }

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public String getCommentcontent() {
        return commentcontent;
    }

    public void setCommentcontent(String commentcontent) {
        this.commentcontent = commentcontent;
    }

    public Date getCommenttime() {
        return Commenttime;
    }

    public void setCommenttime(Date commenttime) {
        Commenttime = commenttime;
    }
}
