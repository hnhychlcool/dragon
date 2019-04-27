package com.dragon.cate.service.impl;

import com.dragon.cate.dao.mapper.interesting.TopicMapper;
import com.dragon.cate.domain.dbo.interesting.TopicDO;
import com.dragon.cate.domain.vo.TopicContentVO;
import com.dragon.cate.domain.vo.TopicVO;
import com.dragon.cate.service.TopicContentResponseService;
import com.dragon.cate.service.TopicContentService;
import com.dragon.cate.service.TopicService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import java.util.List;

/**
 * 话题表(Topic)表控制层
 *
 * @author chl
 * @since 2019-04-27 10:13:51
 */
@Service("topicService")
public class TopicServiceImpl implements TopicService {

    @Resource
    private TopicMapper topicMapper;
    @Resource
    private TopicContentService topicContentService;

    @Override
    public TopicVO queryById(long id) {
        TopicDO topicDO = topicMapper.queryById(id);
        Assert.notNull(topicDO, "topic信息不存在,请确认输入的id是否准确");
        TopicVO topicVO = new TopicVO();
        List<TopicContentVO> topicContentVOS = topicContentService.queryByTopicId(topicDO.getId());
        BeanUtils.copyProperties(topicDO, topicVO);
        topicVO.setTopicContentVOList(topicContentVOS);
        return topicVO;
    }

}