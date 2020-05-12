package com.project.housingproject.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "house", schema = "housing_system", catalog = "")
public class HouseEntity {
    private int hid;
    private int eid;
    private int aid;
    private String hname;
    private BigDecimal hprice;
    private String haddress;
    private BigDecimal hsquare;
    private byte hverifystatus;
    private byte hvalidstatus;
    private String himage;
    private String hinfo;
    private String hbreifinfo;

    @Id
    @Column(name = "HID", nullable = false)
    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    @Basic
    @Column(name = "EID", nullable = false)
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Basic
    @Column(name = "AID", nullable = false)
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Basic
    @Column(name = "HNAME", nullable = true, length = 255)
    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    @Basic
    @Column(name = "HPRICE", nullable = false, precision = 2)
    public BigDecimal getHprice() {
        return hprice;
    }

    public void setHprice(BigDecimal hprice) {
        this.hprice = hprice;
    }

    @Basic
    @Column(name = "HADDRESS", nullable = false, length = 255)
    public String getHaddress() {
        return haddress;
    }

    public void setHaddress(String haddress) {
        this.haddress = haddress;
    }

    @Basic
    @Column(name = "HSQUARE", nullable = false, precision = 2)
    public BigDecimal getHsquare() {
        return hsquare;
    }

    public void setHsquare(BigDecimal hsquare) {
        this.hsquare = hsquare;
    }

    @Basic
    @Column(name = "HVERIFYSTATUS", nullable = false)
    public byte getHverifystatus() {
        return hverifystatus;
    }

    public void setHverifystatus(byte hverifystatus) {
        this.hverifystatus = hverifystatus;
    }

    @Basic
    @Column(name = "HVALIDSTATUS", nullable = false)
    public byte getHvalidstatus() {
        return hvalidstatus;
    }

    public void setHvalidstatus(byte hvalidstatus) {
        this.hvalidstatus = hvalidstatus;
    }

    @Basic
    @Column(name = "HIMAGE", nullable = true, length = 255)
    public String getHimage() {
        return himage;
    }

    public void setHimage(String himage) {
        this.himage = himage;
    }

    @Basic
    @Column(name = "HINFO", nullable = true, length = 2000)
    public String getHinfo() {
        return hinfo;
    }

    public void setHinfo(String hinfo) {
        this.hinfo = hinfo;
    }

    @Basic
    @Column(name = "HBREIFINFO", nullable = true, length = 255)
    public String getHbreifinfo() {
        return hbreifinfo;
    }

    public void setHbreifinfo(String hbreifinfo) {
        this.hbreifinfo = hbreifinfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HouseEntity that = (HouseEntity) o;

        if (hid != that.hid) return false;
        if (eid != that.eid) return false;
        if (aid != that.aid) return false;
        if (hverifystatus != that.hverifystatus) return false;
        if (hvalidstatus != that.hvalidstatus) return false;
        if (hname != null ? !hname.equals(that.hname) : that.hname != null) return false;
        if (hprice != null ? !hprice.equals(that.hprice) : that.hprice != null) return false;
        if (haddress != null ? !haddress.equals(that.haddress) : that.haddress != null) return false;
        if (hsquare != null ? !hsquare.equals(that.hsquare) : that.hsquare != null) return false;
        if (himage != null ? !himage.equals(that.himage) : that.himage != null) return false;
        if (hinfo != null ? !hinfo.equals(that.hinfo) : that.hinfo != null) return false;
        if (hbreifinfo != null ? !hbreifinfo.equals(that.hbreifinfo) : that.hbreifinfo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hid;
        result = 31 * result + eid;
        result = 31 * result + aid;
        result = 31 * result + (hname != null ? hname.hashCode() : 0);
        result = 31 * result + (hprice != null ? hprice.hashCode() : 0);
        result = 31 * result + (haddress != null ? haddress.hashCode() : 0);
        result = 31 * result + (hsquare != null ? hsquare.hashCode() : 0);
        result = 31 * result + (int) hverifystatus;
        result = 31 * result + (int) hvalidstatus;
        result = 31 * result + (himage != null ? himage.hashCode() : 0);
        result = 31 * result + (hinfo != null ? hinfo.hashCode() : 0);
        result = 31 * result + (hbreifinfo != null ? hbreifinfo.hashCode() : 0);
        return result;
    }
}
