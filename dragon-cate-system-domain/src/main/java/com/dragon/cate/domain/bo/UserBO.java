package com.dragon.cate.domain.bo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserBO implements Serializable {

    //姓名
    private String name;
    //密码
    private String password;
    //手机
    private String phone;
    //邮箱
    private String email;
    //年龄
    private Integer age;
    //性别
    private Integer sex;
}
