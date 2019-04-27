package com.dragon.cate.service.impl;

import com.dragon.cate.dao.mapper.interesting.TopicContentMapper;
import com.dragon.cate.domain.dbo.interesting.TopicContentDO;
import com.dragon.cate.domain.param.interesting.TopicContentParam;
import com.dragon.cate.domain.vo.TopicContentResponseVO;
import com.dragon.cate.domain.vo.TopicContentVO;
import com.dragon.cate.service.TopicContentResponseService;
import com.dragon.cate.service.TopicContentService;
import com.google.common.collect.Lists;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.List;

/**
 * 话题内容表(TopicContent)表控制层
 *
 * @author chl
 * @since 2019-04-27 10:16:29
 */
@Service("topicContentService")
public class TopicContentServiceImpl implements TopicContentService {

    @Resource
    private TopicContentMapper topicContentMapper;
    @Resource
    private TopicContentResponseService topicContentResponseService;

    @Override
    public TopicContentVO queryById(long id) {
        TopicContentDO topicContentDO = topicContentMapper.queryById(id);
        Assert.notNull(topicContentDO, "不存在对应内容信息");
        List<TopicContentResponseVO> topicContentResponseVOList = topicContentResponseService.queryByContentId(topicContentDO.getId());
        TopicContentVO topicContentVO = new TopicContentVO();
        BeanUtils.copyProperties(topicContentDO, topicContentVO);
        topicContentVO.setContentResponseVOList(topicContentResponseVOList);
        return topicContentVO;
    }

    @Override
    public List<TopicContentVO> queryByTopicId(long id) {
        List<TopicContentDO> topicContentDOList = topicContentMapper.queryByTopicId(id);
        if (CollectionUtils.isEmpty(topicContentDOList)) {
            return null;
        }
        List<TopicContentVO> topicContentVOList = Lists.newArrayList();
        topicContentDOList.stream().forEach(topicContentDO -> {
            TopicContentVO topicContentVO = new TopicContentVO();
            BeanUtils.copyProperties(topicContentDO, topicContentVO);
            long topicContentId = topicContentDO.getId();
            List<TopicContentResponseVO> topicContentResponseVOS = topicContentResponseService.queryByContentId(topicContentId);
            topicContentVO.setContentResponseVOList(topicContentResponseVOS);
            topicContentVOList.add(topicContentVO);
        });
        return topicContentVOList;
    }

    @Override
    public int createTopicContent(TopicContentParam topicParam) {
        TopicContentDO topicContentDO = new TopicContentDO();
        BeanUtils.copyProperties(topicParam, topicContentDO);
        return topicContentMapper.insert(topicContentDO);
    }

}