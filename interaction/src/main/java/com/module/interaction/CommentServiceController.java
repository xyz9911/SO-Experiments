package com.module.interaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CommentServiceController {
    CommentService commentService;

    @Autowired
    public void setCommentService(CommentService commentService) {
        this.commentService = commentService;
    }

    @RequestMapping(value = "comment/{hid}/{uid}")
    public List<CommentEntity> showCommentController(@PathVariable("hid")int hid, @PathVariable("uid")int uid)
    {
        List result=commentService.getComments(hid,uid);
        return result;
    }

    @RequestMapping(value = "comment",method = RequestMethod.GET)
    public List<CommentEntity> showCommentController()
    {
        List<CommentEntity> result=commentService.getAll();
        System.out.println(result);
        return result;
    }
}
