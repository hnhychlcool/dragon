package com.dragon.cate.service.learn.algorithm;

import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

/**
 * 求最长回文算法
 */
public class LongestPalindrome {


    // 回文:正向字符串内容与逆向字符串的内容一样,如S=aba, S'=aba, S=S',aba就是回文


    public static String aroundCenterLongestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    /**
     * 方法1: 中心扩展算法:回文可以看做是中心对称的最长公共子串
     *
     * @param s
     * @param left
     * @param right
     * @return
     */
    private static int expandAroundCenter(String s, int left, int right) {
        int L = left, R = right;
        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
            L--;
            R++;
        }
        return R - L - 1;
    }

    public static void main(String[] args) {
//        String str = "caba";
//        String str = "abcdcba";
        String str = "abc";

        String aroundCenterResult = aroundCenterLongestPalindrome(str);
        System.out.println("aroundCenterResult = [" + aroundCenterResult + "]");

        String manacherResult = manacherLongestPalindrome(str);
        System.out.println("manacherResult = [" + manacherResult + "]");
    }



    /*
    * Manacher's Algorithm 马拉车算法
    * 解决字符串个数奇偶个数问题(奇数个字符中心位置有n个,偶数个字符中心位置有n-1个),通过对字符串添加特殊处理来保证字符串永远是奇数
    *
    * 首先我们解决下奇数和偶数的问题，在每个字符间插入 "#"，并且为了使得扩展的过程中，到边界后自动结束
    * 在两端分别插入 "^" 和 "$"，两个不可能在字符串中出现的字符，这样中心扩展的时候，判断两端字符是否
    * 相等的时候，如果到了边界就一定会不相等，从而出了循环。经过处理，字符串的长度永远都是奇数了。
    *   如下处理: n--->n+n+1=2n+1 为奇数个,精妙的设计点
    *   aba --->  ^ a # b # a $   (一共7个元素)
    *   ab  --->  ^ a # b $       (一共5个元素)
    * */


    public static String preProcess(String s) {
        int n = s.length();
        String ret = "^";
        for (int i = 0; i < n; i++)
            ret += "#" + s.charAt(i);
        ret += "#$";
        return ret;
    }

    // 马拉车算法
    public static String manacherLongestPalindrome(String s) {
        Assert.isTrue(!StringUtils.isEmpty(s), "字符串并不能为空");
        String T = preProcess(s);
        int n = T.length();
        int[] P = new int[n];
        int C = 0, R = 0;
        for (int i = 1; i < n - 1; i++) {
            int i_mirror = 2 * C - i;
            if (R > i) {
                P[i] = Math.min(R - i, P[i_mirror]);// 防止超出 R
            } else {
                P[i] = 0;// 等于 R 的情况
            }

            // 碰到之前讲的三种情况时候，需要利用中心扩展法
            while (T.charAt(i + 1 + P[i]) == T.charAt(i - 1 - P[i])) {
                P[i]++;
            }

            // 判断是否需要更新 R
            if (i + P[i] > R) {
                C = i;
                R = i + P[i];
            }

        }

        // 找出 P 的最大值
        int maxLen = 0;
        int centerIndex = 0;
        for (int i = 1; i < n - 1; i++) {
            if (P[i] > maxLen) {
                maxLen = P[i];
                centerIndex = i;
            }
        }
        int start = (centerIndex - maxLen) / 2; //最开始讲的求原字符串下标
        return s.substring(start, start + maxLen);
    }

}
