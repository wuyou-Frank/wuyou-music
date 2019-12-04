package com.entity;

import lombok.Data;


public class SongSheetEntity {
    private Integer ssid;
    private String ssname;
    private String simgAddress;
    private Integer communityid;

    @Override
    public String toString() {
        return "SongSheetEntity{" +
                "ssid=" + ssid +
                ", ssname='" + ssname + '\'' +
                ", simgAddress='" + simgAddress + '\'' +
                ", communityid=" + communityid +
                '}';
    }

    public Integer getSsid() {
        return ssid;
    }

    public void setSsid(Integer ssid) {
        this.ssid = ssid;
    }

    public String getSsname() {
        return ssname;
    }

    public void setSsname(String ssname) {
        this.ssname = ssname;
    }

    public String getSimgAddress() {
        return simgAddress;
    }

    public void setSimgAddress(String simgAddress) {
        this.simgAddress = simgAddress;
    }

    public Integer getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Integer communityid) {
        this.communityid = communityid;
    }
}
