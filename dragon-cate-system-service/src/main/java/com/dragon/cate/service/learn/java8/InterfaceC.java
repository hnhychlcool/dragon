package com.dragon.cate.service.learn.java8;

@FunctionalInterface
interface InterfaceC extends InterfaceA, InterfaceB {

    public void dream();

    @Override
    default int sumNumber(int x, int y) {
        return InterfaceA.super.sumNumber(x, y);
    }

    @Override
    default int getScore() {
        return 0;
    }

    @Override
    default int fly() {
        return 0;
    }
}
