package com.project.housingproject.viewInfo;

import java.sql.Timestamp;
import java.util.Date;

public class PostView {
    private int pid;
    private int uid;
    private String ptitle;
    private String pcontent;
    private Date pdate;
    private String uname;
    private String uavatar;

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent;
    }

    public Date getPdate() {
        return pdate;
    }

    public void setPdate(Timestamp pdate) {
        this.pdate = pdate;
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

    public PostView(int pid, int uid, String ptitle, String pcontent, Date pdate, String uname, String uavatar) {
        this.pid = pid;
        this.uid = uid;
        this.ptitle = ptitle;
        this.pcontent = pcontent;
        this.pdate = pdate;
        this.uname = uname;
        this.uavatar = uavatar;
    }
}
