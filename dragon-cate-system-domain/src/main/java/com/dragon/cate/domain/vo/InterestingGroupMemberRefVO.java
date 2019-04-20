package com.dragon.cate.domain.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class InterestingGroupMemberRefVO implements Serializable {

    private Long id;
    //兴趣组id
    private Long groupId;
    //用户id
    private Long userId;
    //成员兴趣组级别id
    private Long levelId;
}
