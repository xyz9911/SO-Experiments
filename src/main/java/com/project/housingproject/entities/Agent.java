package com.project.housingproject.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*; //是为了download the package

//建立对数据库的映射
@Entity
@Table(name = "agent")   //assign dataSource解决了can't solve table 'XXX'的问题
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"}) //忽略 handler 和 hibernateLazyInitializer这两个无须json化的属性
public class Agent {

    @Id //主键
    @Column(name= "AID")
    int AID; //经纪人编号
    int MID; //经纪机构编号
    String ANAME; //经纪人姓名
    String APASSWORD; //经纪人密码
    String ACONTACT; //经纪人联系方式
    int AVERIFYSTATUS; //经纪人审核状态 1代表审核成功 默认未审核通过
    int AVALIDSTATUS; //经纪人封禁状态 0代表被封禁 默认不在黑名单
    String AINFO; //经纪人简介
    String AAVATAR; //经纪人头像

    public int getAID() {
        return AID;
    }

    public void setAID(int AID) {
        this.AID = AID;
    }

    public int getMID() {
        return MID;
    }

    public void setMID(int MID) {
        this.MID = MID;
    }

    public String getANAME() {
        return ANAME;
    }

    public void setANAME(String ANAME) {
        this.ANAME = ANAME;
    }

    public String getAPASSWORD() {
        return APASSWORD;
    }

    public void setAPASSWORD(String APASSWORD) {
        this.APASSWORD = APASSWORD;
    }

    public String getACONTACT() {
        return ACONTACT;
    }

    public void setACONTACT(String ACONTACT) {
        this.ACONTACT = ACONTACT;
    }

    public int getAVERIFYSTATUS() {
        return AVERIFYSTATUS;
    }

    public void setAVERIFYSTATUS(int AVERIFYSTATUS) {
        this.AVERIFYSTATUS = AVERIFYSTATUS;
    }

    public int getAVALIDSTATUS() {
        return AVALIDSTATUS;
    }

    public void setAVALIDSTATUS(int AVALIDSTATUS) {
        this.AVALIDSTATUS = AVALIDSTATUS;
    }

    public String getAINFO() {
        return AINFO;
    }

    public void setAINFO(String AINFO) {
        this.AINFO = AINFO;
    }

    public String getAAVATAR() {
        return AAVATAR;
    }

    public void setAAVATAR(String AAVATAR) {
        this.AAVATAR = AAVATAR;
    }
}
