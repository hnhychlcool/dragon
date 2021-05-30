package com.dragon.cate.service.learn.algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。
 * <p>
 * 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下
 * <p>
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 */
public class ZString {

    public static String convert(String s, int numRows) {
        if (numRows < 2)
            return s;
        List<StringBuilder> rows = new ArrayList<>();
        // 每numRuws个字符连城一个字符串
        for (int i = 0; i < numRows; i++)
            rows.add(new StringBuilder());
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            // 算法最核心逻辑
            // i ==0 和 numRows -1 一头一尾,到头尾时,flag兑换
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i += flag;
        }
        return rows.stream().collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String str = "PAYDBADFECEPALISHIRING";
        System.out.println("after rever str is :" + convert(str, 4));
    }
}
