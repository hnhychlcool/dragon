package com.dragon.cate.domain.vo;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 　　* @author chl
 * 　　* @date 2019/4/27 10:31
 * 　　* desc
 */
@Data
public class TopicVO implements Serializable {

    private long id;

    //话题所属兴趣组id
    private long groupId;

    // 话题创建者id
    private long userId;

    private String name;

    private String shortTips;

    private String groupDesc;

    private int groupCategory;

    // 话题浏览人次
    private int visitCount;

    // 留言人次
    private int messageCount;

    private List<TopicContentVO> topicContentVOList;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
