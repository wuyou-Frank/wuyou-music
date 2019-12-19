package com.entity;

public class AlbumEntity {
    private Integer aid;
    private String aname;
    private String apicture_address;

    @Override
    public String toString() {
        return "AlbumEntity{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", apicture_address='" + apicture_address + '\'' +
                '}';
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getApicture_address() {
        return apicture_address;
    }

    public void setApicture_address(String apicture_address) {
        this.apicture_address = apicture_address;
    }
}
