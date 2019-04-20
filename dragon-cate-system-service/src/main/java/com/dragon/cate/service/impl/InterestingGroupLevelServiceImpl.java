package com.dragon.cate.service.impl;

import com.dragon.cate.dao.mapper.interesting.InterestingGroupLevelMapper;
import com.dragon.cate.domain.dbo.interesting.InterestingGroupLevelDO;
import com.dragon.cate.domain.vo.InterestingGroupLevelVO;
import com.dragon.cate.service.InterestingGroupLevelService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 兴趣小组级别表(InterestingGroupLevelDO)表控制层
 *
 * @author chl
 * @since 2019-04-17 19:24:29
 */
@Service("interestingGroupLevelService")
public class InterestingGroupLevelServiceImpl implements InterestingGroupLevelService {
    
    @Resource
    private InterestingGroupLevelMapper interestingGroupLevelMapper;

    @Override
    public InterestingGroupLevelDO queryById(Long id) {
        return this.interestingGroupLevelMapper.queryById(id);
    }

    @Override
    public int addInterestingGroupLevel(InterestingGroupLevelVO interestingGroupLevelVO) {
        InterestingGroupLevelDO interestingGroupLevelDO = new InterestingGroupLevelDO();
        BeanUtils.copyProperties(interestingGroupLevelVO, interestingGroupLevelDO);
        return interestingGroupLevelMapper.insert(interestingGroupLevelDO);
    }

}