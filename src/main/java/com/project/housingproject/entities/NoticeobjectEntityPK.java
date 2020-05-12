package com.project.housingproject.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class NoticeobjectEntityPK implements Serializable {
    private int id;
    private int nid;

    @Column(name = "ID", nullable = false)
    @Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "NID", nullable = false)
    @Id
    public int getNid() {
        return nid;
    }

    public void setNid(int nid) {
        this.nid = nid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        NoticeobjectEntityPK that = (NoticeobjectEntityPK) o;

        if (id != that.id) return false;
        if (nid != that.nid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nid;
        return result;
    }
}
