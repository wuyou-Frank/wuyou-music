package com.entity;

import lombok.Data;


public class UserLoginAndRegisterEntity {
    private Integer ulid;
    private String ulname;
    private String ulpassword;

    @Override
    public String toString() {
        return "UserloginEntity{" +
                "ulid=" + ulid +
                ", ulname='" + ulname + '\'' +
                ", ulpassword='" + ulpassword + '\'' +
                '}';
    }

    public Integer getUlid() {
        return ulid;
    }

    public void setUlid(Integer ulid) {
        this.ulid = ulid;
    }

    public String getUlname() {
        return ulname;
    }

    public void setUlname(String ulname) {
        this.ulname = ulname;
    }

    public String getUlpassword() {
        return ulpassword;
    }

    public void setUlpassword(String ulpassword) {
        this.ulpassword = ulpassword;
    }
}
