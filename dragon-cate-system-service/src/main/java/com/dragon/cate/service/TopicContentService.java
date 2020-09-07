package com.dragon.cate.service;

import com.dragon.cate.domain.param.interesting.TopicContentParam;
import com.dragon.cate.domain.vo.TopicContentVO;

import java.util.List;

/**
 * @author chl
 * @since 2019-04-27 10:16:17
 */
public interface TopicContentService {

    TopicContentVO queryById(long id);

    int deleteById(long id);

    int deleteByTopicId(long topicId);

    List<TopicContentVO> queryByTopicId(long id);

    int createTopicContent(TopicContentParam topicParam);
}