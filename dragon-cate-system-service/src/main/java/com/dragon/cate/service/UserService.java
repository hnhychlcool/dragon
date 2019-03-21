package com.dragon.cate.service;


import com.dragon.cate.dbo.UserDO;

import java.util.List;

/**
 * 用户信息表(UserDO)表服务接口
 *
 * @author makejava
 * @since 2019-03-21 11:24:01
 */
public interface UserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    UserDO queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<UserDO> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param UserDO 实例对象
     * @return 实例对象
     */
    UserDO insert(UserDO UserDO);

    /**
     * 修改数据
     *
     * @param UserDO 实例对象
     * @return 实例对象
     */
    UserDO update(UserDO UserDO);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}