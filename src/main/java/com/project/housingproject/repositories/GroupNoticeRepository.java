package com.project.housingproject.repositories;

import com.project.housingproject.entities.GroupnoticeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GroupNoticeRepository extends JpaRepository<GroupnoticeEntity,Long> {
    GroupnoticeEntity findByNid(int nId);
    @Query(value="select distinct NID from groupnotice where USERTYPE=?1",nativeQuery=true)
    List<Integer> findByUsertype(Byte userType);
}
