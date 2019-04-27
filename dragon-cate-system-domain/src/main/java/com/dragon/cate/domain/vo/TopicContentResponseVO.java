package com.dragon.cate.domain.vo;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 　　* @author chl
 * 　　* @date 2019/4/27 10:26
 * 　　* desc 回帖信息
 */
@Data
public class TopicContentResponseVO implements Serializable {

    private long id;

    // 所属top content
    private long topicContentId;

    // 回帖用户id
    private long userId;

    // 回帖信息
    private String leavingMessage;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
