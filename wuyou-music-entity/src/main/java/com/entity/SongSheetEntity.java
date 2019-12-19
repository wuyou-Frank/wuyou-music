package com.entity;


import org.springframework.web.multipart.MultipartFile;

public class SongSheetEntity {
    private Integer ssid;
    private String ssname;
    private String simgAddress;
    private Integer communityid;
    private String cmname;

    @Override
    public String toString() {
        return "SongSheetEntity{" +
                "ssid=" + ssid +
                ", ssname='" + ssname + '\'' +
                ", simgAddress='" + simgAddress + '\'' +
                ", communityid=" + communityid +
                ", cmname='" + cmname + '\'' +
                '}';
    }

    public String getSimgAddress() {
        return simgAddress;
    }

    public void setSimgAddress(String simgAddress) {
        this.simgAddress = simgAddress;
    }

    public String getCmname() {
        return cmname;
    }

    public void setCmname(String cmname) {
        this.cmname = cmname;
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

    public Integer getCommunityid() {
        return communityid;
    }

    public void setCommunityid(Integer communityid) {
        this.communityid = communityid;
    }
}
