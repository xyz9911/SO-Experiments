package com.project.housingproject.controller;

import com.project.housingproject.entities.AgentreplyEntity;
import com.project.housingproject.entities.PostEntity;
import com.project.housingproject.entities.UserreplyEntity;
import com.project.housingproject.postitems.PostPost;
import com.project.housingproject.postitems.ReplyPost;
import com.project.housingproject.services.ForumService;
import com.project.housingproject.viewInfo.PostView;
import com.project.housingproject.viewInfo.ReplyView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;

@RestController
public class ForumServiceController {
    @Autowired
    private ForumService forumService;

    //已部署
    @RequestMapping(value = "forum/home",method = RequestMethod.GET)
    public Page<PostView> homeGetPost(){
        return forumService.homeGetPost(0);
    }

    //已部署
    @RequestMapping(value = "forum/{pageNum}",method = RequestMethod.GET)
    public Page<PostView> forumpageGetPost(@PathVariable("pageNum")int pageNum){
        return forumService.forumpageGetPost(pageNum);
    }

    //已部署
    @RequestMapping(value = "forum/post",method = RequestMethod.GET)
    public PostView getPost(@RequestParam("pId")int pId){
        return forumService.getPost(pId);
    }

    //未部署
    @RequestMapping(value = "forum/post/user",method = RequestMethod.GET)
    List<PostEntity> getPostById(@RequestParam("Id")int uId){
        return forumService.getPostById(uId);
    }

    //已部署
    @RequestMapping(value = "forum/reply/user",method = RequestMethod.GET)
    List<ReplyView> getUserReply(@RequestParam("pId")int pId){
        return forumService.getUserReply(pId);
    }

    //已部署
    @RequestMapping(value = "forum/reply/agent",method = RequestMethod.GET)
    List<ReplyView> getAgentReply(@RequestParam("pId")int pId){
        return forumService.getAgentReply(pId);
    }

    //未部署
    @RequestMapping(value = "forum/post",method = RequestMethod.POST)
    PostEntity postPost(@RequestBody PostPost postPost){
        Byte valid=1;
        PostEntity postEntity=new PostEntity();
        postEntity.setPtitle(postPost.ptitle);
        postEntity.setUid(postPost.uid);
        postEntity.setPcontent(postPost.pcontent);
        postEntity.setPvalidstatus(valid);
        postEntity.setPdate(new Timestamp(System.currentTimeMillis()));
        return forumService.savePost(postEntity);
    }

    //已部署
    @RequestMapping(value = "forum/agent/reply",method = RequestMethod.POST)
    AgentreplyEntity agentReply(@RequestBody ReplyPost replyPost){
        AgentreplyEntity agentreplyEntity=new AgentreplyEntity();
        agentreplyEntity.setAid(replyPost.id);
        agentreplyEntity.setPid(replyPost.pid);
        agentreplyEntity.setRcontent(replyPost.rcontent);
        agentreplyEntity.setRdate(new Timestamp(System.currentTimeMillis()));
        return forumService.saveAgentReply(agentreplyEntity);
    }

    //已部署
    @RequestMapping(value = "forum/user/reply",method = RequestMethod.POST)
    UserreplyEntity userReply(@RequestBody ReplyPost replyPost){
        UserreplyEntity userreplyEntity=new UserreplyEntity();
        userreplyEntity.setUid(replyPost.id);
        userreplyEntity.setPid(replyPost.pid);
        userreplyEntity.setRcontent(replyPost.rcontent);
        userreplyEntity.setRdate(new Timestamp(System.currentTimeMillis()));
        return forumService.saveUserReply(userreplyEntity);
    }

    //未部署
    @RequestMapping(value = "forum/delete/{pId}",method = RequestMethod.PUT)
    PostEntity deletePost(@PathVariable("pId")int pId){
        return forumService.deletePost(pId);
    }
}
