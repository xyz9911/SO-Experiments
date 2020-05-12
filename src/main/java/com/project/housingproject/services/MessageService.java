package com.project.housingproject.services;

import com.project.housingproject.entities.MessageEntity;
import com.project.housingproject.viewInfo.AgentView;
import com.project.housingproject.viewInfo.UserView;

import java.util.List;
import java.util.Map;

public interface MessageService {
    int getUserUnreadNum(int uId);
    int getAgentUnreadNum(int aId);
    List<MessageEntity> getMessages(int aId,int uId);
    List<AgentView> getUnreadAgents(int uId);
    List<AgentView> getreadAgents(int uId);
    List<UserView> getUnreadUsers(int aId);
    List<UserView> getreadUsers(int aId);
    MessageEntity userSendMessage(int uId,int targetAid,String content);
    MessageEntity agentSendMessage(int aId,int targetUid,String content);
    List<MessageEntity> userReadMessages(int uId,int aId);
    List<MessageEntity> AgentReadMessages(int aId,int uId);
}
