package com.dragon.cate.dao.mapper.interesting;

import com.dragon.cate.domain.dbo.interesting.TopicDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 话题表(TopicDO)表数据库访问层
 *
 * @author chl
 * @since 2019-04-27 10:07:24
 */
public interface TopicMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TopicDO queryById(long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<TopicDO> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param TopicDO 实例对象
     * @return 对象列表
     */
    List<TopicDO> queryAll(TopicDO TopicDO);

    /**
     * 新增数据
     *
     * @param TopicDO 实例对象
     * @return 影响行数
     */
    int insert(TopicDO TopicDO);

    /**
     * 修改数据
     *
     * @param TopicDO 实例对象
     * @return 影响行数
     */
    int update(TopicDO TopicDO);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(long id);

}