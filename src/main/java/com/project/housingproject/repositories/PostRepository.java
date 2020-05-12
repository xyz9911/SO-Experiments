package com.project.housingproject.repositories;

import com.project.housingproject.entities.PostEntity;
import com.project.housingproject.viewInfo.PostView;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PostRepository extends JpaRepository<PostEntity,Long> {
    PostEntity findByPid(int pId);
    Page<PostEntity> findByPtitleContains(String key,Pageable pageable);
    @Query(value="select new com.project.housingproject.viewInfo.PostView(p.pid,p.uid,p.ptitle,p.pcontent,p.pdate,u.uname,u.uavatar) from PostEntity p inner join UserEntity u on p.uid=u.uid where p.pvalidstatus=1 order by p.pdate desc")
    Page<PostView> findByOrderByPdateDesc(Pageable pageable);
    @Query(value="select new com.project.housingproject.viewInfo.PostView(p.pid,p.uid,p.ptitle,p.pcontent,p.pdate,u.uname,u.uavatar) from PostEntity p inner join UserEntity u on p.uid=u.uid where p.pid=?1 and p.pvalidstatus=1")
    PostView findViewByPid(int pId);
    List<PostEntity> findByUid(int uId);
}
