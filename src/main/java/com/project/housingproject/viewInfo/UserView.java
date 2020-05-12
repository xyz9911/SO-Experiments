package com.project.housingproject.viewInfo;

public class UserView {
    private int uid;
    private String uname;
    private Byte ugender;
    private String ucontact;
    private String uavatar;

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Byte getUgender() {
        return ugender;
    }

    public void setUgender(Byte ugender) {
        this.ugender = ugender;
    }

    public String getUcontact() {
        return ucontact;
    }

    public void setUcontact(String ucontact) {
        this.ucontact = ucontact;
    }

    public String getUavatar() {
        return uavatar;
    }

    public void setUavatar(String uavatar) {
        this.uavatar = uavatar;
    }

    public UserView(int uid, String uname, Byte ugender, String ucontact, String uavatar) {
        this.uid = uid;
        this.uname = uname;
        this.ugender = ugender;
        this.ucontact = ucontact;
        this.uavatar = uavatar;
    }
}
