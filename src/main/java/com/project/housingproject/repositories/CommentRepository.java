package com.project.housingproject.repositories;

import com.project.housingproject.entities.CommentEntity;
import com.project.housingproject.viewInfo.CommentView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentRepository extends JpaRepository<CommentEntity,Long> {
    CommentEntity findByCid(int cId);
    @Query(value = "select new com.project.housingproject.viewInfo.CommentView(c.cid,c.eid,c.uid,c.ccontent,c.crating,c.cdate,u.uname,u.uavatar) from CommentEntity c inner join UserEntity u on c.uid=u.uid where c.eid=?1 and c.cvalidstatus=1 order by  c.cdate desc ")
    Page<CommentView> findByEid(int eId,Pageable pageable);
    List<CommentEntity> findByUidAndCvalidstatus(int uId,Byte status);
}
