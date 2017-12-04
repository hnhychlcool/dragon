package com.dragon.cate.dao.meta;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;


@Getter
@Setter
public class ShopperInfoDO {


    private long id;

    private int cityId;

    private String shopperTitle;

    private String shopperDesc;

    private String shopperTips;

    private BigDecimal storePrice;

    private BigDecimal favorablePrice;

    private int soldCount;

    private long commentId;

    private BigDecimal latitude;

    private BigDecimal longtitude;

    private Date createTime;
}
