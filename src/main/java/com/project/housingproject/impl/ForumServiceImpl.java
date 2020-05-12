package com.project.housingproject.impl;

import com.project.housingproject.entities.AgentreplyEntity;
import com.project.housingproject.entities.PostEntity;
import com.project.housingproject.entities.UserreplyEntity;
import com.project.housingproject.repositories.AgentReplyRepository;
import com.project.housingproject.repositories.PostRepository;
import com.project.housingproject.repositories.UserReplyRepository;
import com.project.housingproject.services.ForumService;
import com.project.housingproject.viewInfo.PostView;
import com.project.housingproject.viewInfo.ReplyView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ForumServiceImpl implements ForumService {
    @Autowired
    private PostRepository postRepository;
    @Autowired
    private UserReplyRepository userReplyRepository;
    @Autowired
    private AgentReplyRepository agentReplyRepository;

    @Override
    public Page<PostView> forumpageGetPost(int pageNum) {
        PageRequest pageRequest=PageRequest.of(pageNum,10);
        return postRepository.findByOrderByPdateDesc(pageRequest);
    }

    @Override
    public Page<PostView> homeGetPost(int pageNum) {
        PageRequest pageRequest=PageRequest.of(pageNum,5);
        return postRepository.findByOrderByPdateDesc(pageRequest);
    }

    @Override
    public PostView getPost(int pId) {
        return postRepository.findViewByPid(pId);
    }

    @Override
    public List<PostEntity> getPostById(int uId) {
        return postRepository.findByUid(uId);
    }

    @Override
    public List<ReplyView> getUserReply(int pId) {
        return userReplyRepository.findByPidOrderByRdateAsc(pId);
    }

    @Override
    public List<ReplyView> getAgentReply(int pId) {
        return agentReplyRepository.findByPidOrderByRdateAsc(pId);
    }

    @Override
    public PostEntity savePost(PostEntity postEntity) {
        return postRepository.save(postEntity);
    }

    @Override
    public AgentreplyEntity saveAgentReply(AgentreplyEntity agentreplyEntity) {
        return agentReplyRepository.save(agentreplyEntity);
    }

    @Override
    public UserreplyEntity saveUserReply(UserreplyEntity userreplyEntity) {
        return userReplyRepository.save(userreplyEntity);
    }

    @Override
    public PostEntity deletePost(int pId) {
        Byte valid=0;
        PostEntity postEntity=postRepository.findByPid(pId);
        postEntity.setPvalidstatus(valid);
        return postRepository.save(postEntity);
    }
}
