package com.dragon.cate.dao.mapper.interesting;

import com.dragon.cate.domain.dbo.interesting.TopicContentResponseDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 话题内容回帖表(TopicContentResponseDO)表数据库访问层
 *
 * @author chl
 * @since 2019-04-27 10:20:48
 */
public interface TopicContentResponseMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TopicContentResponseDO queryById(Object id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TopicContentResponseDO> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param TopicContentResponseDO 实例对象
     * @return 对象列表
     */
    List<TopicContentResponseDO> queryAll(TopicContentResponseDO TopicContentResponseDO);

    /**
     * 新增数据
     *
     * @param TopicContentResponseDO 实例对象
     * @return 影响行数
     */
    int insert(TopicContentResponseDO TopicContentResponseDO);

    /**
     * 修改数据
     *
     * @param TopicContentResponseDO 实例对象
     * @return 影响行数
     */
    int update(TopicContentResponseDO TopicContentResponseDO);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

    List<TopicContentResponseDO> queryByContentId(long contentId);
}