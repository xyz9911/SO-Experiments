package com.project.housingproject.controller;

import com.project.housingproject.entities.MessageEntity;
import com.project.housingproject.postitems.MessagePost;
import com.project.housingproject.services.MessageService;
import com.project.housingproject.viewInfo.AgentView;
import com.project.housingproject.viewInfo.UserView;
import org.hibernate.hql.spi.id.cte.CteValuesListUpdateHandlerImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class MessageServiceController {
    @Autowired
    private MessageService messageService;

    @RequestMapping(value = "messages/{uId}/{aId}",method = RequestMethod.GET)
    public List<MessageEntity> showAllMessages(@PathVariable("uId")int uId,@PathVariable("aId")int aId){
        return messageService.getMessages(aId,uId);
    }

    @RequestMapping(value = "messages/user/unread/{uId}",method = RequestMethod.GET)
    public List<AgentView> showUnreadAgents(@PathVariable("uId")int uId){
        return messageService.getUnreadAgents(uId);
    }

    @RequestMapping(value = "messages/user/read/{uId}",method = RequestMethod.GET)
    public List<AgentView> showReadAgents(@PathVariable("uId")int uId){
        return messageService.getreadAgents(uId);
    }

    @RequestMapping(value = "messages/agent/read/{aId}",method = RequestMethod.GET)
    public List<UserView> showReadUsers(@PathVariable("aId")int aId){
        return messageService.getreadUsers(aId);
    }

    @RequestMapping(value = "messages/agent/unread/{aId}",method = RequestMethod.GET)
    public List<UserView> showUnreadUsers(@PathVariable("aId")int aId){
        return messageService.getUnreadUsers(aId);
    }

    @RequestMapping(value = "messages/user",method = RequestMethod.POST)
    MessageEntity userSendMessage(@RequestBody MessagePost messagePost){
        return messageService.userSendMessage(messagePost.id,messagePost.targetId,messagePost.content);
    }

    @RequestMapping(value = "messages/agent",method = RequestMethod.POST)
    MessageEntity agentSendMessage(@RequestBody MessagePost messagePost){
        return messageService.agentSendMessage(messagePost.id,messagePost.targetId,messagePost.content);
    }

    @RequestMapping(value = "messages/user/read",method = RequestMethod.PUT)
    List<MessageEntity> userReadMessages(@RequestParam("uid")int uid,@RequestParam("aid")int aid){
        return messageService.userReadMessages(uid,aid);
    }

    @RequestMapping(value = "messages/agent/read",method = RequestMethod.PUT)
    List<MessageEntity> agentReadMessages(@RequestParam("aid")int aid,@RequestParam("uid")int uid){
        return messageService.AgentReadMessages(aid,uid);
    }

    @RequestMapping(value = "user/unreadNum/{uid}",method = RequestMethod.GET)
    int getUserUnreadNum(@PathVariable("uid")int uid){
        return messageService.getUserUnreadNum(uid);
    }

    @RequestMapping(value = "agent/unreadNum/{aid}",method = RequestMethod.GET)
    int getAgentUnreadNum(@PathVariable("aid")int aid){
        return messageService.getAgentUnreadNum(aid);
    }
}
