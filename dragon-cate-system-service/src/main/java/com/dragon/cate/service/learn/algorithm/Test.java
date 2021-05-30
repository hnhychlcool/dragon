package com.dragon.cate.service.learn.algorithm;

import com.google.common.collect.Lists;

import java.util.List;

public interface Test {

    public static final int abc = 1;
    public static final String str = "aaa";

    public static void main(String[] args) {
        List<Integer> list = Lists.newArrayList(1, 2, 3, 4, 5, 6, 7, 8);
        list.stream().forEach(System.out::print);
    }
}
