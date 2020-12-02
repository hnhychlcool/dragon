package com.dragon.cate.domain.dbo.user;

import com.dragon.cate.common.annotation.Desensitization;
import com.dragon.cate.common.enums.DesensitizationTypeEnum;
import lombok.Builder;
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
@Builder
public class UserDO implements Serializable {

    private static final long serialVersionUID = 832448315269060652L;

    private Long id;
    //明细分类所属上级分类key
    @Desensitization(type = DesensitizationTypeEnum.REAL_NAME)
    private String name;

    private String password;

    //手机
    @Desensitization(type = DesensitizationTypeEnum.PHONE)
    private String phone;


    //邮箱
    @Desensitization(type = DesensitizationTypeEnum.EMAIL)
    private String email;
    //年龄
    private Integer age;
    //性别
    private Integer sex;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;


}