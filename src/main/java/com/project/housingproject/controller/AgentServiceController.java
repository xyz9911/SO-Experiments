package com.project.housingproject.controller;

import com.project.housingproject.entities.AgentratingEntity;
import com.project.housingproject.postitems.AgentRatePost;
import com.project.housingproject.services.AgentService;
import com.project.housingproject.viewInfo.AgentView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;

@RestController
public class AgentServiceController {
    @Autowired
    private AgentService agentService;

    //已部署
    @RequestMapping(value = "agent/rating/{page}",method = RequestMethod.GET)
    public Page<AgentratingEntity> showAgentRatings(@RequestParam("aid")int aId, @PathVariable("page")int pageNum){
        PageRequest pageRequest = PageRequest.of(pageNum, 10);
        return agentService.getAgentRatings(aId,pageRequest);
    }

    //已部署
    @RequestMapping(value = "agent/rating",method = RequestMethod.POST)
    public AgentratingEntity postRating(@RequestBody AgentRatePost agentRatePost){
        AgentratingEntity agentratingEntity=new AgentratingEntity();
        agentratingEntity.setAid(agentRatePost.aid);
        agentratingEntity.setArating(agentRatePost.arating);
        agentratingEntity.setAcomment(agentRatePost.acomment);
        agentratingEntity.setUid(agentRatePost.uid);
        agentratingEntity.setAdate(new Timestamp(System.currentTimeMillis()));
        return agentService.saveAgentRating(agentratingEntity);
    }

    //已部署
    @RequestMapping(value = "agent/{aid}",method = RequestMethod.GET)
    public AgentView showAgent(@PathVariable("aid")int aid){
        return agentService.getAgentViewById(aid);
    }

    @RequestMapping(value = "agent/name",method = RequestMethod.GET)
    public AgentView showAgentByName(@RequestParam("aname")String aname){
        return agentService.getAgentViewByName(aname);
    }
}
