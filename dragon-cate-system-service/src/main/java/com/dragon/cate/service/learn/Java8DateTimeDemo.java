package com.dragon.cate.service.learn;

import java.time.LocalDate;

public class Java8DateTimeDemo {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        // 取每月指定的日期
        System.out.println(today.withDayOfMonth(1));


    }
}
