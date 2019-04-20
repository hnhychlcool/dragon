package com.dragon.cate.web.controller.discover.interesting;

import com.dragon.cate.domain.dbo.interesting.InterestingGroupLevelDO;
import com.dragon.cate.service.InterestingGroupLevelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 兴趣小组级别表(InterestingGroupLevelDO)表控制层
 *
 * @author chl
 * @since 2019-04-20 12:20:32
 */
@RestController
@RequestMapping("interestingGroupLevel")
public class InterestingGroupLevelController {
    /**
     * 服务对象
     */
    @Resource
    private InterestingGroupLevelService interestingGroupLevelService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public InterestingGroupLevelDO selectOne(Long id) {
        return this.interestingGroupLevelService.queryById(id);
    }

}