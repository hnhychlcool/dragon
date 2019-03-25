package com.dragon.cate.domain.shopper;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ShopperBasicDetail {

    private long id;

    private long cityId;

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
