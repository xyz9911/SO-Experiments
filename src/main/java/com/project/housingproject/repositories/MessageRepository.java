package com.project.housingproject.repositories;

import com.project.housingproject.entities.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MessageRepository extends JpaRepository<MessageEntity,Long> {
    List<MessageEntity> findByUidAndAidOrderByMdateDesc(int uId,int aId);
    @Query(value="select distinct AID from message where UID=?1 and ISREAD=?2 and SENDORRECEIVE =?3",nativeQuery=true)
    List<Integer> findAidByUid(int uId,Byte read,Byte send);
    @Query(value="select distinct UID from message where AID=?1 and ISREAD=?2 and SENDORRECEIVE =?3",nativeQuery=true)
    List<Integer> findUidByAid(int aId,Byte read,Byte send);
    List<MessageEntity> findByUidAndAidAndSendorreceive(int uId,int aId,Byte sendOrReceive);
}
