package com.dragon.cate.service.learn.algorithm;


public class NumberRevert {

    public static int revert(int num) {
        int res = 0;
        while (num != 0) {
            // NUM = 1234
            int digit = num % 10;
            num /= 10;
            res = res * 10 + digit;
        }
        return res;
    }

    public static void main(String[] args) {
        int a = 1234;
        System.out.println("revert = " + revert(a));
    }
}
