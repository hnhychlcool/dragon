package com.dragon.cate.service.learn.algorithm;

/**
 * 判断数字是否是回文数
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 * <p>
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 * x = -121 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 算法思想:这里用到整数倒置逻辑,回文数是以中心数字的对称数值,只要判断收尾两端的数字是否以中心数字对称即可
 */
public class PalindromeNumber {

    public static boolean isPalindromeNumber(int x) {
        // 0 和负数不是回文
        if (x < 0 || (x % 10 == 0 && x != 0))
            return false;
        int res = 0;
        // 这里用到了数字倒转的核心算法
        while (x > res) {
            int digit = x % 10;
            res = res * 10 + digit;
            x /= 10;
        }
        return res == x || x == res / 10;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(x + "isPalindromeNumber = " + isPalindromeNumber(x));
    }

}
