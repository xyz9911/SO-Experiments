package com.project.housingproject.impl;

import com.project.housingproject.entities.CommentEntity;
import com.project.housingproject.repositories.CommentRepository;
import com.project.housingproject.services.CommentService;
import com.project.housingproject.viewInfo.CommentView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentRepository commentRepository;

    @Override
    public CommentEntity getCommentById(int cId) {
        return commentRepository.findByCid(cId);
    }

    @Override
    public Page<CommentView> getCommentsByEstate(int eId, int pageNum) {
        PageRequest pageRequest = PageRequest.of(pageNum, 10);
        return commentRepository.findByEid(eId,pageRequest);
    }

    @Override
    public List<CommentEntity> getCommentsByUser(int uId) {
        Byte status=1;
        return commentRepository.findByUidAndCvalidstatus(uId,status);
    }

    @Override
    public CommentEntity save(CommentEntity commentEntity) {
        return commentRepository.save(commentEntity);
    }

    @Override
    public CommentEntity deleteComment(int cId) {
        Byte valid=0;
        CommentEntity commentEntity=commentRepository.findByCid(cId);
        commentEntity.setCvalidstatus(valid);
        return commentRepository.save(commentEntity);
    }
}
