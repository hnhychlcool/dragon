package com.dragon.cate.domain.dbo.interesting;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 兴趣组基本信息表(InterestingGroupDO)实体类
 *
 * @author chl
 * @since 2019-04-20 11:33:59
 */
@Data
public class InterestingGroupDO implements Serializable {
    private static final long serialVersionUID = -22078704194351255L;

    private Long id;
    //学校id
    private Long schoolId;
    //小组名称
    private String name;
    //小组logo标签
    private String icon;
    //小组标签
    private String title;
    //小组简介
    private String groupDesc;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}