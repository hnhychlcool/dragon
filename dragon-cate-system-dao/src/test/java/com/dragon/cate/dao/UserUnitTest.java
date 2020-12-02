package com.dragon.cate.dao;

import com.dragon.cate.dao.mapper.user.UserMapper;
import com.dragon.cate.domain.dbo.user.UserDO;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;

import javax.annotation.Resource;


public class UserUnitTest extends TestNG {

    @Resource
    UserMapper userMapper;

    @Test
    private void addUser() {
        UserDO userDO = UserDO.builder().age(18).email("hnhychlcool@163.com").name("小伙ok").phone("15858261097").build();
        int rows = userMapper.insert(userDO);
        Assert.assertTrue(rows > 0, "add user failed...");
    }

}
