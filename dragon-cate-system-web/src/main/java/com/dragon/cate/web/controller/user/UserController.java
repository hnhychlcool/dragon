package com.dragon.cate.web.controller.user;

import com.dragon.cate.base.ResponseVO;
import com.dragon.cate.bo.UserBO;
import com.dragon.cate.dbo.UserDO;
import com.dragon.cate.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户信息表(UserDO)表控制层
 *
 * @author chl
 * @since 2019-03-21 11:24:08
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public UserDO selectOne(Long id) {
        return this.userService.queryById(id);
    }

    @RequestMapping("signIn")
    @ResponseBody
    public Object signIn(@RequestBody UserBO user) {
        UserDO userDO = new UserDO();
        BeanUtils.copyProperties(user, userDO);
        userService.insert(userDO);
        return ResponseVO.success();
    }

}