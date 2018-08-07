package com.beijiu.demo.tspringbootvue.common;

public class RespEntity {
    private int rtncode;
    private Object rtnmsg;


    public RespEntity(RespCode respCode) {
        this.rtncode = respCode.getCode();
        this.rtnmsg = respCode.getMsg();
    }

    public RespEntity(RespCode respCode, Object respMsg) {
        this.rtncode = respCode.getCode();
        this.rtnmsg = respMsg;
    }

    public int getRtncode() {
        return rtncode;
    }

    public Object getRtnmsg() {
        return rtnmsg;
    }
}
