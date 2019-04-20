package com.dragon.cate.web.controller.discover.interesting;

import com.dragon.cate.domain.base.ResponseVO;
import com.dragon.cate.domain.dbo.interesting.InterestingGroupDO;
import com.dragon.cate.domain.vo.InterestingGroupVO;
import com.dragon.cate.service.InterestingGroupService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 兴趣组基本信息表(InterestingGroupDO)表控制层
 *
 * @author chl
 * @since 2019-04-20 12:20:11
 */
@RestController
@RequestMapping("interestingGroup")
public class InterestingGroupController {
    /**
     * 服务对象
     */
    @Resource
    private InterestingGroupService interestingGroupService;

    @RequestMapping("create")
    @ResponseBody
    public Object create(@RequestBody InterestingGroupVO interestingGroupVO) {
        InterestingGroupDO interestingGroupDO = new InterestingGroupDO();
        BeanUtils.copyProperties(interestingGroupVO, interestingGroupDO);
        interestingGroupService.addInterestingGroup(interestingGroupDO);
        return ResponseVO.success();
    }

    /**
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("queryById")
    public InterestingGroupDO queryById(long id) {
        return this.interestingGroupService.queryById(id);
    }

}