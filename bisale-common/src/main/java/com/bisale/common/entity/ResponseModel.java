package com.bisale.common.entity;

import java.io.Serializable;

public class ResponseModel<T> implements Serializable {
    private T body;
    private String code;
    private String message;
    private Throwable throwable;

    public ResponseModel() {}

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }

    private ResponseModel(String code) {
        this.code = code;
    }

    private ResponseModel(ResponseStatusEnum error) {
        this.code = error.getCode();
        this.message = error.getMessage();
    }

    private ResponseModel(String code, T body) {
        this.code = code;
        this.body = body;
    }

    public static ResponseModel emptySuccess() {
        return new ResponseModel(ResponseStatusEnum.SUCCESS.getCode());
    }

    public static <T> ResponseModel success(T body) {
        return new ResponseModel(ResponseStatusEnum.SUCCESS.getCode(), body);
    }

    public static ResponseModel systemError() {
        return new ResponseModel(ResponseStatusEnum.SYSTEM_ERROR);
    }
}
