package com.module.interaction;

import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface CommentService {
    List<CommentEntity> getComments(int hId, int eId);
    List<CommentEntity> getComments(int uId);
    Page<CommentEntity> getComments(int hId, int eId, int pageNum);
    List<CommentEntity> getAll();
}
