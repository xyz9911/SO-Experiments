package com.project.housingproject.impl;

import com.project.housingproject.entities.AgentEntity;
import com.project.housingproject.entities.MessageEntity;
import com.project.housingproject.entities.UserEntity;
import com.project.housingproject.repositories.AgentRepository;
import com.project.housingproject.repositories.MessageRepository;
import com.project.housingproject.repositories.UserRepository;
import com.project.housingproject.services.MessageService;
import com.project.housingproject.viewInfo.AgentView;
import com.project.housingproject.viewInfo.UserView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageRepository messageRepository;

    @Autowired
    private AgentRepository agentRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<MessageEntity> getMessages(int aId, int uId) {
        return messageRepository.findByUidAndAidOrderByMdateDesc(uId,aId);
    }

    @Override
    public List<AgentView> getUnreadAgents(int uId) {
        Byte unread=0,send=1;
        AgentEntity agentEntity;
        List<AgentView> unreadAgentViews=new ArrayList<>();
        List<Integer> unReadMessages=messageRepository.findAidByUid(uId,unread,send);
        for(Integer aId:unReadMessages){
            agentEntity=agentRepository.findByAid(aId);
            unreadAgentViews.add(new AgentView(agentEntity.getAid(),agentEntity.getMid(),agentEntity.getAname(),agentEntity.getAcontact(),agentEntity.getAinfo(),agentEntity.getAavatar()));
        }
        return unreadAgentViews;
    }

    @Override
    public List<AgentView> getreadAgents(int uId) {
        Byte read=1,send=1;
        AgentEntity agentEntity;
        List<AgentView> readAgentViews=new ArrayList<>();
        List<Integer> ReadMessages=messageRepository.findAidByUid(uId,read,send);
        for(Integer aId:ReadMessages){
            agentEntity=agentRepository.findByAid(aId);
            readAgentViews.add(new AgentView(agentEntity.getAid(),agentEntity.getMid(),agentEntity.getAname(),agentEntity.getAcontact(),agentEntity.getAinfo(),agentEntity.getAavatar()));
        }
        return readAgentViews;
    }

    @Override
    public List<UserView> getUnreadUsers(int aId) {
        Byte unread=0,send=0;
        UserEntity userEntity;
        List<UserView> unreadUserViews=new ArrayList<>();
        List<Integer> unreadMessages=messageRepository.findUidByAid(aId,unread,send);
        for(Integer uId:unreadMessages){
            userEntity=userRepository.findByUid(uId);
            unreadUserViews.add(new UserView(userEntity.getUid(),userEntity.getUname(),userEntity.getUgender(),userEntity.getUcontact(),userEntity.getUavatar()));
        }
        return unreadUserViews;
    }

    @Override
    public List<UserView> getreadUsers(int aId) {
        Byte read=1,send=0;
        UserEntity userEntity;
        List<UserView> readUserViews=new ArrayList<>();
        List<Integer> readMessages=messageRepository.findUidByAid(aId,read,send);
        for(Integer uId:readMessages){
            userEntity=userRepository.findByUid(uId);
            readUserViews.add(new UserView(userEntity.getUid(),userEntity.getUname(),userEntity.getUgender(),userEntity.getUcontact(),userEntity.getUavatar()));
        }
        return readUserViews;
    }

    @Override
    public MessageEntity userSendMessage(int uId, int targetAid, String content) {
        Byte send=0,read=0;//用户发送消息为0
        return getMessageEntity(targetAid, uId, content, send, read);
    }

    @Override
    public MessageEntity agentSendMessage(int aId, int targetUid, String content) {
        Byte send=1,read=0;//经纪人发送消息为1
        return getMessageEntity(aId, targetUid, content, send, read);
    }

    private MessageEntity getMessageEntity(int aId, int targetUid, String content, Byte send, Byte read) {
        MessageEntity messageEntity=new MessageEntity();
        messageEntity.setUid(targetUid);
        messageEntity.setAid(aId);
        messageEntity.setSendorreceive(send);
        messageEntity.setIsread(read);
        messageEntity.setMcontent(content);
        messageEntity.setMdate(new Timestamp(System.currentTimeMillis()));
        return messageRepository.save(messageEntity);
    }

    //用户发送 为0
    @Override
    public List<MessageEntity> userReadMessages(int uId, int aId) {
        Byte send=1,read=1;
        List<MessageEntity> messageEntities=messageRepository.findByUidAndAidAndSendorreceive(uId,aId,send);
        for(MessageEntity messageEntity:messageEntities)
        {
            messageEntity.setIsread(read);
        }
        return messageRepository.saveAll(messageEntities);
    }

    //经纪人发送 为1
    @Override
    public List<MessageEntity> AgentReadMessages(int aId, int uId) {
        Byte send=0,read=1;
        List<MessageEntity> messageEntities=messageRepository.findByUidAndAidAndSendorreceive(uId,aId,send);
        for(MessageEntity messageEntity:messageEntities)
        {
            messageEntity.setIsread(read);
        }
        return messageRepository.saveAll(messageEntities);
    }

    @Override
    public int getUserUnreadNum(int uId) {
        Byte unread=0,send=1;
        List<Integer> unReadMessages=messageRepository.findAidByUid(uId,unread,send);
        return unReadMessages.size();
    }

    @Override
    public int getAgentUnreadNum(int aId) {
        Byte unread=0,send=0;
        List<Integer> unReadMessages=messageRepository.findUidByAid(aId,unread,send);
        return unReadMessages.size();
    }
}
