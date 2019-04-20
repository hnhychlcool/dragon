package com.dragon.cate.web.controller.discover.interesting;

import com.dragon.cate.domain.base.ResponseVO;
import com.dragon.cate.domain.dbo.interesting.InterestingGroupLevelDO;
import com.dragon.cate.domain.vo.InterestingGroupLevelVO;
import com.dragon.cate.service.InterestingGroupLevelService;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 兴趣小组级别表(InterestingGroupLevelDO)表控制层
 *
 * @author chl
 * @since 2019-04-20 12:20:32
 */
@RestController
@RequestMapping("web/interestingGroupLevel")
public class InterestingGroupLevelController {
    /**
     * 服务对象
     */
    @Resource
    private InterestingGroupLevelService interestingGroupLevelService;

    @RequestMapping("create")
    @ResponseBody
    public ResponseVO createInterestingGroupLevel(@RequestBody InterestingGroupLevelVO interestingGroupLevelVO) {
        Assert.notNull(interestingGroupLevelVO, "参数不能为空");
        interestingGroupLevelService.addInterestingGroupLevel(interestingGroupLevelVO);
        return ResponseVO.success();
    }

    /**
     * 通过主键查询单条数据
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("queryById")
    public InterestingGroupLevelDO queryById(Long id) {
        return this.interestingGroupLevelService.queryById(id);
    }

}