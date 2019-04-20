package com.dragon.cate.dao.mapper.education;

import com.dragon.cate.domain.dbo.education.DepartmentDO;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 学校院系信息表(DepartmentDO)表数据库访问层
 *
 * @author chl
 * @since 2019-03-22 13:17:20
 */
public interface DepartmentMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    DepartmentDO queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<DepartmentDO> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param departmentDO 实例对象
     * @return 对象列表
     */
    List<DepartmentDO> queryAll(DepartmentDO departmentDO);

    /**
     * 新增数据
     *
     * @param departmentDO 实例对象
     * @return 新增行的主键id
     */
    int insert(DepartmentDO departmentDO);

    /**
     * 修改数据
     *
     * @param departmentDO 实例对象
     * @return 影响行数
     */
    int update(DepartmentDO departmentDO);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}