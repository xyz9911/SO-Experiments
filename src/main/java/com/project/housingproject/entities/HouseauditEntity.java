package com.project.housingproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "houseaudit", schema = "housing_system", catalog = "")
@IdClass(HouseauditEntityPK.class)
public class HouseauditEntity {
    private int adminid;
    private int eid;
    private int hid;

    @Id
    @Column(name = "ADMINID", nullable = false)
    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    @Id
    @Column(name = "EID", nullable = false)
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Id
    @Column(name = "HID", nullable = false)
    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HouseauditEntity that = (HouseauditEntity) o;

        if (adminid != that.adminid) return false;
        if (eid != that.eid) return false;
        if (hid != that.hid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adminid;
        result = 31 * result + eid;
        result = 31 * result + hid;
        return result;
    }
}
