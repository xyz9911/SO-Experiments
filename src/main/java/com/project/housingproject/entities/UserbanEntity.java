package com.project.housingproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "userban", schema = "housing_system", catalog = "")
@IdClass(UserbanEntityPK.class)
public class UserbanEntity {
    private int adminid;
    private int uid;

    @Id
    @Column(name = "ADMINID", nullable = false)
    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    @Id
    @Column(name = "UID", nullable = false)
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

        UserbanEntity that = (UserbanEntity) o;

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
