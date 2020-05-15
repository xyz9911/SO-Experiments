package com.project.housingproject.services;

import com.project.housingproject.entities.AgentEntity;
import com.project.housingproject.entities.AgentratingEntity;
import com.project.housingproject.viewInfo.AgentView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface AgentService {
    AgentEntity getAgentById(int aId);
    Page<AgentEntity> getAgentByMedium(int mId, int pageNum);
    Page<AgentEntity> getAgentByName(String aName,int pageNum);
    Page<AgentEntity> getAgentByValidStatus(byte status,int pageNum);
    Page<AgentEntity> getAgentByVerifyStatus(byte status,int pageNum);
    Page<AgentratingEntity> getAgentRatings(int aId, Pageable pageable);
    AgentratingEntity saveAgentRating(AgentratingEntity agentratingEntity);
    AgentView getAgentViewById(int aId);
    AgentView getAgentViewByName(String name);
}
