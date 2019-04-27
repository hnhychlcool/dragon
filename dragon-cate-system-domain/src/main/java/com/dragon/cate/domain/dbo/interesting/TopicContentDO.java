package com.dragon.cate.domain.dbo.interesting;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 　　* @author chl
 * 　　* @date 2019/4/27 09:39
 *
 */
@Data
public class TopicContentDO implements Serializable {

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

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
