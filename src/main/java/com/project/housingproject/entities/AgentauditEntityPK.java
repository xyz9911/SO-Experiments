package com.project.housingproject.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class AgentauditEntityPK implements Serializable {
    private int adminid;
    private int aid;

    @Column(name = "ADMINID", nullable = false)
    @Id
    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    @Column(name = "AID", nullable = false)
    @Id
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgentauditEntityPK that = (AgentauditEntityPK) o;

        if (adminid != that.adminid) return false;
        if (aid != that.aid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = adminid;
        result = 31 * result + aid;
        return result;
    }
}
