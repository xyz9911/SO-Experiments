package com.project.housingproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "favourite", schema = "housing_system", catalog = "")
@IdClass(FavouriteEntityPK.class)
public class FavouriteEntity {
    private int uid;
    private int hid;

    @Id
    @Column(name = "UID", nullable = false)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Id
    @Column(name = "HID", nullable = false)
    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FavouriteEntity that = (FavouriteEntity) o;

        if (uid != that.uid) return false;
        if (hid != that.hid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uid;
        result = 31 * result + hid;
        return result;
    }
}
