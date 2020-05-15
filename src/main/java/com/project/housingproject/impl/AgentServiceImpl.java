package com.project.housingproject.impl;

import com.project.housingproject.entities.AgentEntity;
import com.project.housingproject.entities.AgentratingEntity;
import com.project.housingproject.repositories.AgentRatingRepository;
import com.project.housingproject.repositories.AgentRepository;
import com.project.housingproject.services.AgentService;
import com.project.housingproject.viewInfo.AgentView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class AgentServiceImpl implements AgentService {
    @Autowired
    private AgentRepository agentRepository;

    @Autowired
    private AgentRatingRepository agentRatingRepository;

    @Override
    public AgentEntity getAgentById(int aId) {
        return agentRepository.findByAid(aId);
    }

    @Override
    public Page<AgentEntity> getAgentByMedium(int mId, int pageNum) {
        PageRequest pageRequest = PageRequest.of(pageNum, 20);
        return agentRepository.findByMid(mId,pageRequest);
    }

    @Override
    public Page<AgentEntity> getAgentByName(String aName, int pageNum) {
        PageRequest pageRequest = PageRequest.of(pageNum, 20);
        return agentRepository.findByAnameContains(aName,pageRequest);
    }

    @Override
    public Page<AgentEntity> getAgentByValidStatus(byte status, int pageNum) {
        PageRequest pageRequest = PageRequest.of(pageNum, 20);
        return agentRepository.findByAvalidstatus(status,pageRequest);
    }

    @Override
    public Page<AgentEntity> getAgentByVerifyStatus(byte status, int pageNum) {
        PageRequest pageRequest = PageRequest.of(pageNum, 20);
        return agentRepository.findByAverifystatus(status,pageRequest);
    }

    @Override
    public Page<AgentratingEntity> getAgentRatings(int aId, Pageable pageable) {
        return agentRatingRepository.findByAid(aId,pageable);
    }

    @Override
    public AgentratingEntity saveAgentRating(AgentratingEntity agentratingEntity) {
        return agentRatingRepository.save(agentratingEntity);
    }

    @Override
    public AgentView getAgentViewById(int aId) {
        AgentEntity agentEntity=agentRepository.findByAid(aId);
        return new AgentView(aId,agentEntity.getMid(),agentEntity.getAname(), agentEntity.getAcontact(),agentEntity.getAinfo(),agentEntity.getAavatar());
    }

    @Override
    public AgentView getAgentViewByName(String name) {
        return agentRepository.findByAname(name);
    }
}
