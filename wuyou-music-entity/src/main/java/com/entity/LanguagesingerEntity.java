package com.entity;

public class LanguagesingerEntity {
    private Integer lsid;
    private String lsname;
    private Integer languageid;

    @Override
    public String toString() {
        return "LanguagesingerEntity{" +
                "lsid=" + lsid +
                ", lsname='" + lsname + '\'' +
                ", languageid=" + languageid +
                '}';
    }

    public Integer getLsid() {
        return lsid;
    }

    public void setLsid(Integer lsid) {
        this.lsid = lsid;
    }

    public String getLsname() {
        return lsname;
    }

    public void setLsname(String lsname) {
        this.lsname = lsname;
    }

    public Integer getLanguageid() {
        return languageid;
    }

    public void setLanguageid(Integer languageid) {
        this.languageid = languageid;
    }
}
