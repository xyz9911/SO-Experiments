package com.project.housingproject.entities;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "groupnotice", schema = "housing_system", catalog = "")
public class GroupnoticeEntity {
    private int nid;
    private byte usertype;
    private String ntitle;
    private String ncontent;
    private Timestamp ndate;

    //private List<NoticeobjectEntity> noticeobjectEntities=new ArrayList<NoticeobjectEntity>();
    //
    //@OneToMany(mappedBy = "groupnoticeEntity",cascade = CascadeType.ALL,orphanRemoval = true)
    //public List<NoticeobjectEntity> getNoticeobjectEntities() {
    //    return noticeobjectEntities;
    //}
    //
    //public void setNoticeobjectEntities(List<NoticeobjectEntity> noticeobjectEntities) {
    //    this.noticeobjectEntities = noticeobjectEntities;
    //}

    @Id
    @Column(name = "NID", nullable = false)
    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
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

        GroupnoticeEntity that = (GroupnoticeEntity) o;

        if (nid != that.nid) return false;
        if (usertype != that.usertype) return false;
        if (ntitle != null ? !ntitle.equals(that.ntitle) : that.ntitle != null) return false;
        if (ncontent != null ? !ncontent.equals(that.ncontent) : that.ncontent != null) return false;
        if (ndate != null ? !ndate.equals(that.ndate) : that.ndate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = nid;
        result = 31 * result + (int) usertype;
        result = 31 * result + (ntitle != null ? ntitle.hashCode() : 0);
        result = 31 * result + (ncontent != null ? ncontent.hashCode() : 0);
        result = 31 * result + (ndate != null ? ndate.hashCode() : 0);
        return result;
    }

    public GroupnoticeEntity() {
    }

    public GroupnoticeEntity(int nid, byte usertype, String ntitle, String ncontent, Date ndate) {
        this.nid = nid;
        this.usertype = usertype;
        this.ntitle = ntitle;
        this.ncontent = ncontent;
        this.ndate = ((Timestamp) ndate);
    }
}
