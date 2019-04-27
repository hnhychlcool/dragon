package com.dragon.cate.domain.param.interesting;

import lombok.Data;

import java.io.Serializable;

@Data
public class TopicParam implements Serializable {

    //话题所属兴趣组id
    private long groupId;

    // 话题创建者id
    private long userId;

    private String name;

    private String shortTips;

    private String groupDesc;

    private int groupCategory;
}
