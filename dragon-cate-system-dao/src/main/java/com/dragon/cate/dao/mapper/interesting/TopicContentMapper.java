package com.dragon.cate.dao.mapper.interesting;

import com.dragon.cate.domain.dbo.interesting.TopicContentDO;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * 话题内容表(TopicContentDO)表数据库访问层
 *
 * @author chl
 * @since 2019-04-27 10:15:57
 */
public interface TopicContentMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TopicContentDO queryById(long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TopicContentDO> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param TopicContentDO 实例对象
     * @return 对象列表
     */
    List<TopicContentDO> queryAll(TopicContentDO TopicContentDO);

    /**
     * 新增数据
     *
     * @param TopicContentDO 实例对象
     * @return 影响行数
     */
    int insert(TopicContentDO TopicContentDO);

    /**
     * 修改数据
     *
     * @param TopicContentDO 实例对象
     * @return 影响行数
     */
    int update(TopicContentDO TopicContentDO);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(long id);

    List<TopicContentDO> queryByTopicId(long id);

    int deleteByTopicId(long topicId);
}