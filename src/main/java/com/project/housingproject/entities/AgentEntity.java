package com.project.housingproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "agent", schema = "housing_system", catalog = "")
public class AgentEntity {
    private int aid;
    private int mid;
    private String aname;
    private String apassword;
    private String acontact;
    private byte averifystatus;
    private byte avalidstatus;
    private String ainfo;
    private String aavatar;

    @Id
    @Column(name = "AID", nullable = false)
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Basic
    @Column(name = "MID", nullable = false)
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Basic
    @Column(name = "ANAME", nullable = false, length = 255)
    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Basic
    @Column(name = "APASSWORD", nullable = false, length = 255)
    public String getApassword() {
        return apassword;
    }

    public void setApassword(String apassword) {
        this.apassword = apassword;
    }

    @Basic
    @Column(name = "ACONTACT", nullable = false, length = 255)
    public String getAcontact() {
        return acontact;
    }

    public void setAcontact(String acontact) {
        this.acontact = acontact;
    }

    @Basic
    @Column(name = "AVERIFYSTATUS", nullable = false)
    public byte getAverifystatus() {
        return averifystatus;
    }

    public void setAverifystatus(byte averifystatus) {
        this.averifystatus = averifystatus;
    }

    @Basic
    @Column(name = "AVALIDSTATUS", nullable = false)
    public byte getAvalidstatus() {
        return avalidstatus;
    }

    public void setAvalidstatus(byte avalidstatus) {
        this.avalidstatus = avalidstatus;
    }

    @Basic
    @Column(name = "AINFO", nullable = true, length = 1000)
    public String getAinfo() {
        return ainfo;
    }

    public void setAinfo(String ainfo) {
        this.ainfo = ainfo;
    }

    @Basic
    @Column(name = "AAVATAR", nullable = true, length = 255)
    public String getAavatar() {
        return aavatar;
    }

    public void setAavatar(String aavatar) {
        this.aavatar = aavatar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgentEntity that = (AgentEntity) o;

        if (aid != that.aid) return false;
        if (mid != that.mid) return false;
        if (averifystatus != that.averifystatus) return false;
        if (avalidstatus != that.avalidstatus) return false;
        if (aname != null ? !aname.equals(that.aname) : that.aname != null) return false;
        if (apassword != null ? !apassword.equals(that.apassword) : that.apassword != null) return false;
        if (acontact != null ? !acontact.equals(that.acontact) : that.acontact != null) return false;
        if (ainfo != null ? !ainfo.equals(that.ainfo) : that.ainfo != null) return false;
        if (aavatar != null ? !aavatar.equals(that.aavatar) : that.aavatar != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aid;
        result = 31 * result + mid;
        result = 31 * result + (aname != null ? aname.hashCode() : 0);
        result = 31 * result + (apassword != null ? apassword.hashCode() : 0);
        result = 31 * result + (acontact != null ? acontact.hashCode() : 0);
        result = 31 * result + (int) averifystatus;
        result = 31 * result + (int) avalidstatus;
        result = 31 * result + (ainfo != null ? ainfo.hashCode() : 0);
        result = 31 * result + (aavatar != null ? aavatar.hashCode() : 0);
        return result;
    }
}
