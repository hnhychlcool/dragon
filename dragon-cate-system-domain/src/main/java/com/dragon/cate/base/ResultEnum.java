package com.dragon.cate.base;

import lombok.Getter;

@Getter
public enum ResultEnum {


    SUCCESS(0, "成功"),

    FAILURE(500, "失败");

    private Integer code;

    /**
     * 响应信息
     */
    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
