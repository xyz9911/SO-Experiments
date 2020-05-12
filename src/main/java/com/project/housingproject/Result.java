package com.project.housingproject;

public class Result {
    //响应码
    private int code;  //enum is better

    public Result(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
