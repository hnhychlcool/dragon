package com.dragon.cate.web.controller.discover.interesting;

import com.dragon.cate.domain.base.ResponseVO;
import com.dragon.cate.domain.param.interesting.TopicContentParam;
import com.dragon.cate.domain.vo.TopicContentVO;
import com.dragon.cate.service.TopicContentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 话题内容表(TopicContent)表控制层
 * @author chl
 * @since 2019-04-27 10:16:57
 */
@RestController
@RequestMapping("web/topicContent")
public class TopicContentController {

    @Resource
    private TopicContentService topicContentService;

    @RequestMapping("create")
    @ResponseBody
    public ResponseVO create(@RequestBody TopicContentParam topicParam) {
        int row = topicContentService.createTopicContent(topicParam);
        return ResponseVO.ok(row > 0);
    }

    /**
     * 通过主键查询单条数据
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("queryById")
    public ResponseVO queryById(long id) {
        TopicContentVO topicContentVO = topicContentService.queryById(id);
        return ResponseVO.success(topicContentVO);
    }

}