package com.dragon.cate.service;

import com.dragon.cate.domain.dbo.interesting.InterestingGroupDO;

/**
 * @author chl
 * @since 2019-04-20 12:17:50
 */
public interface InterestingGroupService {
    
    InterestingGroupDO queryById(Object id);

    int addInterestingGroup(InterestingGroupDO interestingGroupDO);

    InterestingGroupDO queryByName(String name);
}