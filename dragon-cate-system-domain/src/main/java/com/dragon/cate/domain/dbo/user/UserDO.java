package com.dragon.cate.domain.dbo.user;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户信息表(UserDO)实体类
 *
 * @author makejava
 * @since 2019-03-21 11:23:50
 */
@Data
public class UserDO implements Serializable {

    private static final long serialVersionUID = 832448315269060652L;

    private Long id;
    //明细分类所属上级分类key
    private String name;
    //具体分类名称
    private String password;
    //手机
    private String phone;
    //邮箱
    private String email;
    //年龄
    private Integer age;
    //性别
    private Integer sex;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}