package com.project.housingproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "user", schema = "housing_system", catalog = "")
public class UserEntity {
    private int uid;
    private String uname;
    private String upassword;
    private byte uvalidstatus;
    private Byte ugender;
    private String ucontact;
    private String udistrict;
    private String uavatar;

    @Id
    @Column(name = "UID", nullable = false)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "UNAME", nullable = false, length = 255)
    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Basic
    @Column(name = "UPASSWORD", nullable = false, length = 255)
    public String getUpassword() {
        return upassword;
    }

    public void setUpassword(String upassword) {
        this.upassword = upassword;
    }

    @Basic
    @Column(name = "UVALIDSTATUS", nullable = false)
    public byte getUvalidstatus() {
        return uvalidstatus;
    }

    public void setUvalidstatus(byte uvalidstatus) {
        this.uvalidstatus = uvalidstatus;
    }

    @Basic
    @Column(name = "UGENDER", nullable = true)
    public Byte getUgender() {
        return ugender;
    }

    public void setUgender(Byte ugender) {
        this.ugender = ugender;
    }

    @Basic
    @Column(name = "UCONTACT", nullable = true, length = 255)
    public String getUcontact() {
        return ucontact;
    }

    public void setUcontact(String ucontact) {
        this.ucontact = ucontact;
    }

    @Basic
    @Column(name = "UDISTRICT", nullable = true, length = 255)
    public String getUdistrict() {
        return udistrict;
    }

    public void setUdistrict(String udistrict) {
        this.udistrict = udistrict;
    }

    @Basic
    @Column(name = "UAVATAR", nullable = true, length = 255)
    public String getUavatar() {
        return uavatar;
    }

    public void setUavatar(String uavatar) {
        this.uavatar = uavatar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (uid != that.uid) return false;
        if (uvalidstatus != that.uvalidstatus) return false;
        if (uname != null ? !uname.equals(that.uname) : that.uname != null) return false;
        if (upassword != null ? !upassword.equals(that.upassword) : that.upassword != null) return false;
        if (ugender != null ? !ugender.equals(that.ugender) : that.ugender != null) return false;
        if (ucontact != null ? !ucontact.equals(that.ucontact) : that.ucontact != null) return false;
        if (udistrict != null ? !udistrict.equals(that.udistrict) : that.udistrict != null) return false;
        if (uavatar != null ? !uavatar.equals(that.uavatar) : that.uavatar != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + (uname != null ? uname.hashCode() : 0);
        result = 31 * result + (upassword != null ? upassword.hashCode() : 0);
        result = 31 * result + (int) uvalidstatus;
        result = 31 * result + (ugender != null ? ugender.hashCode() : 0);
        result = 31 * result + (ucontact != null ? ucontact.hashCode() : 0);
        result = 31 * result + (udistrict != null ? udistrict.hashCode() : 0);
        result = 31 * result + (uavatar != null ? uavatar.hashCode() : 0);
        return result;
    }
}
