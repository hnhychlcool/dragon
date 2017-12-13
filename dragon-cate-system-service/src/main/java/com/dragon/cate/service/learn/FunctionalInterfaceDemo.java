package com.dragon.cate.service.learn;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionalInterfaceDemo {


    public static void main(String[] args) {
        Function<String, String> function = (x) -> {
            return "hello " + x;
        };

        System.out.println("function: " + function.apply("world"));

        Supplier<String> supplier = () -> {
            return "string data source";
        };
        System.out.println("supplier:" + supplier.get());

        Consumer<String> consumer = (x) -> {
            // use x do sth
            x = "x is deal by chl";
            System.out.println(x);
        };
        consumer.accept("code");

    }

}
