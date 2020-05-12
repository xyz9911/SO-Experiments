package com.project.housingproject.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "news", schema = "housing_system", catalog = "")
public class NewsEntity {
    private int nid;
    private String ntitle;
    private String nsource;
    private String ncontent;
    private Timestamp ndate;
    private String nimage;

    @Id
    @Column(name = "NID", nullable = false)
    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
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
    @Column(name = "NSOURCE", nullable = false, length = 255)
    public String getNsource() {
        return nsource;
    }

    public void setNsource(String nsource) {
        this.nsource = nsource;
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

    @Basic
    @Column(name = "NIMAGE", nullable = true, length = 255)
    public String getNimage() {
        return nimage;
    }

    public void setNimage(String nimage) {
        this.nimage = nimage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NewsEntity that = (NewsEntity) o;

        if (nid != that.nid) return false;
        if (ntitle != null ? !ntitle.equals(that.ntitle) : that.ntitle != null) return false;
        if (nsource != null ? !nsource.equals(that.nsource) : that.nsource != null) return false;
        if (ncontent != null ? !ncontent.equals(that.ncontent) : that.ncontent != null) return false;
        if (ndate != null ? !ndate.equals(that.ndate) : that.ndate != null) return false;
        if (nimage != null ? !nimage.equals(that.nimage) : that.nimage != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nid;
        result = 31 * result + (ntitle != null ? ntitle.hashCode() : 0);
        result = 31 * result + (nsource != null ? nsource.hashCode() : 0);
        result = 31 * result + (ncontent != null ? ncontent.hashCode() : 0);
        result = 31 * result + (ndate != null ? ndate.hashCode() : 0);
        result = 31 * result + (nimage != null ? nimage.hashCode() : 0);
        return result;
    }
}
