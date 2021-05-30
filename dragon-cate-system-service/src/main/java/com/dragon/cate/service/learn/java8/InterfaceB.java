package com.dragon.cate.service.learn.java8;

@FunctionalInterface
interface InterfaceB {

    int fly();

    default int sumNumber(int x, int y) {
        System.out.println("this is InterfaceB implements...");
        return x * y;
    }
}
