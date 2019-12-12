package com.entity;

import lombok.Data;


public class CommunityEntity {
    private Integer cmid;
    private String cmname;
    private Integer classificationid;
    private String cname;

    @Override
    public String toString() {
        return "CommunityEntity{" +
                "cmid=" + cmid +
                ", cmname='" + cmname + '\'' +
                ", classificationid=" + classificationid +
                ", cname='" + cname + '\'' +
                '}';
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getCmid() {
        return cmid;
    }

    public void setCmid(Integer cmid) {
        this.cmid = cmid;
    }

    public String getCmname() {
        return cmname;
    }

    public void setCmname(String cmname) {
        this.cmname = cmname;
    }

    public Integer getClassificationid() {
        return classificationid;
    }

    public void setClassificationid(Integer classificationid) {
        this.classificationid = classificationid;
    }
}
