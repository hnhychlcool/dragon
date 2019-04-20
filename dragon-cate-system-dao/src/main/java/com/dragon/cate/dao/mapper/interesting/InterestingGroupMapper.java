package com.dragon.cate.dao.mapper.interesting;

import com.dragon.cate.domain.dbo.interesting.InterestingGroupDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

;

/**
 * 兴趣组基本信息表(InterestingGroupDO)表数据库访问层
 *
 * @author chl
 * @since 2019-04-20 11:36:55
 */
public interface InterestingGroupMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    InterestingGroupDO queryById(Object id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<InterestingGroupDO> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param interestingGroupDO 实例对象
     * @return 对象列表
     */
    List<InterestingGroupDO> queryAll(InterestingGroupDO interestingGroupDO);

    /**
     * 新增数据
     *
     * @param interestingGroupDO 实例对象
     * @return 影响行数
     */
    int insert(InterestingGroupDO interestingGroupDO);

    /**
     * 修改数据
     *
     * @param interestingGroupDO 实例对象
     * @return 影响行数
     */
    int update(InterestingGroupDO interestingGroupDO);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

}