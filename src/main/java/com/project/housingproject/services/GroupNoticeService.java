package com.project.housingproject.services;

import com.project.housingproject.entities.GroupnoticeEntity;
import com.project.housingproject.entities.NoticeobjectEntity;

import java.util.List;

public interface GroupNoticeService {
    GroupnoticeEntity getNoticeById(int nId);
    List<GroupnoticeEntity> getReadUserNotice(int uId);
    int getUserUnreadNum(int uId);
    int getAgentUnreadNum(int aId);
    List<GroupnoticeEntity> getUnreadUserNotice(int uId);
    List<GroupnoticeEntity> getReadAgentNotice(int aId);
    List<GroupnoticeEntity> getUnreadAgentNotice(int aId);
    NoticeobjectEntity saveNoticeObject(int id,int nid);
    List<NoticeobjectEntity> readNotice(int id,Byte userType);
    GroupnoticeEntity postNotice(Byte userType,String title,String content);
}
