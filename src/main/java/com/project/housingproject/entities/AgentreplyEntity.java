package com.project.housingproject.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "agentreply", schema = "housing_system", catalog = "")
public class AgentreplyEntity {
    private int rid;
    private int pid;
    private int aid;
    private String rcontent;
    private Timestamp rdate;

    @Id
    @Column(name = "RID", nullable = false)
    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    @Basic
    @Column(name = "PID", nullable = false)
    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    @Basic
    @Column(name = "AID", nullable = false)
    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    @Basic
    @Column(name = "RCONTENT", nullable = false, length = 2550)
    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent;
    }

    @Basic
    @Column(name = "RDATE", nullable = false)
    public Timestamp getRdate() {
        return rdate;
    }

    public void setRdate(Timestamp rdate) {
        this.rdate = rdate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AgentreplyEntity that = (AgentreplyEntity) o;

        if (rid != that.rid) return false;
        if (pid != that.pid) return false;
        if (aid != that.aid) return false;
        if (rcontent != null ? !rcontent.equals(that.rcontent) : that.rcontent != null) return false;
        if (rdate != null ? !rdate.equals(that.rdate) : that.rdate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rid;
        result = 31 * result + pid;
        result = 31 * result + aid;
        result = 31 * result + (rcontent != null ? rcontent.hashCode() : 0);
        result = 31 * result + (rdate != null ? rdate.hashCode() : 0);
        return result;
    }
}
