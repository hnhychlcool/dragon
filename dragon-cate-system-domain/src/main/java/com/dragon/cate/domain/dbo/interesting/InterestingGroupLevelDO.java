package com.dragon.cate.domain.dbo.interesting;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 兴趣小组级别表(InterestingGroupLevelDO)实体类
 *
 * @author chl
 * @since 2019-04-17 19:11:53
 */
@Data
public class InterestingGroupLevelDO implements Serializable {

    private static final long serialVersionUID = -20630377163374853L;
    
    private Long id;

    private int levelSeq;
    //等级名称
    private String name;
    //等级所需积分
    private Integer touchCount;
    //等级icon url
    private String icon;
    
    private LocalDateTime createTime;
    
    private LocalDateTime updateTime;

}