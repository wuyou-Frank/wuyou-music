package com.entity;

import lombok.Data;


public class PlayRecoredsEntity {
    private Integer pid;
    private String pname;
    private String psinger;
    private String palbum;
    private String psongAddress;
    private String pimgAddress;

    @Override
    public String toString() {
        return "PlayRecoredsEntity{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                ", psinger='" + psinger + '\'' +
                ", palbum='" + palbum + '\'' +
                ", psongAddress='" + psongAddress + '\'' +
                ", pimgAddress='" + pimgAddress + '\'' +
                '}';
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPsinger() {
        return psinger;
    }

    public void setPsinger(String psinger) {
        this.psinger = psinger;
    }

    public String getPalbum() {
        return palbum;
    }

    public void setPalbum(String palbum) {
        this.palbum = palbum;
    }

    public String getPsongAddress() {
        return psongAddress;
    }

    public void setPsongAddress(String psongAddress) {
        this.psongAddress = psongAddress;
    }

    public String getPimgAddress() {
        return pimgAddress;
    }

    public void setPimgAddress(String pimgAddress) {
        this.pimgAddress = pimgAddress;
    }
}
