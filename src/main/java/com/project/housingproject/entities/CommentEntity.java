package com.project.housingproject.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "comment", schema = "housing_system", catalog = "")
public class CommentEntity {
    private int cid;
    private int eid;
    private int uid;
    private String ccontent;
    private int crating;
    private Timestamp cdate;
    private byte cvalidstatus;

    @Id
    @Column(name = "CID", nullable = false)
    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
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
    @Column(name = "UID", nullable = false)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "CCONTENT", nullable = false, length = 1000)
    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent;
    }

    @Basic
    @Column(name = "CRATING", nullable = false)
    public int getCrating() {
        return crating;
    }

    public void setCrating(int crating) {
        this.crating = crating;
    }

    @Basic
    @Column(name = "CDATE", nullable = false)
    public Timestamp getCdate() {
        return cdate;
    }

    public void setCdate(Timestamp cdate) {
        this.cdate = cdate;
    }

    @Basic
    @Column(name = "CVALIDSTATUS", nullable = false)
    public byte getCvalidstatus() {
        return cvalidstatus;
    }

    public void setCvalidstatus(byte cvalidstatus) {
        this.cvalidstatus = cvalidstatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CommentEntity that = (CommentEntity) o;

        if (cid != that.cid) return false;
        if (eid != that.eid) return false;
        if (uid != that.uid) return false;
        if (crating != that.crating) return false;
        if (cvalidstatus != that.cvalidstatus) return false;
        if (ccontent != null ? !ccontent.equals(that.ccontent) : that.ccontent != null) return false;
        if (cdate != null ? !cdate.equals(that.cdate) : that.cdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cid;
        result = 31 * result + eid;
        result = 31 * result + uid;
        result = 31 * result + (ccontent != null ? ccontent.hashCode() : 0);
        result = 31 * result + crating;
        result = 31 * result + (cdate != null ? cdate.hashCode() : 0);
        result = 31 * result + (int) cvalidstatus;
        return result;
    }
}
