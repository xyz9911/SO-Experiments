package com.module.interaction.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import com.module.interaction.CommentEntity;

import java.util.List;


public interface CommentRepository extends JpaRepository<CommentEntity,Long> {
    List<CommentEntity> findByHIdAndEId(int hId, int eId);
    List<CommentEntity> findByUId(int uId);
    Page<CommentEntity> findByHIdAndEId(int hId,int eId,Pageable pageable);
}
