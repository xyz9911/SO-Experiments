package com.project.housingproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "medium", schema = "housing_system", catalog = "")
public class MediumEntity {
    private int mid;
    private String mname;
    private String maddress;
    private String mcontact;
    private byte mverifystatus;

    @Id
    @Column(name = "MID", nullable = false)
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Basic
    @Column(name = "MNAME", nullable = false, length = 255)
    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    @Basic
    @Column(name = "MADDRESS", nullable = false, length = 255)
    public String getMaddress() {
        return maddress;
    }

    public void setMaddress(String maddress) {
        this.maddress = maddress;
    }

    @Basic
    @Column(name = "MCONTACT", nullable = false, length = 255)
    public String getMcontact() {
        return mcontact;
    }

    public void setMcontact(String mcontact) {
        this.mcontact = mcontact;
    }

    @Basic
    @Column(name = "MVERIFYSTATUS", nullable = false)
    public byte getMverifystatus() {
        return mverifystatus;
    }

    public void setMverifystatus(byte mverifystatus) {
        this.mverifystatus = mverifystatus;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MediumEntity that = (MediumEntity) o;

        if (mid != that.mid) return false;
        if (mverifystatus != that.mverifystatus) return false;
        if (mname != null ? !mname.equals(that.mname) : that.mname != null) return false;
        if (maddress != null ? !maddress.equals(that.maddress) : that.maddress != null) return false;
        if (mcontact != null ? !mcontact.equals(that.mcontact) : that.mcontact != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mid;
        result = 31 * result + (mname != null ? mname.hashCode() : 0);
        result = 31 * result + (maddress != null ? maddress.hashCode() : 0);
        result = 31 * result + (mcontact != null ? mcontact.hashCode() : 0);
        result = 31 * result + (int) mverifystatus;
        return result;
    }
}
