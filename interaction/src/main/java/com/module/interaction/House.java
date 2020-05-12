package com.module.interaction;

import org.springframework.data.annotation.Id;

public class House {
    @Id
    private int hId;
    private int eId;
    private int aId;
    private double hPrice;
    private String hAddress;
    private double hSquare;
    private boolean hVerifyStatus;
    private boolean hValidStatus;
    private String hImage;
    @Override
    public String toString()
    {
        return "House=[hId:"+hId
                +",eId:"+eId
                +",aId:"+aId
                +",hPrice:"+hPrice
                +",hAddress:"+hAddress
                +",hSquare:"+hSquare
                +",hVerifyStatus:"+hVerifyStatus
                +",hValidStatus:"+hValidStatus
                +",hImage:"+hImage
                +"]";
    }
}
