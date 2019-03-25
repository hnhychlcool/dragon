package com.dragon.cate.dao.mapper.shopper;

import com.dragon.cate.domain.dbo.shopper.ShopperInfoDO;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by chl on 2017/10/29.
 */
@Mapper
public interface ShopperMapper {

    ShopperInfoDO getShopperInfoById(long id);

}
