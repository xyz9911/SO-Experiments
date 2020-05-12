package com.project.housingproject.impl;


import com.project.housingproject.repositories.*;
import com.project.housingproject.entities.*;
import com.project.housingproject.repositories.AdminDAO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

//对DAO二次封装，定义具体操作
@Service
public class AdminService {
    @Autowired
    AdminDAO adminDAO;

    //此管理员是否存在
    public boolean isExist(int adminid){
        Admin admin = getByADMINID(adminid);
        return null!= admin;
    }
    //通过用户名查询管理员信息，用于登录
    public Admin getByADMINID(int adminid){
        return adminDAO.findByADMINID(adminid);
    }
    //通过用户名和密码查询管理员信息，用于登录
    public Admin get(int adminid, String password){

        return  adminDAO.getByADMINIDAndADMINPASSWORD(adminid,password);
    }










}
