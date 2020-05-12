package com.project.housingproject.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "medium")   //assign dataSource解决了can't solve table 'XXX'的问题
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"}) //忽略 handler 和 hibernateLazyInitializer这两个无须json化的属性
public class Mechanism {
    @Id //主键
    @Column(name= "MID")
    int MID; //机构编号
    String MNAME;
    @Basic
    @Column(name = "MADDRESS", nullable = false, length = 255)
    String MDISTRICT; //地址
    String MCONTACT; //联系
    String MVERIFYSTATUS; //审核状态

    public int getMID() {
        return MID;
    }

    public void setMID(int MID) {
        this.MID = MID;
    }

    public String getMNAME() {
        return MNAME;
    }

    public void setMNAME(String MNAME) {
        this.MNAME = MNAME;
    }

    public String getMDISTRICT() {
        return MDISTRICT;
    }

    public void setMDISTRICT(String MDISTRICT) {
        this.MDISTRICT = MDISTRICT;
    }

    public String getMCONTACT() {
        return MCONTACT;
    }

    public void setMCONTACT(String MCONTACT) {
        this.MCONTACT = MCONTACT;
    }

    public String getMVERIFYSTATUS() {
        return MVERIFYSTATUS;
    }

    public void setMVERIFYSTATUS(String MVERIFYSTATUS) {
        this.MVERIFYSTATUS = MVERIFYSTATUS;
    }
}
