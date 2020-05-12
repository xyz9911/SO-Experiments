package com.project.housingproject.repositories;

import com.project.housingproject.entities.AgentratingEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRatingRepository extends JpaRepository<AgentratingEntity,Long> {
    Page<AgentratingEntity> findByAid(int aId, Pageable pageable);
}
