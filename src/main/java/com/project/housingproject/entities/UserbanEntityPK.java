package com.project.housingproject.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class UserbanEntityPK implements Serializable {
    private int adminid;
    private int uid;

    @Column(name = "ADMINID", nullable = false)
    @Id
    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    @Column(name = "UID", nullable = false)
    @Id
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserbanEntityPK that = (UserbanEntityPK) o;

        if (adminid != that.adminid) return false;
        if (uid != that.uid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adminid;
        result = 31 * result + uid;
        return result;
    }
}
