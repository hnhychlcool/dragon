
package com.dragon.cate.service.learn;

import com.dragon.cate.domain.shopper.ShopperInfo;
import com.google.common.collect.Lists;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {

    public static void main(String[] args) {
        List<ShopperInfo> shopperInfoList = Lists.newArrayList();

        shopperInfoList.stream().toArray(String[]::new);
        shopperInfoList.stream().collect(Collectors.toList());
        shopperInfoList.stream().map(ShopperInfo::getAddress).map(String::toUpperCase);


        char ch = '我';
//        System.out.println("char value is:" + ch);
//        shopperInfoList.stream().flatMap(shopperInfo->shopperInfo.getName().stream()).collect(Collectors.toSet());

//        IntStream.range(1, 3).forEach(System.out::println);

//        IntStream.rangeClosed(1, 3).forEach(System.out::println);

//        function();

        List<Integer> list = Lists.newArrayList(3, 4, 5);

        shopperInfoList.stream().filter(shopperInfo -> shopperInfo.getName().equalsIgnoreCase("chl")).mapToLong(shopperInfo -> shopperInfo.getId()).sum();

        shopperInfoList.stream().sorted(Comparator.comparing(shopperInfo -> shopperInfo.getName()));

        int sum = list.stream().reduce(0, (x, y) -> x + y);
        System.out.println("sum = [" + sum + "]");
    }


    public static void function() {
        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());
    }

}
