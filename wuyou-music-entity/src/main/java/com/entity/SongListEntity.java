package com.entity;

public class SongListEntity {
    private Integer slid;
    private String slname;
    private String slsongAddress;
    private String slimgAddress;
    private Integer songSheetid;
    private String aname;//专辑
    private String sname;//歌手

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

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
