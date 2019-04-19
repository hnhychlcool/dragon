package com.dragon.cate.service.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Dog extends Animal {

    private String smellAbility;

    private String name;

    private String add;


    public void wangwangwang() {
        System.out.println("dog voice: wang wang wang...");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "smellAbility='" + smellAbility + '\'' +
                '}';
    }
}
