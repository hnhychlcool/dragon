package com.dragon.cate.dao.mapper.shopper;

import com.dragon.cate.shopper.ShopperInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by chl on 2017/10/29.
 */
@Mapper
public interface ShopperMapper {

    public ShopperInfo getShopperInfoById(long id);

}
