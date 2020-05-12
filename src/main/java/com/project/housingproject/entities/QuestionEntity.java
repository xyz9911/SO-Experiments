package com.project.housingproject.entities;

import javax.persistence.*;

@Entity
@Table(name = "question", schema = "housing_system", catalog = "")
public class QuestionEntity {
    private int qid;
    private int uid;
    private int hid;
    private String qcontent;

    @Id
    @Column(name = "QID", nullable = false)
    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    @Basic
    @Column(name = "UID", nullable = false)
    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    @Basic
    @Column(name = "HID", nullable = false)
    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    @Basic
    @Column(name = "QCONTENT", nullable = false, length = 255)
    public String getQcontent() {
        return qcontent;
    }

    public void setQcontent(String qcontent) {
        this.qcontent = qcontent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        QuestionEntity that = (QuestionEntity) o;

        if (qid != that.qid) return false;
        if (uid != that.uid) return false;
        if (hid != that.hid) return false;
        if (qcontent != null ? !qcontent.equals(that.qcontent) : that.qcontent != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = qid;
        result = 31 * result + uid;
        result = 31 * result + hid;
        result = 31 * result + (qcontent != null ? qcontent.hashCode() : 0);
        return result;
    }
}
