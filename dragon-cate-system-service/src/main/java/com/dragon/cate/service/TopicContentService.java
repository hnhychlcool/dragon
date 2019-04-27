package com.dragon.cate.service;

import com.dragon.cate.domain.vo.TopicContentVO;

import java.util.List;

/**
 * @author chl
 * @since 2019-04-27 10:16:17
 */
public interface TopicContentService {

    TopicContentVO queryById(long id);

    List<TopicContentVO> queryByTopicId(long id);

}