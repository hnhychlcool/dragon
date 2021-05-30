package com.dragon.cate.service.learn.algorithm;

// 最长公共前缀
public class LongestCommonPrefix {

    public static String longestLongestPrefix(String[] strs) {
        int rows = strs.length;
        int length = strs[0].length();
        /**
         * flow
         * flower
         * floor
         * 思路:纵向比较字符串,只需要比较第一个字符串和第二个字符串即可
         */
        for (int i = 0; i < length; i++) {
            char ch = strs[0].charAt(i);
            // 已第一排字符串为参考,来比较后面排的字符串的长度和内容
            for (int j = 1; j < rows; j++) {
                // 说明: 这里由于i从0开始计数,所以一定是递增然后增长到与后面字符串长度相等为止,而不会出现大于的情况
                // i == strs[j].length 这个判断是在所有排字符都相等情况下,出现2个字符串的长度相等的情况,字符串的就是最长前缀
                // ch == strs[j].charAt(i) 这个是纵向从i开始逐个比较每个排的字符串内容,直到碰到不相等的为止
                if (i == strs[j].length() || ch != strs[j].charAt(i)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }

    public static void main(String[] args) {
//        String[] strs = new String[]{"flower", "floor", "flow", "foo"};
        String[] strs = new String[]{"flower", "floor", "flow"};
        System.out.println("longestLongestPrefix = " + longestLongestPrefix(strs));
    }
}
