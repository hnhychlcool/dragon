package com.dragon.cate.service.impl;

import com.dragon.cate.dao.mapper.ShopperMapper;
import com.dragon.cate.service.ShopperService;
import com.dragon.cate.shopper.ShopperInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chl on 2017/10/29.
 */
@Service
public class ShopperServiceImpl implements ShopperService {

//    @Resource
    private ShopperMapper shopperMapper;

    @Override
    public ShopperInfo getShopperInfoById(long id) {
        return null;
    }
}
