package com.dragon.cate.domain.param.interesting;

import lombok.Data;

import java.io.Serializable;

@Data
public class TopicContentResponseParam implements Serializable {

    // 所属top content
    private long topicContentId;

    // 回帖用户id
    private long userId;

    // 回帖信息
    private String leavingMessage;
}
