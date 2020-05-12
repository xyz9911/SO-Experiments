package com.project.housingproject.repositories;

import com.project.housingproject.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminDAO extends JpaRepository<Admin,Integer> {
    //使用了 JPA，无需手动构建 SQL 语句，而只需要按照规范提供方法的名字即可实现对数据库的增删改查。

    Admin findByADMINID(int adminid); //通过id查询管理员

    Admin getByADMINIDAndADMINPASSWORD(int adminid, String adminpassword); //通过姓名和密码查询管理员

    //todo


}
