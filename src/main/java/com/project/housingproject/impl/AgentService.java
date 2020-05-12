package com.project.housingproject.impl;


import com.project.housingproject.entities.*;
import com.project.housingproject.*;
import com.project.housingproject.repositories.AgentDAO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//对DAO二次封装，定义具体操作
@Service
@Transactional
public class AgentService {
    @Autowired
    AgentDAO agentDAO;

    public boolean isExist(String aname){//用户是否存在
        Agent agent = getByANAME(aname);
        return null!= agent; //是否存在
    }

    public Agent getByANAME(String aname){ //JPA query by name
        return agentDAO.findByANAME(aname);
    }

    public Agent get(String aname, String apassword){ //JPA query by name and password

        return  agentDAO.getByANAMEAndAPASSWORD(aname,apassword);
    }


    //新增或更新中介人信息
    public void addOrUpdate(Agent agent){
        agentDAO.save(agent); //注意：save():当主键存在时更新数据，当主键不存在时插入数据。
    }

    //按agentId interId删除某中介人信息
    public void deleteByAID(int aid){
        agentDAO.deleteByAID(aid);
    }

    //按AID查询某中介人信息
    public Agent findByAID(int aid){
        return agentDAO.findByAID(aid);
    }
    //查询所有中介人信息
    public List<Agent> list(){
        return agentDAO.findAll();
    }





}
