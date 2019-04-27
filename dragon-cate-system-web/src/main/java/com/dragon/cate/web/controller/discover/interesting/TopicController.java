package com.dragon.cate.web.controller.discover.interesting;

import com.dragon.cate.domain.base.ResponseVO;
import com.dragon.cate.domain.param.interesting.TopicParam;
import com.dragon.cate.domain.vo.TopicVO;
import com.dragon.cate.service.TopicService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 话题表(Topic)表控制层
 *
 * @author chl
 * @since 2019-04-27 10:14:15
 */
@RestController
@RequestMapping("web/topic")
public class TopicController {
    /**
     * 服务对象
     */
    @Resource
    private TopicService topicService;


    @RequestMapping("create")
    @ResponseBody
    public ResponseVO create(@RequestBody TopicParam topicParam) {
        int row = topicService.createTopic(topicParam);
        return ResponseVO.ok(row > 0);
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("queryById")
    public TopicVO queryById(long id) {
        return this.topicService.queryById(id);
    }

}