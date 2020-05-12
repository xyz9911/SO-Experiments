package com.project.housingproject.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*; //是为了download the package

//建立对数据库的映射
@Entity
@Table(name = "user")   //assign dataSource解决了can't solve table 'XXX'的问题
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"}) //忽略 handler 和 hibernateLazyInitializer这两个无须json化的属性
public class User {


    @Id //主键
    @Column(name= "UID")

    int UID; //客户编号
    String UNAME; //客户姓名
    String UPASSWORD; //客户密码
    int UVALIDSTATUS; //审核状态 0代表在黑名单
    int UGENDER;
    String UCONTACT; //联系方式
    String UDISTRICT; //地区
    String UAVATAR; //客户头像

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public String getUNAME() {
        return UNAME;
    }

    public void setUNAME(String UNAME) {
        this.UNAME = UNAME;
    }

    public String getUPASSWORD() {
        return UPASSWORD;
    }

    public void setUPASSWORD(String UPASSWORD) {
        this.UPASSWORD = UPASSWORD;
    }

    public int getUVALIDSTATUS() {
        return UVALIDSTATUS;
    }

    public void setUVALIDSTATUS(int UVALIDSTATUS) {
        this.UVALIDSTATUS = UVALIDSTATUS;
    }

    public int getUGENDER() {
        return UGENDER;
    }

    public void setUGENDER(int UGENDER) {
        this.UGENDER = UGENDER;
    }

    public String getUCONTACT() {
        return UCONTACT;
    }

    public void setUCONTACT(String UCONTACT) {
        this.UCONTACT = UCONTACT;
    }

    public String getUDISTRICT() {
        return UDISTRICT;
    }

    public void setUDISTRICT(String UDISTRICT) {
        this.UDISTRICT = UDISTRICT;
    }

    public String getUAVATAR() {
        return UAVATAR;
    }

    public void setUAVATAR(String UAVATAR) {
        this.UAVATAR = UAVATAR;
    }
}
