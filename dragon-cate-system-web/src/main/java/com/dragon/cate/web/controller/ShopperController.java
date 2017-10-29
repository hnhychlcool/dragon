package com.dragon.cate.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;

/**
 * Created by chl on 2017/8/26.
 */
@Controller
@RequestMapping("shopper")
public class ShopperController {

    @PostConstruct
    public void init() {
        System.out.println("init shopper...");
    }

    @RequestMapping("index")
    @ResponseBody
    public Object index() {
        System.out.println("hello, my own first web site");
        return "hello, my own first web site";
    }

}
