package com.dragon.cate.service.impl;

import com.dragon.cate.dao.mapper.shopper.ShopperMapper;
import com.dragon.cate.domain.dbo.shopper.ShopperInfoDO;
import com.dragon.cate.service.ShopperService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by chl on 2017/10/29.
 */
@Service
public class ShopperServiceImpl implements ShopperService {

    @Resource
    private ShopperMapper shopperMapper;

    @Override
    public ShopperInfoDO getShopperInfoById(long id) {
        return shopperMapper.getShopperInfoById(id);
    }

}
