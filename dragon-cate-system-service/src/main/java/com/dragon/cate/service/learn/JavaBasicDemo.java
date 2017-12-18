package com.dragon.cate.service.learn;

import com.dragon.cate.service.domain.Dog;

import java.lang.reflect.Field;

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
                dog.setOwner("chl");
//            boolean dogCanAccess  = f.canAccess(dog.getOwner());
//            if (!dogCanAccess) {
//                f.setAccessible(true);
            }
        }
        System.out.println("dog = " + dog);
    }


}
