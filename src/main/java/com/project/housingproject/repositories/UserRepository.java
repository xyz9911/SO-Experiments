package com.project.housingproject.repositories;

import com.project.housingproject.entities.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Long> {
    @Query(value="select distinct UID from user",nativeQuery=true)
    List<Integer> findDistinctUid();
    UserEntity findByUid(int uId);
    Page<UserEntity> findByUvalidstatus(byte status, Pageable pageable);
}
