package com.dragon.cate.service;

import com.dragon.cate.domain.dbo.interesting.InterestingGroupMemberRefDO;

/**
 * @author chl
 * @since 2019-04-20 12:07:56
 */
public interface InterestingGroupMemberRefService {
    
    InterestingGroupMemberRefDO queryById(Long id);

}