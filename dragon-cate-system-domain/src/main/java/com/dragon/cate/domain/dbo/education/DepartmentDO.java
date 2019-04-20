package com.dragon.cate.domain.dbo.education;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 学校院系信息表(DepartmentDO)实体类
 *
 * @author chl
 * @since 2019-03-22 13:13:28
 */
@Data
public class DepartmentDO implements Serializable {

    private static final long serialVersionUID = -65039700669785130L;
    
    private Long id;
    //所属学校id
    private Integer schoolId;
    //院系名称
    private String name;
    
    private LocalDateTime createTime;
    
    private LocalDateTime updateTime;


}