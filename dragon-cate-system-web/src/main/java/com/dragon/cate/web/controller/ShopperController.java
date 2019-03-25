package com.dragon.cate.web.controller;

import com.dragon.cate.domain.base.ResponseVO;
import com.dragon.cate.domain.dbo.shopper.ShopperInfoDO;
import com.dragon.cate.service.ShopperService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by chl on 2017/8/26.
 */
@Controller
@RequestMapping("shopper")
public class ShopperController {

    @Resource
    private ShopperService shopperService;

    @RequestMapping("getShopperById")
    @ResponseBody
    public Object getShopperById(long id) {
        ShopperInfoDO shopperInfo = shopperService.getShopperInfoById(id);
        return ResponseVO.success();
    }

    @RequestMapping("index")
    @ResponseBody
    public Object index() {
        return "hello, my own first web site";
    }

}
