package com.project.housingproject.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
@Table(name = "noticeobject", schema = "housing_system", catalog = "")
@IdClass(NoticeobjectEntityPK.class)
public class NoticeobjectEntity {
    private int id;
    private int nid;
    private byte isread;
    private Timestamp readtime;

    //private GroupnoticeEntity groupnoticeEntity;
    //
    //@ManyToOne(fetch = FetchType.LAZY)
    //@JoinTable(name = "groupnotice",joinColumns = {@JoinColumn(name = "NID")})
    //public GroupnoticeEntity getGroupnoticeEntity() {
    //    return groupnoticeEntity;
    //}
    //
    //public void setGroupnoticeEntity(GroupnoticeEntity groupnoticeEntity) {
    //    this.groupnoticeEntity = groupnoticeEntity;
    //}

    @Id
    @Column(name = "ID", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Id
    @Column(name = "NID", nullable = false)
    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
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
    @Column(name = "READTIME")
    public Timestamp getReadtime() {
        return readtime;
    }

    public void setReadtime(Timestamp readtime) {
        this.readtime = readtime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoticeobjectEntity that = (NoticeobjectEntity) o;

        if (id != that.id) return false;
        if (nid != that.nid) return false;
        if (isread != that.isread) return false;
        if (readtime != null ? !readtime.equals(that.readtime) : that.readtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nid;
        result = 31 * result + (int) isread;
        result = 31 * result + (readtime != null ? readtime.hashCode() : 0);
        return result;
    }
}
