package com.dragon.cate.domain.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class InterestingGroupLevelVO implements Serializable {

    private Long id;

    private int levelSeq;
    //等级名称
    private String name;
    //等级所需积分
    private Integer touchCount;
    //等级icon url
    private String icon;

}
