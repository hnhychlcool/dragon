package com.dragon.cate.web.controller;

import com.dragon.cate.base.ResponseVO;
import com.dragon.cate.dao.meta.ShopperInfoDO;
import com.dragon.cate.service.ShopperService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * Created by chl on 2017/8/26.
 */
@Controller
@RequestMapping("shopper")
public class ShopperController {

    @Resource
    private ShopperService shopperService;

    @PostConstruct
    public void init() {
        System.out.println("init shopper...");
    }


    @RequestMapping("index")
    @ResponseBody
    public Object getShopperById(long id) {
        ShopperInfoDO shopperInfo = shopperService.getShopperInfoById(id);
        return ResponseVO.success();
    }
//
//    @RequestMapping("index")
//    @ResponseBody
//    public Object index() {
//        System.out.println("hello, my own first web site");
//        return "hello, my own first web site";
//    }

}
