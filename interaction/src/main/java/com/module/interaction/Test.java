package com.module.interaction;

import org.springframework.data.domain.Page;

public class Test {
    public static void main(String[] args) {
        CommentServiceImpl commentServiceImpl=new CommentServiceImpl();
        Iterable<CommentEntity> result=commentServiceImpl.getAll();
        System.out.println(result);
    }
}
