package com.dragon.cate.service.learn.java8;

public class FunctionalInterfaceDemo implements InterfaceA, InterfaceB {


    //    @Test
    public void test() {
        sumNumber(2, 3);
    }

    @Override
    public int sumNumber(int x, int y) {
        System.out.println("this is child implements...");
        return InterfaceB.super.sumNumber(x, y);
    }

    /**
     * @desc 这个静态方法跟InterfaceA中的静态方法无关
     */
    static int method(int x, int y) {
        InterfaceA.method(x, y);
        return x + y + x;
    }

    @Override
    public int getScore() {
        return 0;
    }

    @Override
    public int fly() {
        return 0;
    }
}
