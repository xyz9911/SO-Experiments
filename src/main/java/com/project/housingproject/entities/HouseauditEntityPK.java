package com.project.housingproject.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class HouseauditEntityPK implements Serializable {
    private int adminid;
    private int eid;
    private int hid;

    @Column(name = "ADMINID", nullable = false)
    @Id
    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    @Column(name = "EID", nullable = false)
    @Id
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Column(name = "HID", nullable = false)
    @Id
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

        HouseauditEntityPK that = (HouseauditEntityPK) o;

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
