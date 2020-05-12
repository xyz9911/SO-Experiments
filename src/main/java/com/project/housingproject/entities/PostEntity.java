package com.project.housingproject.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "post", schema = "housing_system", catalog = "")
public class PostEntity {
    private int pid;
    private int uid;
    private String ptitle;
    private String pcontent;
    private Timestamp pdate;
    private byte pvalidstatus;

    @Id
    @Column(name = "PID", nullable = false)
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
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
    @Column(name = "PTITLE", nullable = false, length = 255)
    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    @Basic
    @Column(name = "PCONTENT", nullable = true, length = 2550)
    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent;
    }

    @Basic
    @Column(name = "PDATE", nullable = false)
    public Timestamp getPdate() {
        return pdate;
    }

    public void setPdate(Timestamp pdate) {
        this.pdate = pdate;
    }

    @Basic
    @Column(name = "PVALIDSTATUS", nullable = false)
    public byte getPvalidstatus() {
        return pvalidstatus;
    }

    public void setPvalidstatus(byte pvalidstatus) {
        this.pvalidstatus = pvalidstatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PostEntity that = (PostEntity) o;

        if (pid != that.pid) return false;
        if (uid != that.uid) return false;
        if (pvalidstatus != that.pvalidstatus) return false;
        if (ptitle != null ? !ptitle.equals(that.ptitle) : that.ptitle != null) return false;
        if (pcontent != null ? !pcontent.equals(that.pcontent) : that.pcontent != null) return false;
        if (pdate != null ? !pdate.equals(that.pdate) : that.pdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = pid;
        result = 31 * result + uid;
        result = 31 * result + (ptitle != null ? ptitle.hashCode() : 0);
        result = 31 * result + (pcontent != null ? pcontent.hashCode() : 0);
        result = 31 * result + (pdate != null ? pdate.hashCode() : 0);
        result = 31 * result + (int) pvalidstatus;
        return result;
    }
}
