package com.project.housingproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "coordinate", schema = "housing_system", catalog = "")
public class CoordinateEntity {
    private int eid;
    private String x;
    private String y;

    @Id
    @Column(name = "EID", nullable = false)
    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    @Basic
    @Column(name = "X", nullable = false, length = 255)
    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    @Basic
    @Column(name = "Y", nullable = false, length = 255)
    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoordinateEntity that = (CoordinateEntity) o;

        if (eid != that.eid) return false;
        if (x != null ? !x.equals(that.x) : that.x != null) return false;
        if (y != null ? !y.equals(that.y) : that.y != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eid;
        result = 31 * result + (x != null ? x.hashCode() : 0);
        result = 31 * result + (y != null ? y.hashCode() : 0);
        return result;
    }
}
