package com.dragon.cate.dao.mapper.user;

import com.dragon.cate.domain.dbo.user.UserDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserDO queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserDO> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param UserDO 实例对象
     * @return 对象列表
     */
    List<UserDO> queryAll(UserDO UserDO);

    /**
     * 新增数据
     *
     * @param UserDO 实例对象
     * @return 影响行数
     */
    int insert(UserDO UserDO);

    /**
     * 修改数据
     *
     * @param UserDO 实例对象
     * @return 影响行数
     */
    int update(UserDO UserDO);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

    UserDO queryByCondition(UserDO userDO);
}
