package com.dragon.cate.domain.dbo.interesting;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 　　* @author chl
 * 　　* @date 2019/4/27 09:25
 * 　　* desc 话题信息
 *
 */
@Data
public class TopicDO implements Serializable {

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

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
