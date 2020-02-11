package com.entity;

import java.util.Date;

public class CommentreplyEntity {
    private Integer commentreplyid;
    private String commentreplycontent;
    private Date commentreplytime;
    private String ulname;

    @Override
    public String toString() {
        return "CommentreplyEntity{" +
                "commentreplyid=" + commentreplyid +
                ", commentreplycontent='" + commentreplycontent + '\'' +
                ", commentreplytime=" + commentreplytime +
                ", ulname='" + ulname + '\'' +
                '}';
    }

    public String getUlname() {
        return ulname;
    }

    public void setUlname(String ulname) {
        this.ulname = ulname;
    }

    public Integer getCommentreplyid() {
        return commentreplyid;
    }

    public void setCommentreplyid(Integer commentreplyid) {
        this.commentreplyid = commentreplyid;
    }

    public String getCommentreplycontent() {
        return commentreplycontent;
    }

    public void setCommentreplycontent(String commentreplycontent) {
        this.commentreplycontent = commentreplycontent;
    }

    public Date getCommentreplytime() {
        return commentreplytime;
    }

    public void setCommentreplytime(Date commentreplytime) {
        this.commentreplytime = commentreplytime;
    }
}
