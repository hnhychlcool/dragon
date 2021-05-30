package com.dragon.cate.service.learn.java8;

@FunctionalInterface
interface InterfaceA {

    int getScore();

    default int sumNumber(int x, int y) {
        System.out.println("this is InterfaceA implements...");
        return x + y;
    }

    static int method(int x, int y) {
        return x / y;
    }
}
