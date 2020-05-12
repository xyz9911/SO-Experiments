package com.project.housingproject.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "agentrating", schema = "housing_system", catalog = "")
public class AgentratingEntity {
    private int arid;
    private int uid;
    private int aid;
    private int arating;
    private String acomment;
    private Timestamp adate;

    @Id
    @Column(name = "ARID", nullable = false)
    public int getArid() {
        return arid;
    }

    public void setArid(int arid) {
        this.arid = arid;
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
    @Column(name = "AID", nullable = false)
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Basic
    @Column(name = "ARATING", nullable = false)
    public int getArating() {
        return arating;
    }

    public void setArating(int arating) {
        this.arating = arating;
    }

    @Basic
    @Column(name = "ACOMMENT", nullable = true, length = 255)
    public String getAcomment() {
        return acomment;
    }

    public void setAcomment(String acomment) {
        this.acomment = acomment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgentratingEntity that = (AgentratingEntity) o;

        if (arid != that.arid) return false;
        if (uid != that.uid) return false;
        if (aid != that.aid) return false;
        if (arating != that.arating) return false;
        if (acomment != null ? !acomment.equals(that.acomment) : that.acomment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = arid;
        result = 31 * result + uid;
        result = 31 * result + aid;
        result = 31 * result + arating;
        result = 31 * result + (acomment != null ? acomment.hashCode() : 0);
        return result;
    }

    @Basic
    @Column(name = "ADATE", nullable = false)
    public Timestamp getAdate() {
        return adate;
    }

    public void setAdate(Timestamp adate) {
        this.adate = adate;
    }
}
