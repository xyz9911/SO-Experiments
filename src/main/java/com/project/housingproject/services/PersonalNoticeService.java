package com.project.housingproject.services;

import com.project.housingproject.entities.PersonalnoticeEntity;

import java.util.List;

public interface PersonalNoticeService {
    List<PersonalnoticeEntity> getReadUserNotice(int uId);
    List<PersonalnoticeEntity> getUnreadUserNotice(int uId);
    List<PersonalnoticeEntity> getReadAgentNotice(int aId);
    List<PersonalnoticeEntity> getUnreadAgentNotice(int aId);
    int getUserUnreadNum(int uId);
    int getAgentUnreadNum(int aId);
    PersonalnoticeEntity saveAgentNotice(int aId,String title,String content);
    PersonalnoticeEntity saveUserNotice(int uId,String title,String content);
    PersonalnoticeEntity readNotice(int nId);
    void favouriteHouseNotice(int hId);
}
