package com.bisale.common.entity;

public enum ResponseStatusEnum {
    SUCCESS("2000", ""),
    SYSTEM_ERROR("5000", "系统错误");

    private String code;
    private String message;

    ResponseStatusEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }
}
