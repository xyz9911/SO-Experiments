package com.project.housingproject.controller.management;



import com.project.housingproject.entities.*;
import com.project.housingproject.impl.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class AgentMgmtController {
    @Autowired
    AgentService agentService;


    //按照AID删除某个经纪人信息
    @CrossOrigin
    @GetMapping("api/adminindex/deleteagent/{aid}")
    @ResponseBody
    public void deleteByAID(@PathVariable int aid) throws Exception{
        agentService.deleteByAID(aid);
    }

    //查询所有经纪人信息
    @CrossOrigin
    @GetMapping("api/adminindex/searchagent") //不加参数
    @ResponseBody
    public List<Agent> list() throws Exception{
        return agentService.list();
    }

    //根据AID查询经纪人信息
    @CrossOrigin
    @GetMapping("api//adminindex/searchagent/{aid}")
    @ResponseBody
    public List<Agent> findByUID(@PathVariable int aid){

        Agent agent;
        agent = agentService.findByAID(aid);
        System.out.println("AID is :"+ aid);
        return Collections.singletonList(agent); //OBJECT转List
    }




    //新增或更新经纪人信息
    @CrossOrigin
    @PostMapping("api/agentregister")
    @ResponseBody
    public Agent add(@RequestBody Agent agent) throws Exception{
        System.out.println("the result is:"+agent.getAID());
        System.out.println("the result is:"+agent.getANAME());
        agentService.addOrUpdate(agent);
        return agent;
    }


    //修改经纪人信息
    @CrossOrigin
    @PostMapping("api/adminindex/updateagent")
    @ResponseBody
    public Agent update(@RequestBody Agent agent) throws Exception{
        System.out.println("the result is:"+agent.getAID());
        System.out.println("the result is:"+agent.getANAME());
        agentService.addOrUpdate(agent);
        return agent;
    }







}
