package com.project.housingproject.repositories;

import com.project.housingproject.entities.CoordinateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoordinateRepository extends JpaRepository<CoordinateEntity,Long> {
    CoordinateEntity findByEid(int eid);
}
