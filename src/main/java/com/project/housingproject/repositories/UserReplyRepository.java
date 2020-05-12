package com.project.housingproject.repositories;

import com.project.housingproject.entities.UserreplyEntity;
import com.project.housingproject.viewInfo.ReplyView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserReplyRepository extends JpaRepository<UserreplyEntity,Long> {
    @Query(value="select new com.project.housingproject.viewInfo.ReplyView(u1.rid,u1.pid,u1.uid,u1.rcontent,u1.rdate,u2.uname,u2.uavatar) from UserreplyEntity u1 inner join UserEntity u2 on u1.uid=u2.uid where u1.pid=?1 order by u1.rdate asc ")
    List<ReplyView> findByPidOrderByRdateAsc(int pId);
    UserreplyEntity findByRid(int rId);
    List<UserreplyEntity> findByUid(int uId);
}
