package com.project.housingproject.controller;

import com.project.housingproject.entities.CommentEntity;
import com.project.housingproject.postitems.CommentPost;
import com.project.housingproject.services.CommentService;
import com.project.housingproject.viewInfo.CommentView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;


@RestController
public class CommentServiceController {
    @Autowired
    private CommentService commentService;

    //已部署
    @RequestMapping(value = "comments/post",method = RequestMethod.POST)
    public CommentEntity postComment(@RequestBody CommentPost commentPost){
        Byte tmp=1;
        CommentEntity commentEntity=new CommentEntity();
        commentEntity.setEid(commentPost.eid);
        commentEntity.setCcontent(commentPost.ccontent);
        commentEntity.setCrating(commentPost.crating);
        commentEntity.setUid(commentPost.uid);
        commentEntity.setCvalidstatus(tmp);
        commentEntity.setCdate(new Timestamp(System.currentTimeMillis()));
        return commentService.save(commentEntity);
    }

    //未部署
    @RequestMapping(value = "comments",method = RequestMethod.GET)
    public CommentEntity showCommentController(@RequestParam("cId")int cId){
        return commentService.getCommentById(cId);
    }

    //未部署
    @RequestMapping(value = "comments/user",method = RequestMethod.GET)
    public List<CommentEntity> showCommentsController(@RequestParam("uId")int uId){
        return commentService.getCommentsByUser(uId);
    }

    //已部署
    @RequestMapping(value = "comments/estate/{page}",method = RequestMethod.GET)
    public Page<CommentView> showComments(@RequestParam("eid")int eid,@PathVariable("page")int pageNum){
        return commentService.getCommentsByEstate(eid,pageNum);
    }

    //未部署
    @RequestMapping(value = "comment/delete/{cId}",method = RequestMethod.PUT)
    public CommentEntity deleteComment(@PathVariable("cId")int cId){
        return commentService.deleteComment(cId);
    }
}
