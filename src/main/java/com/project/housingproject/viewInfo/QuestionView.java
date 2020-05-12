package com.project.housingproject.viewInfo;

public class QuestionView {
    private int qid;
    private int uid;
    private int hid;
    private String qcontent;
    private String uavatar;
    private String uname;

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public int getHid() {
        return hid;
    }

    public void setHid(int hid) {
        this.hid = hid;
    }

    public String getQcontent() {
        return qcontent;
    }

    public void setQcontent(String qcontent) {
        this.qcontent = qcontent;
    }

    public String getUavatar() {
        return uavatar;
    }

    public void setUavatar(String uavatar) {
        this.uavatar = uavatar;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public QuestionView(int qid, int uid, int hid, String qcontent, String uavatar, String uname) {
        this.qid = qid;
        this.uid = uid;
        this.hid = hid;
        this.qcontent = qcontent;
        this.uavatar = uavatar;
        this.uname = uname;
    }
}
