package com.module.interaction;

import org.springframework.data.annotation.Id;

public class User {
    @Id
    private int uId;
    private String uName;
    private String uPassword;
    private boolean uGender;
    private String uContact;
    private String uDistrict;
    private String uAvatar;
    private boolean uValidStatus;
    @Override
    public String toString()
    {
        return "User=[uId:"+uId
                +",uName:"+uName
                +",uPassword:"+uPassword
                +",uGender:"+uGender
                +",uContact:"+uContact
                +",uDistrict:"+uDistrict
                +",uAvatar:"+uAvatar
                +",uValidStatus:"+uValidStatus
                +"]";
    }
}
