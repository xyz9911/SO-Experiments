package com.project.housingproject.impl;

import com.project.housingproject.entities.GroupnoticeEntity;
import com.project.housingproject.entities.NoticeobjectEntity;
import com.project.housingproject.repositories.*;
import com.project.housingproject.services.GroupNoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

@Service
public class GroupNoticeServiceImpl implements GroupNoticeService {

    @Autowired
    private NoticeObjectRepository noticeObjectRepository;

    @Autowired
    private GroupNoticeRepository groupNoticeRepository;

    @Autowired
    private AgentRepository agentRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public GroupnoticeEntity getNoticeById(int nId) {
        return groupNoticeRepository.findByNid(nId);
    }

    @Override
    public List<GroupnoticeEntity> getReadUserNotice(int uId) {
        Byte type=0,read=1;
        return getGroupnoticeEntities(uId, type, read);
    }

    @Override
    public List<GroupnoticeEntity> getUnreadUserNotice(int uId) {
        Byte type=0,read=0;
        return getGroupnoticeEntities(uId, type, read);
    }

    private List<GroupnoticeEntity> getGroupnoticeEntities(int Id, Byte type, Byte read) {
        return noticeObjectRepository.findByIdAndUsertypeAndIsread(Id,type,read);
    }

    @Override
    public List<GroupnoticeEntity> getReadAgentNotice(int aId) {
        Byte type=1,read=1;
        return getGroupnoticeEntities(aId,type,read);
    }

    @Override
    public int getUserUnreadNum(int uId) {
        Byte type=0,read=0;
        return getGroupnoticeEntities(uId, type, read).size();
    }

    @Override
    public int getAgentUnreadNum(int aId) {
        Byte type=1,read=0;
        return getGroupnoticeEntities(aId, type, read).size();
    }

    @Override
    public List<GroupnoticeEntity> getUnreadAgentNotice(int aId) {
        Byte type=1,read=0;
        return getGroupnoticeEntities(aId,type,read);
    }

    @Override
    public NoticeobjectEntity saveNoticeObject(int id, int nid) {
        Byte read=0;
        NoticeobjectEntity noticeobjectEntity=new NoticeobjectEntity();
        noticeobjectEntity.setId(id);
        noticeobjectEntity.setNid(nid);
        noticeobjectEntity.setIsread(read);
        return noticeObjectRepository.save(noticeobjectEntity);
    }

    @Override
    public List<NoticeobjectEntity> readNotice(int id,Byte userType) {
        Byte read=1;
        NoticeobjectEntity noticeobjectEntity;
        List<NoticeobjectEntity> result=new ArrayList<>();
        List<Integer> notices=groupNoticeRepository.findByUsertype(userType);
        for(Integer nid:notices){
            noticeobjectEntity=noticeObjectRepository.findByIdAndNid(id,nid);
            if(noticeobjectEntity!=null){
                noticeobjectEntity.setIsread(read);
                noticeobjectEntity.setReadtime(new Timestamp(System.currentTimeMillis()));
                result.add(noticeobjectEntity);
            }
        }
        return noticeObjectRepository.saveAll(result);
    }

    @Override
    public GroupnoticeEntity postNotice(Byte userType, String title, String content) {
        GroupnoticeEntity groupnoticeEntity=new GroupnoticeEntity();
        groupnoticeEntity.setUsertype(userType);
        groupnoticeEntity.setNtitle(title);
        groupnoticeEntity.setNcontent(content);
        groupnoticeEntity.setNdate(new Timestamp(System.currentTimeMillis()));
        groupnoticeEntity=groupNoticeRepository.save(groupnoticeEntity);
        if(userType==0)
        {
            List<Integer> users=userRepository.findDistinctUid();
            for(Integer uid:users){
                saveNoticeObject(uid,groupnoticeEntity.getNid());
            }
        }
        else if(userType==1)
        {
            List<Integer> agents=agentRepository.findDistinctAid();
            for(Integer aid:agents){
                saveNoticeObject(aid,groupnoticeEntity.getNid());
            }
        }
        return groupnoticeEntity;
    }
}
