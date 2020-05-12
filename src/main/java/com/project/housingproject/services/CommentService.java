package com.project.housingproject.services;

import com.project.housingproject.entities.CommentEntity;
import com.project.housingproject.viewInfo.CommentView;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
public interface CommentService {
    CommentEntity getCommentById(int cId);
    Page<CommentView> getCommentsByEstate(int eId,int pageNum);
    List<CommentEntity> getCommentsByUser(int uId);
    CommentEntity save(CommentEntity commentEntity);
    CommentEntity deleteComment(int cId);
}
