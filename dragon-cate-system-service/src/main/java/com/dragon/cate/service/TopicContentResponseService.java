package com.dragon.cate.service;

import com.dragon.cate.domain.param.interesting.TopicContentResponseParam;
import com.dragon.cate.domain.vo.TopicContentResponseVO;

import java.util.List;

/**
 * @author chl
 * @since 2019-04-27 10:21:10
 */
public interface TopicContentResponseService {

    TopicContentResponseVO queryById(long id);

    List<TopicContentResponseVO> queryByContentId(long id);

    int createTopicContentResponse(TopicContentResponseParam topicContentResponseParam);
}