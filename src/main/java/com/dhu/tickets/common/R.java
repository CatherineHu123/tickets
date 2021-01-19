package com.dhu.tickets.common;

import java.util.HashMap;
import java.util.Map;

public class R {
    private Integer code;

    private String msg;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }


    private R() {
    }

    public static R suc() {
        R r = new R();
        r.code = 0;
        r.msg = "success";
        return r;
    }

    public static R error() {
        R r = new R();
        r.code = 1;
        r.msg = "error";
        return r;
    }

    public R msg(String msg) {
        this.setMsg(msg);
        return this;
    }

    public R code(Integer code) {
        this.setCode(code);
        return this;
    }


}
