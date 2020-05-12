package com.project.housingproject.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "personalnotice", schema = "housing_system", catalog = "")
public class PersonalnoticeEntity {
    private int nid;
    private int id;
    private byte usertype;
    private byte isread;
    private Timestamp readtime;
    private String ntitle;
    private String ncontent;
    private Timestamp ndate;

    @Id
    @Column(name = "NID", nullable = false)
    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    @Basic
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "USERTYPE", nullable = false)
    public byte getUsertype() {
        return usertype;
    }

    public void setUsertype(byte usertype) {
        this.usertype = usertype;
    }

    @Basic
    @Column(name = "ISREAD", nullable = false)
    public byte getIsread() {
        return isread;
    }

    public void setIsread(byte isread) {
        this.isread = isread;
    }

    @Basic
    @Column(name = "READTIME", nullable = true)
    public Timestamp getReadtime() {
        return readtime;
    }

    public void setReadtime(Timestamp readtime) {
        this.readtime = readtime;
    }

    @Basic
    @Column(name = "NTITLE", nullable = false, length = 255)
    public String getNtitle() {
        return ntitle;
    }

    public void setNtitle(String ntitle) {
        this.ntitle = ntitle;
    }

    @Basic
    @Column(name = "NCONTENT", nullable = false, length = 255)
    public String getNcontent() {
        return ncontent;
    }

    public void setNcontent(String ncontent) {
        this.ncontent = ncontent;
    }

    @Basic
    @Column(name = "NDATE", nullable = false)
    public Timestamp getNdate() {
        return ndate;
    }

    public void setNdate(Timestamp ndate) {
        this.ndate = ndate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PersonalnoticeEntity that = (PersonalnoticeEntity) o;

        if (nid != that.nid) return false;
        if (id != that.id) return false;
        if (usertype != that.usertype) return false;
        if (isread != that.isread) return false;
        if (readtime != null ? !readtime.equals(that.readtime) : that.readtime != null) return false;
        if (ntitle != null ? !ntitle.equals(that.ntitle) : that.ntitle != null) return false;
        if (ncontent != null ? !ncontent.equals(that.ncontent) : that.ncontent != null) return false;
        if (ndate != null ? !ndate.equals(that.ndate) : that.ndate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nid;
        result = 31 * result + id;
        result = 31 * result + (int) usertype;
        result = 31 * result + (int) isread;
        result = 31 * result + (readtime != null ? readtime.hashCode() : 0);
        result = 31 * result + (ntitle != null ? ntitle.hashCode() : 0);
        result = 31 * result + (ncontent != null ? ncontent.hashCode() : 0);
        result = 31 * result + (ndate != null ? ndate.hashCode() : 0);
        return result;
    }
}
