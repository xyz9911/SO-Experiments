package com.project.housingproject.services;

import com.project.housingproject.entities.AgentreplyEntity;
import com.project.housingproject.entities.PostEntity;
import com.project.housingproject.entities.UserreplyEntity;
import com.project.housingproject.viewInfo.PostView;
import com.project.housingproject.viewInfo.ReplyView;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ForumService {
    Page<PostView> forumpageGetPost(int pageNum);
    Page<PostView> homeGetPost(int pageNum);
    PostView getPost(int pId);
    List<PostEntity> getPostById(int uId);
    List<ReplyView> getUserReply(int pId);
    List<ReplyView> getAgentReply(int pId);
    PostEntity savePost(PostEntity postEntity);
    AgentreplyEntity saveAgentReply(AgentreplyEntity agentreplyEntity);
    UserreplyEntity saveUserReply(UserreplyEntity userreplyEntity);
    PostEntity deletePost(int pId);
}
