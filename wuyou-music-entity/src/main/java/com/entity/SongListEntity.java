package com.entity;

import lombok.Data;

@Data
public class SongListEntity {
    private Integer slid;
    private String slname;
    private String slinger;
    private String slalbum;
    private String slsongAddress;
    private String slimgAddress;
    private Integer songSheetid;

    public Integer getSlid() {
        return slid;
    }

    public void setSlid(Integer slid) {
        this.slid = slid;
    }

    public String getSlname() {
        return slname;
    }

    public void setSlname(String slname) {
        this.slname = slname;
    }

    public String getSlinger() {
        return slinger;
    }

    public void setSlinger(String slinger) {
        this.slinger = slinger;
    }

    public String getSlalbum() {
        return slalbum;
    }

    public void setSlalbum(String slalbum) {
        this.slalbum = slalbum;
    }

    public String getSlsongAddress() {
        return slsongAddress;
    }

    public void setSlsongAddress(String slsongAddress) {
        this.slsongAddress = slsongAddress;
    }

    public String getSlimgAddress() {
        return slimgAddress;
    }

    public void setSlimgAddress(String slimgAddress) {
        this.slimgAddress = slimgAddress;
    }

    public Integer getSongSheetid() {
        return songSheetid;
    }

    public void setSongSheetid(Integer songSheetid) {
        this.songSheetid = songSheetid;
    }
}
