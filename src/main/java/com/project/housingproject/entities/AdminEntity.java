package com.project.housingproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "admin", schema = "housing_system", catalog = "")
public class AdminEntity {
    private int adminid;
    private String adminpassword;

    @Id
    @Column(name = "ADMINID", nullable = false)
    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    @Basic
    @Column(name = "ADMINPASSWORD", nullable = false, length = 255)
    public String getAdminpassword() {
        return adminpassword;
    }

    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AdminEntity that = (AdminEntity) o;

        if (adminid != that.adminid) return false;
        if (adminpassword != null ? !adminpassword.equals(that.adminpassword) : that.adminpassword != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adminid;
        result = 31 * result + (adminpassword != null ? adminpassword.hashCode() : 0);
        return result;
    }
}
