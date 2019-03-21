package com.dragon.cate.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.io.Serializable;


@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseVO implements Serializable {

    private int code;

    private Object result;

    private String message;

    public ResponseVO() {
    }

    public ResponseVO(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public ResponseVO(int code, Object result, String message) {
        this.code = code;
        this.result = result;
        this.message = message;
    }

    public static ResponseVO ok(boolean expression) {
        ResponseVO ResponseVO = new ResponseVO();
        ResponseVO.setCode(expression ? ResultEnum.SUCCESS.getCode() : ResultEnum.FAILURE.getCode());
        ResponseVO.setMessage(expression ? ResultEnum.SUCCESS.getMessage() : ResultEnum.FAILURE.getMessage());
        return ResponseVO;
    }

    public static ResponseVO failure() {
        ResponseVO ResponseVO = new ResponseVO();
        ResponseVO.setCode(ResultEnum.FAILURE.getCode());
        ResponseVO.setMessage(ResultEnum.FAILURE.getMessage());
        return ResponseVO;
    }

    public static ResponseVO failure(String msg) {
        ResponseVO ResponseVO = new ResponseVO();
        ResponseVO.setCode(ResultEnum.FAILURE.getCode());
        ResponseVO.setMessage(msg);
        return ResponseVO;
    }

    public static ResponseVO failure(int code, String msg, Object data) {
        ResponseVO ResponseVO = new ResponseVO();
        ResponseVO.setCode(code);
        ResponseVO.setMessage(msg);
        ResponseVO.setResult(data);
        return ResponseVO;
    }

    public static ResponseVO success() {
        ResponseVO ResponseVO = new ResponseVO();
        ResponseVO.setCode(ResultEnum.SUCCESS.getCode());
        ResponseVO.setMessage(ResultEnum.SUCCESS.getMessage());
        return ResponseVO;
    }

    public static ResponseVO success(Object data) {
        ResponseVO ResponseVO = new ResponseVO();
        ResponseVO.setCode(ResultEnum.SUCCESS.getCode());
        ResponseVO.setMessage(ResultEnum.SUCCESS.getMessage());
        ResponseVO.setResult(data);
        return ResponseVO;
    }

    public static ResponseVO success(Object data, String msg) {
        ResponseVO ResponseVO = new ResponseVO();
        ResponseVO.setCode(ResultEnum.SUCCESS.getCode());
        ResponseVO.setMessage(msg);
        ResponseVO.setResult(data);
        return ResponseVO;
    }
}
