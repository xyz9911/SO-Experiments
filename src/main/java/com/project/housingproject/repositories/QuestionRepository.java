package com.project.housingproject.repositories;

import com.project.housingproject.entities.QuestionEntity;
import com.project.housingproject.viewInfo.QuestionView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface QuestionRepository extends JpaRepository<QuestionEntity,Long> {
    //Page<QuestionEntity> findByHid(int hId, Pageable pageable);
    @Query(value="select new com.project.housingproject.viewInfo.QuestionView(q.qid,q.uid,q.hid,q.qcontent,u.uavatar,u.uname) from QuestionEntity q inner join UserEntity u on q.uid=u.uid where q.hid=?1")
    Page<QuestionView> findByHid(int hId,Pageable pageable);
}
