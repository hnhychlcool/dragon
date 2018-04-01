package com.dragon.cate.service.learn;

import com.dragon.cate.service.domain.Dog;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JavaBasicDemo {

    public static void main(String[] args) {
        Dog dog = new Dog();
//        String owner = dog.getOwner();
//        System.out.println("dog owner is:" + owner);
        Field[] superFields = dog.getClass().getSuperclass().getDeclaredFields();
        for (Field f : superFields) {
            String fn = f.getName();
            System.out.println("field is :" + fn);
            if (fn.equalsIgnoreCase("owner")) {
                f.setAccessible(true);
//                dog.setOwner("chl");
//            boolean dogCanAccess  = f.canAccess(dog.getOwner());
//            if (!dogCanAccess) {
//                f.setAccessible(true);
            }
        }
        System.out.println("dog = " + dog);
    }


    public static void linxingOperator() {
        Map<String, Integer> oldWordCounts = new HashMap<String, Integer>();
        // 1.7开始支持的菱形操作符,不指定具体类型,通过变量类型做出推断
        Map<String, Integer> diamondWordCounts = new HashMap<>();

        // 1.7 数值允许使用_分隔
        int x =123_45_6;
        // 1.7 支持try-with-resource
    }


}
