package com.study.common.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
public enum BizCodeEnume {
    UNKNOW_EXCEPTOION(10000,"系统未知错误"),
    VAILD_EXCEPTOION(10001,"参数格式校验失败"),
    ;

    private int code;
    private String message;

    public int getCode(){
        return code;
    }

    public String getMessage(){
        return message;
    }

}
