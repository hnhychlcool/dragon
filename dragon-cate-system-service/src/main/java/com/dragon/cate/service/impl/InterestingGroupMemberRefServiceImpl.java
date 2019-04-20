package com.dragon.cate.service.impl;

import com.dragon.cate.dao.mapper.interesting.InterestingGroupMemberRefMapper;
import com.dragon.cate.domain.dbo.interesting.InterestingGroupMemberRefDO;
import com.dragon.cate.service.InterestingGroupMemberRefService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 兴趣小组成员关系表(InterestingGroupMemberRefDO)表控制层
 * @author chl
 * @since 2019-04-20 12:08:17
 */
@Service("interestingGroupMemberRefService")
public class InterestingGroupMemberRefServiceImpl implements InterestingGroupMemberRefService {
    
    @Resource
    private InterestingGroupMemberRefMapper interestingGroupMemberRefMapper;

    @Override
    public InterestingGroupMemberRefDO queryById(Long id) {
        return this.interestingGroupMemberRefMapper.queryById(id);
    }

}