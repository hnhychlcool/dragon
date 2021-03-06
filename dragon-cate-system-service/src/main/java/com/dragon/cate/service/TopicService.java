package com.dragon.cate.service;

import com.dragon.cate.domain.param.interesting.TopicParam;
import com.dragon.cate.domain.vo.TopicVO;

/**
 * @author chl
 * @since 2019-04-27 10:13:32
 */
public interface TopicService {

    TopicVO queryById(long id);

    int createTopic(TopicParam topicParam);

    int deleteById(long id);
}