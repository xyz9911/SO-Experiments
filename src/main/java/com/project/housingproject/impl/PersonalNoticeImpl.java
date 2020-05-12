package com.project.housingproject.impl;

import com.project.housingproject.entities.FavouriteEntity;
import com.project.housingproject.entities.HouseEntity;
import com.project.housingproject.entities.PersonalnoticeEntity;
import com.project.housingproject.repositories.FavouriteRepository;
import com.project.housingproject.repositories.HouseRepository;
import com.project.housingproject.repositories.PersonalNoticeRepository;
import com.project.housingproject.services.PersonalNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class PersonalNoticeImpl implements PersonalNoticeService {

    @Autowired
    private PersonalNoticeRepository personalNoticeRepository;

    @Autowired
    private FavouriteRepository favouriteRepository;

    @Autowired
    private HouseRepository houseRepository;

    @Override
    public List<PersonalnoticeEntity> getReadUserNotice(int uId) {
        Byte type=0,read=1;
        return personalNoticeRepository.findByIdAndUsertypeAndIsreadOrderByNdateDesc(uId,type,read);
    }

    @Override
    public List<PersonalnoticeEntity> getUnreadUserNotice(int uId) {
        Byte type=0,read=0;
        return personalNoticeRepository.findByIdAndUsertypeAndIsreadOrderByNdateDesc(uId,type,read);
    }

    @Override
    public List<PersonalnoticeEntity> getReadAgentNotice(int aId) {
        Byte type=1,read=1;
        return personalNoticeRepository.findByIdAndUsertypeAndIsreadOrderByNdateDesc(aId,type,read);
    }

    @Override
    public List<PersonalnoticeEntity> getUnreadAgentNotice(int aId) {
        Byte type=1,read=0;
        return personalNoticeRepository.findByIdAndUsertypeAndIsreadOrderByNdateDesc(aId,type,read);
    }

    @Override
    public PersonalnoticeEntity saveAgentNotice(int aId, String title, String content) {
        Byte type=1,read=0;
        return getPersonalnoticeEntity(aId, title, content, type, read);
    }

    @Override
    public PersonalnoticeEntity saveUserNotice(int uId, String title, String content) {
        Byte type=0,read=0;
        return getPersonalnoticeEntity(uId, title, content, type, read);
    }

    private PersonalnoticeEntity getPersonalnoticeEntity(int uId, String title, String content, Byte type, Byte read) {
        PersonalnoticeEntity personalnoticeEntity=new PersonalnoticeEntity();
        personalnoticeEntity.setId(uId);
        personalnoticeEntity.setUsertype(type);
        personalnoticeEntity.setIsread(read);
        personalnoticeEntity.setNtitle(title);
        personalnoticeEntity.setNcontent(content);
        personalnoticeEntity.setNdate(new Timestamp(System.currentTimeMillis()));
        return personalNoticeRepository.save(personalnoticeEntity);
    }

    @Override
    public PersonalnoticeEntity readNotice(int nId) {
        Byte read=1;
        PersonalnoticeEntity personalnoticeEntity=personalNoticeRepository.findByNid(nId);
        personalnoticeEntity.setIsread(read);
        return personalNoticeRepository.save(personalnoticeEntity);
    }

    @Override
    public void favouriteHouseNotice(int hId) {
        List<FavouriteEntity> favouriteEntities= favouriteRepository.findByHid(hId);
        HouseEntity houseEntity=houseRepository.findByHid(hId);
        for(FavouriteEntity favouriteEntity:favouriteEntities){
            saveUserNotice(favouriteEntity.getUid(),"你关注的房源有新动态",houseEntity.getHname()+","+houseEntity.getHprice()+"万,"+houseEntity.getHaddress());
        }
    }

    @Override
    public int getUserUnreadNum(int uId) {
        Byte type=0,read=0;
        return personalNoticeRepository.findByIdAndUsertypeAndIsreadOrderByNdateDesc(uId,type,read).size();
    }

    @Override
    public int getAgentUnreadNum(int aId) {
        Byte type=1,read=0;
        return personalNoticeRepository.findByIdAndUsertypeAndIsreadOrderByNdateDesc(aId,type,read).size();
    }
}
