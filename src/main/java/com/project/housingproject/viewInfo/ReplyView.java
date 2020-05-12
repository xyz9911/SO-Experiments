package com.project.housingproject.viewInfo;

import java.sql.Timestamp;
import java.util.Date;

public class ReplyView {
    private int rid;
    private int pid;
    private int id;
    private String rcontent;
    private Date rdate;
    private String name;
    private String avatar;

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRcontent() {
        return rcontent;
    }

    public void setRcontent(String rcontent) {
        this.rcontent = rcontent;
    }

    public Date getRdate() {
        return rdate;
    }

    public void setRdate(Timestamp rdate) {
        this.rdate = rdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public ReplyView(int rid, int pid, int id, String rcontent, Date rdate, String name, String avatar) {
        this.rid = rid;
        this.pid = pid;
        this.id = id;
        this.rcontent = rcontent;
        this.rdate = rdate;
        this.name = name;
        this.avatar = avatar;
    }
}
