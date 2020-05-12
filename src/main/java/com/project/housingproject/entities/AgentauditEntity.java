package com.project.housingproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "agentaudit", schema = "housing_system", catalog = "")
@IdClass(AgentauditEntityPK.class)
public class AgentauditEntity {
    private int adminid;
    private int aid;

    @Id
    @Column(name = "ADMINID", nullable = false)
    public int getAdminid() {
        return adminid;
    }

    public void setAdminid(int adminid) {
        this.adminid = adminid;
    }

    @Id
    @Column(name = "AID", nullable = false)
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

        AgentauditEntity that = (AgentauditEntity) o;

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
