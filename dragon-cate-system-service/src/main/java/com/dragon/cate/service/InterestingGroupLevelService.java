package com.dragon.cate.service;

import com.dragon.cate.domain.dbo.interesting.InterestingGroupLevelDO;
import com.dragon.cate.domain.vo.InterestingGroupLevelVO;

/**
 * @author chl
 * @since 2019-04-17 19:24:14
 */
public interface InterestingGroupLevelService {
    
    InterestingGroupLevelDO queryById(Long id);

    int addInterestingGroupLevel(InterestingGroupLevelVO interestingGroupLevelVO);
}