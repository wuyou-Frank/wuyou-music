package com.entity;

public class SingerSongListEntity {
    private Integer sslid;
    private Integer sid;
    private Integer slid;

    @Override
    public String toString() {
        return "singer_song_list{" +
                "sslid=" + sslid +
                ", sid=" + sid +
                ", slid=" + slid +
                '}';
    }

    public Integer getSslid() {
        return sslid;
    }

    public void setSslid(Integer sslid) {
        this.sslid = sslid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getSlid() {
        return slid;
    }

    public void setSlid(Integer slid) {
        this.slid = slid;
    }
}
