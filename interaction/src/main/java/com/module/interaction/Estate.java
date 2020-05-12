package com.module.interaction;

import org.springframework.data.annotation.Id;

public class Estate {
    @Id
    private int eId;
    private String eName;
    private double eAvgPrice;
    private String eAddress;
    private String eImage;
    @Override
    public String toString()
    {
        return "Estate={eId:"+eId
                +", eName:"+eName
                +", eAvgPrice:"+eAvgPrice
                +", eAddress:"+eAddress
                +", eImage:"+eImage
                +"}";
    }
}
