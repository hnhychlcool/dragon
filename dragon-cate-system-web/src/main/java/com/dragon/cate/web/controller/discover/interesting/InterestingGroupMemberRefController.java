package com.dragon.cate.web.controller.discover.interesting;

import com.dragon.cate.domain.dbo.interesting.InterestingGroupMemberRefDO;
import com.dragon.cate.service.InterestingGroupMemberRefService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 兴趣小组成员关系表(InterestingGroupMemberRefDO)表控制层
 *
 * @author chl
 * @since 2019-04-20 12:20:55
 */
@RestController
@RequestMapping("web/interestingGroupMemberRef")
public class InterestingGroupMemberRefController {
    /**
     * 服务对象
     */
    @Resource
    private InterestingGroupMemberRefService interestingGroupMemberRefService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public InterestingGroupMemberRefDO selectOne(Long id) {
        return this.interestingGroupMemberRefService.queryById(id);
    }

}