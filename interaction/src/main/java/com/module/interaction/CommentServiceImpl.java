package com.module.interaction;

import com.module.interaction.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentServiceImpl implements CommentService {
    private CommentRepository commentRepository;

    @Autowired
    public void setCommentRepository(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    @Override
    public List<CommentEntity> getComments(int hId, int eId) {
        return commentRepository.findByHIdAndEId(hId,eId);
    }

    @Override
    public List<CommentEntity> getComments(int uId) {
        return commentRepository.findByUId(uId);
    }

    @Override
    public Page<CommentEntity> getComments(int hId, int eId, int pageNum) {
        PageRequest pageRequest = PageRequest.of(pageNum, 10);
        return commentRepository.findByHIdAndEId(hId,eId,pageRequest);
    }
    @Override
    public List<CommentEntity> getAll()
    {
        return commentRepository.findAll();
    }
}
