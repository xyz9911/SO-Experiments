package com.project.housingproject.viewInfo;

import java.math.BigDecimal;

public class HouseDetailView {
    private int hid;
    private String hname;
    private String haddress;
    private BigDecimal hsquare;
    private BigDecimal hprice;
    private String hbreifinfo;
    private String himage;
    private String hinfo;
    private int aid;
    private String aname;
    private String aavatar;
    private int eid;
    private String ename;
    private BigDecimal eavgprice;
    private String eimage;
    private String ebriefinfo;

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

    public BigDecimal getHsquare() {
        return hsquare;
    }

    public void setHsquare(BigDecimal hsquare) {
        this.hsquare = hsquare;
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

    public String getHinfo() {
        return hinfo;
    }

    public void setHinfo(String hinfo) {
        this.hinfo = hinfo;
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

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public BigDecimal getEavgprice() {
        return eavgprice;
    }

    public void setEavgprice(BigDecimal eavgprice) {
        this.eavgprice = eavgprice;
    }

    public String getEimage() {
        return eimage;
    }

    public void setEimage(String eimage) {
        this.eimage = eimage;
    }

    public String getEbriefinfo() {
        return ebriefinfo;
    }

    public void setEbriefinfo(String ebriefinfo) {
        this.ebriefinfo = ebriefinfo;
    }

    public HouseDetailView(int hid, String hname, String haddress, BigDecimal hsquare, BigDecimal hprice, String hbreifinfo, String himage, String hinfo, int aid, String aname, String aavatar, int eid, String ename, BigDecimal eavgprice, String eimage, String ebriefinfo) {
        this.hid = hid;
        this.hname = hname;
        this.haddress = haddress;
        this.hsquare = hsquare;
        this.hprice = hprice;
        this.hbreifinfo = hbreifinfo;
        this.himage = himage;
        this.hinfo = hinfo;
        this.aid = aid;
        this.aname = aname;
        this.aavatar = aavatar;
        this.eid = eid;
        this.ename = ename;
        this.eavgprice = eavgprice;
        this.eimage = eimage;
        this.ebriefinfo = ebriefinfo;
    }
}
