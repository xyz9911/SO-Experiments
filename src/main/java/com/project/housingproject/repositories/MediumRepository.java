package com.project.housingproject.repositories;

import com.project.housingproject.entities.MediumEntity;
import com.project.housingproject.entities.MediumauditEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediumRepository extends JpaRepository<MediumEntity,Long> {
    MediumEntity findByMid(int mId);
    Page<MediumEntity> findByMnameContains(String mName, Pageable pageable);
    Page<MediumEntity> findByMaddressContains(String mAddress,Pageable pageable);
    Page<MediumEntity> findByMverifystatus(byte status,Pageable pageable);
}
