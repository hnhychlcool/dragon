package com.dragon.cate.domain.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class InterestingGroupVO implements Serializable{

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

}
