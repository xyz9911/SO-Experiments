package com.project.housingproject.repositories;

import com.project.housingproject.entities.AgentEntity;
import com.project.housingproject.viewInfo.AgentView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AgentRepository extends JpaRepository<AgentEntity,Long> {
    @Query(value="select distinct AID from agent",nativeQuery=true)
    List<Integer> findDistinctAid();
    AgentEntity findByAid(int aId);
    Page<AgentEntity> findByMid(int mId, Pageable pageable);
    Page<AgentEntity> findByAnameContains(String aName,Pageable pageable);
    Page<AgentEntity> findByAvalidstatus(byte status,Pageable pageable);
    Page<AgentEntity> findByAverifystatus(byte status,Pageable pageable);
}
