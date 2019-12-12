package com.entity;

import lombok.Data;

import javax.validation.constraints.Size;


public class AdminloginAndRegisterEntity {
    private Integer alid;
    @Size(min = 4,max = 20,message = "用户名不少于4位，且不能大于20位")
    private String alname;
    @Size(min = 6,max = 20,message = "登陆密码不能少于6位，且不能大于20位")
    private String alpassword;

    @Override
    public String toString() {
        return "AdminloginAndRegisterEntity{" +
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
