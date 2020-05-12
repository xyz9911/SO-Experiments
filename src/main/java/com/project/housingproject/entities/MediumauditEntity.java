package com.project.housingproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "mediumaudit", schema = "housing_system", catalog = "")
@IdClass(MediumauditEntityPK.class)
public class MediumauditEntity {
    private int adminid;
    private int mid;

    @Id
    @Column(name = "ADMINID", nullable = false)
    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    @Id
    @Column(name = "MID", nullable = false)
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

        MediumauditEntity that = (MediumauditEntity) o;

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
