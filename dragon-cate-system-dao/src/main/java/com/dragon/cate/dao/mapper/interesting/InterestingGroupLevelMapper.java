package com.dragon.cate.dao.mapper.interesting;

import com.dragon.cate.domain.dbo.interesting.InterestingGroupLevel;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 兴趣小组级别表(InterestingGroupLevel)表数据库访问层
 *
 * @author chl
 * @since 2019-04-17 19:16:56
 */
public interface InterestingGroupLevelMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    InterestingGroupLevel queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InterestingGroupLevel> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param interestingGroupLevel 实例对象
     * @return 对象列表
     */
    List<InterestingGroupLevel> queryAll(InterestingGroupLevel interestingGroupLevel);

    /**
     * 新增数据
     *
     * @param interestingGroupLevel 实例对象
     * @return 影响行数
     */
    int insert(InterestingGroupLevel interestingGroupLevel);

    /**
     * 修改数据
     *
     * @param interestingGroupLevel 实例对象
     * @return 影响行数
     */
    int update(InterestingGroupLevel interestingGroupLevel);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}