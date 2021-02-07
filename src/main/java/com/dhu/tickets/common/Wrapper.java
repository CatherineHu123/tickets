package com.dhu.tickets.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;

import java.io.Serializable;

@Data
@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
public class Wrapper<T> implements Serializable {

    /**
     * 序列化标识
     */
    private static final long serialVersionUID = 3782350118017398556L;

    /**
     * 成功码.
     */
    public static final int SUCCESS_CODE = 0;

    /**
     * 成功信息.
     */
    public static final String SUCCESS_MESSAGE = "success";

    /**
     * 错误码.
     */
    public static final int ERROR_CODE = 1;

    /**
     * 错误信息.
     */
    public static final String ERROR_MESSAGE = "error";

    /**
     * 编号.
     */
    private int code;

    /**
     * 信息.
     */
    private String message;

    /**
     * 结果数据
     */
    private T data;

    Wrapper() {
        this(SUCCESS_CODE, SUCCESS_MESSAGE);
    }

    Wrapper(int code, String message) {
        this(code, message, null);
    }

    Wrapper(int code, String message, T data) {
        super();
        this.code(code).message(message).data(data);
    }

    private Wrapper<T> code(int code) {
        this.setCode(code);
        return this;
    }

    private Wrapper<T> message(String message) {
        this.setMessage(message);
        return this;
    }

    public Wrapper<T> data(T data) {
        this.setData(data);
        return this;
    }

    @JsonIgnore
    public boolean success() {
        return Wrapper.SUCCESS_CODE == this.code;
    }

    @JsonIgnore
    public boolean error() {
        return !success();
    }

}