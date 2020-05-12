package com.project.housingproject.impl;


import com.project.housingproject.entities.*;
import com.project.housingproject.*;
import com.project.housingproject.repositories.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//对DAO二次封装，定义具体操作
@Service
@Transactional
public class UserService {
    @Autowired
    UserDAO userDAO;

    public boolean isExist(String uname){//用户是否存在
        User user = getByUNAME(uname);
        return null!= user; //是否存在
    }

    public User getByUNAME(String uname){ //JPA query by name
        return userDAO.findByUNAME(uname);
    }

    public User get(String uname, String upassword){ //JPA query by uname and upassword

        return  userDAO.getByUNAMEAndUPASSWORD(uname,upassword);
    }


    //新增或更新客户信息
    public void addOrUpdate(User user){ //addOrUpdate?
        userDAO.save(user); //注意：save():当主键存在时更新数据，当主键不存在时插入数据。
    }


    //按UID删除某客户信息
    public void deleteByUID(int uid){
        userDAO.deleteByUID(uid);
    }

    //按UID查询某客户信息
    public User findByUID(int uid){
        return userDAO.findByUID(uid);
    }
    //查询所有客户信息
    public List<User> list(){
        return userDAO.findAll();
    }




}
