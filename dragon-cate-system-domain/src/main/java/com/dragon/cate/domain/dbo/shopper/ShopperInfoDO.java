package com.dragon.cate.domain.dbo.shopper;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;


@Data
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

    private LocalDateTime createTime;

    private LocalDateTime updateTime;

}
