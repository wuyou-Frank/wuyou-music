package com.entity;

import lombok.Data;


public class AdminloginEntity {
    private Integer alid;
    private String alname;
    private String alpassword;

    @Override
    public String toString() {
        return "AdminloginEntity{" +
                "alid=" + alid +
                ", alname='" + alname + '\'' +
                ", alpassword='" + alpassword + '\'' +
                '}';
    }

    public Integer getAlid() {
        return alid;
    }

    public void setAlid(Integer alid) {
        this.alid = alid;
    }

    public String getAlname() {
        return alname;
    }

    public void setAlname(String alname) {
        this.alname = alname;
    }

    public String getAlpassword() {
        return alpassword;
    }

    public void setAlpassword(String alpassword) {
        this.alpassword = alpassword;
    }
}
