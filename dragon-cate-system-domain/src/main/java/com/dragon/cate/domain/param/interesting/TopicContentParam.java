package com.dragon.cate.domain.param.interesting;

import lombok.Data;

import java.io.Serializable;

@Data
public class TopicContentParam implements Serializable {

    // 所属topic
    private long topicId;

    // 发帖用户id
    private long userId;

    private String topicContent;
}
