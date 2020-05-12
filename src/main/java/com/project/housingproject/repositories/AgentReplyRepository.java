package com.project.housingproject.repositories;

import com.project.housingproject.entities.AgentreplyEntity;
import com.project.housingproject.entities.UserreplyEntity;
import com.project.housingproject.viewInfo.ReplyView;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AgentReplyRepository extends JpaRepository<AgentreplyEntity,Long> {
    @Query(value="select new com.project.housingproject.viewInfo.ReplyView(a1.rid,a1.pid,a1.aid,a1.rcontent,a1.rdate,a2.aname,a2.aavatar) from AgentreplyEntity a1 inner join AgentEntity a2 on a1.aid=a2.aid where a1.pid=?1 order by a1.rdate asc ")
    List<ReplyView> findByPidOrderByRdateAsc(int pId);
    AgentreplyEntity findByRid(int rId);
    List<AgentreplyEntity> findByAid(int uId);
}
