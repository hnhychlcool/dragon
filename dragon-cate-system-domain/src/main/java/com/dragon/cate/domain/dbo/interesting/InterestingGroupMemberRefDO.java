package com.dragon.cate.domain.dbo.interesting;


import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 兴趣小组成员关系表(InterestingGroupMemberRefDO)实体类
 *
 * @author chl
 * @since 2019-04-20 12:07:04
 */
@Data
public class InterestingGroupMemberRefDO implements Serializable {
    private static final long serialVersionUID = -95651712149861720L;
    
    private Long id;
    //兴趣组id
    private Long groupId;
    //用户id
    private Long userId;
    //成员兴趣组级别id
    private Long levelId;
    
    private Date createTime;
    
    private Date updateTime;

}