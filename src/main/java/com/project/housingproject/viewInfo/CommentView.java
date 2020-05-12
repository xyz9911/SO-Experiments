package com.project.housingproject.viewInfo;

import java.sql.Timestamp;
import java.util.Date;

public class CommentView {
    private int cid;
    private int eid;
    private int uid;
    private String ccontent;
    private int crating;
    private Date cdate;
    private String uname;
    private String uavatar;

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }


    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getCcontent() {
        return ccontent;
    }

    public void setCcontent(String ccontent) {
        this.ccontent = ccontent;
    }

    public int getCrating() {
        return crating;
    }

    public void setCrating(int crating) {
        this.crating = crating;
    }

    public Date getCdate() {
        return cdate;
    }

    public void setCdate(Timestamp cdate) {
        this.cdate = cdate;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUavatar() {
        return uavatar;
    }

    public void setUavatar(String uavatar) {
        this.uavatar = uavatar;
    }

    public  CommentView(){}

    public CommentView(int cid, int eid, int uid, String ccontent, int crating, Date cdate, String uname, String uavatar) {
        this.cid = cid;
        this.eid = eid;
        this.uid = uid;
        this.ccontent = ccontent;
        this.crating = crating;
        this.cdate = cdate;
        this.uname = uname;
        this.uavatar = uavatar;
    }
}
