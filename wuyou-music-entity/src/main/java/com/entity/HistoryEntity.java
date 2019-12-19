package com.entity;

import lombok.Data;


public class HistoryEntity {
    private Integer hid;
    private String hname;
    private String hsinger;
    private String halbum;
    private String hsongAddress;
    private String himgAddress;

    @Override
    public String toString() {
        return "HistoryEntity{" +
                "hid=" + hid +
                ", hname='" + hname + '\'' +
                ", hsinger='" + hsinger + '\'' +
                ", halbum='" + halbum + '\'' +
                ", hsongAddress='" + hsongAddress + '\'' +
                ", himgAddress='" + himgAddress + '\'' +
                '}';
    }

    public Integer getHid() {
        return hid;
    }

    public void setHid(Integer hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getHsinger() {
        return hsinger;
    }

    public void setHsinger(String hsinger) {
        this.hsinger = hsinger;
    }

    public String getHalbum() {
        return halbum;
    }

    public void setHalbum(String halbum) {
        this.halbum = halbum;
    }

    public String getHsongAddress() {
        return hsongAddress;
    }

    public void setHsongAddress(String hsongAddress) {
        this.hsongAddress = hsongAddress;
    }

    public String getHimgAddress() {
        return himgAddress;
    }

    public void setHimgAddress(String himgAddress) {
        this.himgAddress = himgAddress;
    }
}
