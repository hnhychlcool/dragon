package com.dragon.cate.service.impl;

import com.dragon.cate.dao.mapper.interesting.InterestingGroupMapper;
import com.dragon.cate.domain.dbo.interesting.InterestingGroupDO;
import com.dragon.cate.service.InterestingGroupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 兴趣组基本信息表(InterestingGroupDO)表控制层
 *
 * @author chl
 * @since 2019-04-20 12:18:11
 */
@Service("interestingGroupService")
public class InterestingGroupServiceImpl implements InterestingGroupService {

    @Resource
    private InterestingGroupMapper interestingGroupMapper;

    @Override
    public InterestingGroupDO queryById(Object id) {
        return this.interestingGroupMapper.queryById(id);
    }

    @Override
    public int addInterestingGroup(InterestingGroupDO interestingGroupDO) {
        return interestingGroupMapper.insert(interestingGroupDO);
    }

}