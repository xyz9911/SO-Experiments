package com.module.interaction;

import org.springframework.data.annotation.Id;

public class Medium {
    @Id
    private int mId;
    private String mName;
    private String mAddress;
    private String mContact;
    private String mAvatar;
    private boolean mVerifyStatus;
    @Override
    public String toString()
    {
        return "Medium=[mId:"+mId
                +",mName:"+mName
                +",mAddress:"+mAddress
                +",mContact:"+mContact
                +",mAvatar:"+mAvatar
                +",mVerifyStatus:"+mVerifyStatus
                +"]";
    }
}
