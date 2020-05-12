package com.project.housingproject.repositories;

import com.project.housingproject.entities.PersonalnoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PersonalNoticeRepository extends JpaRepository<PersonalnoticeEntity,Long> {
    List<PersonalnoticeEntity> findByIdAndUsertypeOrderByNdateDesc(int id,Byte userType);
    List<PersonalnoticeEntity> findByIdAndUsertypeAndIsreadOrderByNdateDesc(int id,Byte userType,Byte isRead);
    PersonalnoticeEntity findByNid(int nId);
}
