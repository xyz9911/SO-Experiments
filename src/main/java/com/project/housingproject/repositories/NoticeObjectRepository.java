package com.project.housingproject.repositories;

import com.project.housingproject.entities.GroupnoticeEntity;
import com.project.housingproject.entities.NoticeobjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NoticeObjectRepository extends JpaRepository<NoticeobjectEntity,Long> {
    @Query(value="select new GroupnoticeEntity(g.nid,g.usertype,g.ntitle,g.ncontent,g.ndate) from NoticeobjectEntity n inner join GroupnoticeEntity g on n.nid=g.nid where n.id=?1 and g.usertype=?2 and n.isread=?3 order by g.ndate desc")
    List<GroupnoticeEntity> findByIdAndUsertypeAndIsread(int id, Byte userType, Byte isRead);
    NoticeobjectEntity findByIdAndNid(int id,int nId);
}
