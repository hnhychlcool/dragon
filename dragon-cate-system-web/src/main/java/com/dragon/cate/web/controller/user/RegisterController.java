package com.dragon.cate.web.controller.user;

import com.dragon.cate.base.ResponseVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller("register")
public class RegisterController {

    @RequestMapping("signIn")
    @ResponseBody
    public Object signIn() {
        return ResponseVO.success();
    }
}
