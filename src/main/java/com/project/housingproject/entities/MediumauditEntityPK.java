package com.project.housingproject.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class MediumauditEntityPK implements Serializable {
    private int adminid;
    private int mid;

    @Column(name = "ADMINID", nullable = false)
    @Id
    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    @Column(name = "MID", nullable = false)
    @Id
    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MediumauditEntityPK that = (MediumauditEntityPK) o;

        if (adminid != that.adminid) return false;
        if (mid != that.mid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adminid;
        result = 31 * result + mid;
        return result;
    }
}
