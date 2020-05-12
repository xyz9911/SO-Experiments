package com.project.housingproject.viewInfo;

public class AgentView {
    private int aid;
    private int mid;
    private String aname;
    private String acontact;
    private String ainfo;
    private String aavatar;

    public int getAid() {
        return aid;
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public String getAcontact() {
        return acontact;
    }

    public void setAcontact(String acontact) {
        this.acontact = acontact;
    }

    public String getAinfo() {
        return ainfo;
    }

    public void setAinfo(String ainfo) {
        this.ainfo = ainfo;
    }

    public String getAavatar() {
        return aavatar;
    }

    public void setAavatar(String aavatar) {
        this.aavatar = aavatar;
    }

    public AgentView(int aid, int mid, String aname, String acontact, String ainfo, String aavatar) {
        this.aid = aid;
        this.mid = mid;
        this.aname = aname;
        this.acontact = acontact;
        this.ainfo = ainfo;
        this.aavatar = aavatar;
    }
}
