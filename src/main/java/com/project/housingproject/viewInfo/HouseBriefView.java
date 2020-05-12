package com.project.housingproject.viewInfo;

import java.math.BigDecimal;

public class HouseBriefView {
    private int hid;
    private String hname;
    private String haddress;
    private BigDecimal hsquare;
    private BigDecimal hprice;
    private String hbreifinfo;
    private String himage;
    private int aid;
    private String aname;
    private String aavatar;

    public BigDecimal getHsquare() {
        return hsquare;
    }

    public void setHsquare(BigDecimal hsquare) {
        this.hsquare = hsquare;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getHaddress() {
        return haddress;
    }

    public void setHaddress(String haddress) {
        this.haddress = haddress;
    }

    public BigDecimal getHprice() {
        return hprice;
    }

    public void setHprice(BigDecimal hprice) {
        this.hprice = hprice;
    }

    public String getHbreifinfo() {
        return hbreifinfo;
    }

    public void setHbreifinfo(String hbreifinfo) {
        this.hbreifinfo = hbreifinfo;
    }

    public String getHimage() {
        return himage;
    }

    public void setHimage(String himage) {
        this.himage = himage;
    }

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAavatar() {
        return aavatar;
    }

    public void setAavatar(String aavatar) {
        this.aavatar = aavatar;
    }

    public HouseBriefView(int hid, String hname, String haddress, BigDecimal hsquare, BigDecimal hprice, String hbreifinfo, String himage, int aid, String aname, String aavatar) {
        this.hid = hid;
        this.hname = hname;
        this.haddress = haddress;
        this.hsquare = hsquare;
        this.hprice = hprice;
        this.hbreifinfo = hbreifinfo;
        this.himage = himage;
        this.aid = aid;
        this.aname = aname;
        this.aavatar = aavatar;
    }
}
