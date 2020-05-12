package com.module.interaction;


import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "comment", schema = "housing_system")
public class CommentEntity implements Serializable {
    @Id
    @Column(name = "EId")
    private int EId;
    @Column(name = "HId")
    private int HId;
    @Column(name = "UId")
    private int UId;
    @Column(name = "CId")
    private int CId;
    @Basic
    @Column(name = "CContent")
    private String CContent;
    @Basic
    @Column(name = "CRating")
    private int CRating;
    @Basic
    @Column(name = "CDate")
    private Timestamp CDate;
    @Basic
    @Column(name = "CValidstatus")
    private byte CValidStatus;


    @Override
    public String toString()
    {
        return "Comment=[cId:"+CId
                +",eId:"+EId
                +",uId:"+UId
                +",hId:"+HId
                +",cContent:"+CContent
                +",cRating:"+CRating
                +",cDate:"+CDate
                +",cValidStatus:"+CValidStatus
                +"]";
    }
}
