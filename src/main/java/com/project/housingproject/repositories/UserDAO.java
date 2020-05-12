package com.project.housingproject.repositories;

import com.project.housingproject.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDAO extends JpaRepository<User,Integer> {
    //使用了 JPA，无需手动构建 SQL 语句，而只需要按照规范提供方法的名字即可实现对数据库的增删改查。

    User findByUNAME(String uname); //通过姓名查询客户

    User getByUNAMEAndUPASSWORD(String uname, String upassword); //通过姓名和密码查询客户

    //客户管理

    //新增客户
    public User save(User user);

    //根据UID删除某个客户信息
    public void deleteByUID(int id);

    //通过UID查询客户
    public User findByUID(int id);
    //查询所有客户信息
    public List<User> findAll();



}
