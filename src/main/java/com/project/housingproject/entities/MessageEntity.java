package com.project.housingproject.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "message", schema = "housing_system", catalog = "")
public class MessageEntity {
    private int mid;
    private int uid;
    private int aid;
    private byte sendorreceive;
    private String mcontent;
    private byte isread;
    private Timestamp mdate;

    @Id
    @Column(name = "MID", nullable = false)
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
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
    @Column(name = "SENDORRECEIVE", nullable = false)
    public byte getSendorreceive() {
        return sendorreceive;
    }

    public void setSendorreceive(byte sendorreceive) {
        this.sendorreceive = sendorreceive;
    }

    @Basic
    @Column(name = "MCONTENT", nullable = false, length = 255)
    public String getMcontent() {
        return mcontent;
    }

    public void setMcontent(String mcontent) {
        this.mcontent = mcontent;
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
    @Column(name = "MDATE", nullable = false)
    public Timestamp getMdate() {
        return mdate;
    }

    public void setMdate(Timestamp mdate) {
        this.mdate = mdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MessageEntity that = (MessageEntity) o;

        if (mid != that.mid) return false;
        if (uid != that.uid) return false;
        if (aid != that.aid) return false;
        if (sendorreceive != that.sendorreceive) return false;
        if (isread != that.isread) return false;
        if (mcontent != null ? !mcontent.equals(that.mcontent) : that.mcontent != null) return false;
        if (mdate != null ? !mdate.equals(that.mdate) : that.mdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mid;
        result = 31 * result + uid;
        result = 31 * result + aid;
        result = 31 * result + (int) sendorreceive;
        result = 31 * result + (mcontent != null ? mcontent.hashCode() : 0);
        result = 31 * result + (int) isread;
        result = 31 * result + (mdate != null ? mdate.hashCode() : 0);
        return result;
    }
}
