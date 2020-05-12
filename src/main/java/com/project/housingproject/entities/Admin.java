package com.project.housingproject.entities;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import javax.persistence.*; //是为了download the package

//建立对数据库的映射
@Entity
@Table(name = "admin")   //assign dataSource解决了can't solve table 'XXX'的问题
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"}) //忽略 handler 和 hibernateLazyInitializer这两个无须json化的属性
public class Admin {

    @Id //主键
    @GeneratedValue(strategy = GenerationType.IDENTITY) //主键生成策略
    @Column(name= "ADMINID")
    int ADMINID; //管理员编号
    String ADMINPASSWORD; //管理员密码


    public int getADMINID() {
        return ADMINID;
    }

    public void setADMINID(int ADMINID) {
        this.ADMINID = ADMINID;
    }

    public String getADMINPASSWORD() {
        return ADMINPASSWORD;
    }

    public void setADMINPASSWORD(String ADMINPASSWORD) {
        this.ADMINPASSWORD = ADMINPASSWORD;
    }



}
