package com.project.housingproject.repositories;

import com.project.housingproject.entities.EstateEntity;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstateRepository extends JpaRepository<EstateEntity,Long> {
    Page<EstateEntity> findByEnameContains(String eName, Pageable pageable);
    Page<EstateEntity> findByEaddressContains(String eAddress,Pageable pageable);
    Page<EstateEntity> findByEnameContainsAndEaddressContains(String eName,String eAddress,Pageable pageable);
    EstateEntity findByEid(int eId);
    Page<EstateEntity> findByEavgpriceBetween(int minimum,int maximum,Pageable pageable);
}
