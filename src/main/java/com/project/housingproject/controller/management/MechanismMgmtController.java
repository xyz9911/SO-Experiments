package com.project.housingproject.controller.management;



import com.project.housingproject.entities.*;
import com.project.housingproject.*;
import com.project.housingproject.impl.MechanismService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class MechanismMgmtController {
    @Autowired
    MechanismService mechanismService;


    //按照AID删除某个经纪人信息
    @CrossOrigin
    @GetMapping("api/adminindex/deletemechanism/{mid}")
    @ResponseBody
    public void deleteByAID(@PathVariable int mid) throws Exception{
        mechanismService.deleteByMID(mid);
    }

    //查询所有信息机构
    @CrossOrigin
    @GetMapping("api/adminindex/searchmechanism") //不加参数
    @ResponseBody
    public List<Mechanism> list() throws Exception{
        return mechanismService.list();
    }

    //根据MID查询机构信息
    @CrossOrigin
    @GetMapping("api//adminindex/searchmechanism/{mid}")
    @ResponseBody
    public List<Mechanism> findByMID(@PathVariable int mid){

        Mechanism mechanism;
        mechanism =  mechanismService.findByMID(mid);
        System.out.println("AID is :"+ mid);
        return Collections.singletonList( mechanism); //OBJECT转List
    }


    //新增机构信息
    @CrossOrigin
    @PostMapping("api/addmechanism")
    @ResponseBody
    public Mechanism add(@RequestBody Mechanism mechanism) throws Exception{
        System.out.println("the result is:"+mechanism.getMID());
        System.out.println("the result is:"+mechanism.getMNAME());
        mechanismService.addOrUpdate(mechanism);
        return mechanism;
    }






    //修改机构信息
    @CrossOrigin
    @PostMapping("api/adminindex/updatemechanism")
    @ResponseBody
    public Mechanism update(@RequestBody Mechanism mechanism) throws Exception{
        System.out.println("the result is:"+mechanism.getMID());
        System.out.println("the result is:"+mechanism.getMNAME());
        mechanismService.addOrUpdate(mechanism);
        return mechanism;
    }







}
