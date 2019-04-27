package com.dragon.cate.web.controller.discover.interesting;

import com.dragon.cate.domain.vo.TopicContentResponseVO;
import com.dragon.cate.service.TopicContentResponseService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 话题内容回帖表(TopicContentResponse)表控制层
 *
 * @author chl
 * @since 2019-04-27 10:21:45
 */
@RestController
@RequestMapping("web/topicContentResponse")
public class TopicContentResponseController {
    /**
     * 服务对象
     */
    @Resource
    private TopicContentResponseService topicContentResponseService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("queryById")
    public TopicContentResponseVO queryById(long id) {
        return this.topicContentResponseService.queryById(id);
    }

}