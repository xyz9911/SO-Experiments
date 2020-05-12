package com.project.housingproject.repositories;

import com.project.housingproject.entities.Mechanism;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MechanismDAO extends JpaRepository<Mechanism,Integer> {
    //使用了 JPA，无需手动构建 SQL 语句，而只需要按照规范提供方法的名字即可实现对数据库的增删改查。


    //新增机构
    public Mechanism save(Mechanism mechanism);

    //根据MID删除
    public void deleteByMID(int mid); //返回值为void


    //通过AID查询中介人
    public Mechanism findByMID(int mid);
    //查询所有中介人信息
    public List<Mechanism> findAll();
}
