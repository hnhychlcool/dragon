package com.dragon.cate.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.dragon.cate.dao.mapper.user.UserMapper;
import com.dragon.cate.domain.dbo.user.UserDO;
import com.dragon.cate.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户信息表(UserDO)表服务实现类
 *
 * @author makejava
 * @since 2019-03-21 11:24:07
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public UserDO queryById(Long id) {
        return this.userDao.queryById(id);
    }

    @Override
    public UserDO queryByCondition(JSONObject condition) {
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(condition, userDO);
        return userDao.queryByCondition(userDO);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<UserDO> queryAllByLimit(int offset, int limit) {
        return this.userDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param UserDO 实例对象
     * @return 实例对象
     */
    @Override
    public UserDO insert(UserDO UserDO) {
        this.userDao.insert(UserDO);
        return UserDO;
    }

    /**
     * 修改数据
     *
     * @param UserDO 实例对象
     * @return 实例对象
     */
    @Override
    public UserDO update(UserDO UserDO) {
        this.userDao.update(UserDO);
        return this.queryById(UserDO.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.userDao.deleteById(id) > 0;
    }
}