package com.module.interaction;

import javax.persistence.*;

@Entity
@Table(name="agent")
public class Agent {
    @Id
    @Column(name="aId")
    private int aId;
    @Column
    private int mId;
    @Column
    private String aName;
    @Column
    private String aPassword;
    @Column
    private String aContact;
    @Column
    private boolean aVerifyStatus;
    @Column
    private boolean aValidStatus;
    @Column
    private String aAvatar;
    @Override
    public String toString()
    {
        return "Agent={aId:"+aId
                +", mID:"+mId
                +", aName:"+aName
                +", aPassword:"+aPassword
                +", aContact:"+aContact
                +", aVerifyStatus:"+aVerifyStatus
                +", aValidStatus:"+aValidStatus
                +", aAvatar:"+aAvatar
                +"}";
    }
}
