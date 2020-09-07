package com.dragon.cate.service.learn.algorithm;

import com.google.common.collect.Maps;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * 查找
 */
public class LengthOfLongestSubstring {


    /**
     * 通过滑动窗口方式获取
     *
     * @return
     */
    public static int getLongestLength1(String s) {
        if (StringUtils.isEmpty(s)) {
            return 0;
        }
        int result = 0, len = s.length();
        Map<Character, Integer> map = Maps.newHashMap();
            for (int j = 0, i = 0; j < len; j++) {
                char tmp = s.charAt(j);
                if(map.containsKey(tmp)) {
                    i = Math.max(map.get(tmp), i);
                }
                result = Math.max(result, j - i +1);
                map.put(tmp, j+1);
            }
        return result;
    }


    /**
     * @param s
     * @return
     */
    public static int getLongestLength3(String s) {
        if (StringUtils.isEmpty(s)) {
            return 0;
        }
        int result = 0, len = s.length();
        int[] index = new int[128];
        for (int j = 0, i = 0; j < len; j++) {
            char cur = s.charAt(j);
            i = Math.max(index[cur], i);
            result = Math.max(result, j - i + 1);
            index[cur] = j + 1;
        }
        return result;
    }


    public static void main(String[] args) {
        String str = "aba";
        int lenth1 = getLongestLength1(str);
        System.out.println("lenth = " + lenth1);
        int lenth3 = getLongestLength3(str);
        System.out.println("lenth = " + lenth3);
    }
}
