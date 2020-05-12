package com.module.interaction;

import org.springframework.data.annotation.Id;

public class Comment {
    @Id
    private  int cId;//评论号
    private int eId;//楼盘号
    private int uId;//用户号
    private int hId;//房源号
    private String cContent;//评论内容
    private int cRating;//评分
    private String cDate;//发布日期
    private Boolean cValidStatus;//是否删除
    @Override
    public String toString()
    {
        return "Comment=[cId:"+cId
                +",eId:"+eId
                +",uId:"+uId
                +",hId:"+hId
                +",cContent:"+cContent
                +",cRating:"+cRating
                +",cDate:"+cDate
                +",cValidStatus:"+cValidStatus
                +"]";
    }
}
