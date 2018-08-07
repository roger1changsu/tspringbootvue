package com.beijiu.demo.tspringbootvue.common;

public enum  RespCode  {
    SUCCESS(0, "OK"),

    /*  Authentication Error Code */
    FAILURE_LOGIN_FAILED(10001, "Invalid username or password.");

    private int code;
    private String msg;

    RespCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
