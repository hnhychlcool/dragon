package com.dragon.cate.service.learn;

import com.dragon.cate.shopper.ShopperInfo;
import com.google.common.collect.Lists;

import java.util.List;

public class StreamDemo {

    public static void main(String[] args) {
        List<ShopperInfo> shopperInfoList = Lists.newArrayList();


        char ch = '我';
        System.out.println("char value is:" + ch);
//        shopperInfoList.stream().flatMap(shopperInfo->shopperInfo.getName().stream()).collect(Collectors.toSet());
    }


}
