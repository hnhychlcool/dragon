package com.dragon.cate.service.impl;

import com.dragon.cate.dao.mapper.interesting.TopicContentResponseMapper;
import com.dragon.cate.domain.dbo.interesting.TopicContentResponseDO;
import com.dragon.cate.domain.param.interesting.TopicContentResponseParam;
import com.dragon.cate.domain.vo.TopicContentResponseVO;
import com.dragon.cate.service.TopicContentResponseService;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * 话题内容回帖表(TopicContentResponse)表控制层
 * @author chl
 * @since 2019-04-27 10:21:22
 */
@Service("topicContentResponseService")
public class TopicContentResponseServiceImpl implements TopicContentResponseService {

    @Resource
    private TopicContentResponseMapper topicContentResponseMapper;

    @Override
    public TopicContentResponseVO queryById(long id) {
        TopicContentResponseVO topicContentResponseVO = new TopicContentResponseVO();
        TopicContentResponseDO topicContentResponseDO = topicContentResponseMapper.queryById(id);
        BeanUtils.copyProperties(topicContentResponseDO, topicContentResponseVO);
        return topicContentResponseVO;
    }

    @Override
    public List<TopicContentResponseVO> queryByContentId(long contentId) {
        List<TopicContentResponseDO> topicContentResponseDOS = topicContentResponseMapper.queryByContentId(contentId);
        List<TopicContentResponseVO> topicContentResponseVOS = Lists.newArrayList();
        if (CollectionUtils.isEmpty(topicContentResponseDOS)) {
            return null;
        }
        topicContentResponseDOS.stream().forEach(topicContentResponseDO -> {
            TopicContentResponseVO topicContentResponseVO = new TopicContentResponseVO();
            BeanUtils.copyProperties(topicContentResponseDO, topicContentResponseVO);
            topicContentResponseVOS.add(topicContentResponseVO);
        });
        return topicContentResponseVOS;
    }

    @Override
    public int createTopicContentResponse(TopicContentResponseParam topicContentResponseParam) {
        TopicContentResponseDO topicContentResponseDO = new TopicContentResponseDO();
        BeanUtils.copyProperties(topicContentResponseParam, topicContentResponseDO);
        return topicContentResponseMapper.insert(topicContentResponseDO);
    }
}