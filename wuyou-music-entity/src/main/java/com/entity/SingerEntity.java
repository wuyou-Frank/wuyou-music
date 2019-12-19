package com.entity;

public class SingerEntity {
    private Integer sid;
    private String sname;//歌手名称
    private String introduce;//歌手介绍
    private Integer sex;
    private Integer languagesingerid;
    private String spicture;

    private Integer slid;//歌曲id
    private String slname;//歌曲名字
    private String slsong_address;//歌曲地址
    private String aname;//专辑名字

    @Override
    public String toString() {
        return "SingerEntity{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", introduce='" + introduce + '\'' +
                ", sex=" + sex +
                ", languagesingerid=" + languagesingerid +
                ", spicture='" + spicture + '\'' +
                ", slid=" + slid +
                ", slname='" + slname + '\'' +
                ", slsong_address='" + slsong_address + '\'' +
                ", aname='" + aname + '\'' +
                '}';
    }

    public String getSlname() {
        return slname;
    }

    public void setSlname(String slname) {
        this.slname = slname;
    }

    public Integer getSlid() {
        return slid;
    }

    public void setSlid(Integer slid) {
        this.slid = slid;
    }


    public String getSlsong_address() {
        return slsong_address;
    }

    public void setSlsong_address(String slsong_address) {
        this.slsong_address = slsong_address;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getSpicture() {
        return spicture;
    }

    public void setSpicture(String spicture) {
        this.spicture = spicture;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getLanguagesingerid() {
        return languagesingerid;
    }

    public void setLanguagesingerid(Integer languagesingerid) {
        this.languagesingerid = languagesingerid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
