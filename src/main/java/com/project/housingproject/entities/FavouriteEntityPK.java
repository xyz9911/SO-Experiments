package com.project.housingproject.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class FavouriteEntityPK implements Serializable {
    private int uid;
    private int hid;

    @Column(name = "UID", nullable = false)
    @Id
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Column(name = "HID", nullable = false)
    @Id
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

        FavouriteEntityPK that = (FavouriteEntityPK) o;

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
