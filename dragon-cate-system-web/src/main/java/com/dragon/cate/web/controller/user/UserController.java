package com.dragon.cate.web.controller.user;

import com.alibaba.fastjson.JSONObject;
import com.dragon.cate.domain.base.ResponseVO;
import com.dragon.cate.domain.dbo.user.UserDO;
import com.dragon.cate.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 用户信息表(UserDO)表控制层
 *
 * @author chl
 * @since 2019-03-21 11:24:08
 */
@Controller
@RequestMapping("/web/user")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("selectOne")
    public UserDO selectOne(Long id) {
        return this.userService.queryById(id);
    }


    @RequestMapping(value = "logIn", method = RequestMethod.POST)
    @ResponseBody
    public Object logIn(@RequestBody JSONObject user) {
        String name = user.getString("name");
        String email = user.getString("email");
        String phone = user.getString("phone");
        String password = user.getString("password");
        Assert.isTrue(!StringUtils.isEmpty(name) || !StringUtils.isEmpty(email) || !StringUtils.isEmpty(phone), "用户名/邮箱/手机 内容不能都为空");
        Assert.isTrue(!StringUtils.isEmpty(password), "用户密码不能为空");
        UserDO existedUser = userService.queryByCondition(user);
        Assert.notNull(existedUser, "输入的用户不存在");
        // check pwd
        Assert.isTrue(existedUser.getPassword().equals(password), "您的用户名和密码不匹配");
        return ResponseVO.success();
    }

    @RequestMapping(value = "signIn", method = RequestMethod.POST)
    @ResponseBody
    public Object signIn(@RequestBody JSONObject jsonObject) {
        UserDO userDO = jsonObject.toJavaObject(UserDO.class);
        userService.insert(userDO);
        return ResponseVO.success();
    }

}