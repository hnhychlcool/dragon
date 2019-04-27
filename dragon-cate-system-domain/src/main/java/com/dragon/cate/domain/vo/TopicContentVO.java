package com.dragon.cate.domain.vo;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class TopicContentVO implements Serializable {

    private long id;

    // 所属topic
    private long topicId;

    // 发帖用户id
    private long userId;

    private String topicContent;

    // 点赞人数
    private int goodCount;

    // 点差人数
    private int badCount;

    private List<TopicContentResponseVO> contentResponseVOList;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
