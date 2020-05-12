package com.project.housingproject.impl;



import com.project.housingproject.entities.*;
import com.project.housingproject.repositories.MechanismDAO;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//对DAO二次封装，定义具体操作
@Service
@Transactional
public class MechanismService {
    @Autowired
    MechanismDAO mechanismDAO;

    //新增或更新中介人信息
    public void addOrUpdate(Mechanism mechanism){
        mechanismDAO.save(mechanism); //注意：save():当主键存在时更新数据，当主键不存在时插入数据。
    }

    //按agentId interId删除某中介人信息
    public void deleteByMID(int mid){
        mechanismDAO.deleteByMID(mid);
    }

    //按AID查询某中介人信息
    public Mechanism findByMID(int mid){
        return mechanismDAO.findByMID(mid);
    }
    //查询所有中介人信息
    public List<Mechanism> list(){
        return mechanismDAO.findAll();
    }

}
