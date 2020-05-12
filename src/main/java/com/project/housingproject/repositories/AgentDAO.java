package com.project.housingproject.repositories;

import com.project.housingproject.entities.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AgentDAO extends JpaRepository<Agent,Integer> {
    //使用了 JPA，无需手动构建 SQL 语句，而只需要按照规范提供方法的名字即可实现对数据库的增删改查。

    Agent findByANAME(String aname); //通过姓名查询客户

    Agent getByANAMEAndAPASSWORD(String aname, String apassword); //通过姓名和密码查询客户


    //中介人管理

    //新增中介人
    public Agent save(Agent agent);

    //根据AIDi删除某个经纪人信息
    public void deleteByAID(int aid); //返回值为void


    //通过AID查询中介人
    public Agent findByAID(int aid);
    //查询所有中介人信息
    public List<Agent> findAll();
}
