package com.dragon.cate.web.controller.discover.interesting;

import com.dragon.cate.domain.dbo.interesting.TopicContentDO;
import com.dragon.cate.service.TopicContentService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 话题内容表(TopicContent)表控制层
 *
 * @author chl
 * @since 2019-04-27 10:16:57
 */
@RestController
@RequestMapping("topicContent")
public class TopicContentController {
    /**
     * 服务对象
     */
    @Resource
    private TopicContentService topicContentService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TopicContentDO queryById(Object id) {
        return this.topicContentService.queryById(id);
    }

}