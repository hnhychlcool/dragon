package com.dragon.cate.service.learn;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {
        BiConsumer biConsumer = (x, y) -> {
            System.out.println(x + "input, return " + y);
        };
        biConsumer.accept("good work", "luck");
    }
}
