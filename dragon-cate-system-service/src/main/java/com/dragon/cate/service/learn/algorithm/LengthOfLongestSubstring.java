package com.dragon.cate.service.learn.algorithm;

import com.google.common.collect.Maps;
import org.springframework.util.StringUtils;

import java.util.Map;

/**
 * 查找最长子串
 */
public class LengthOfLongestSubstring {


    /**
     * 通过滑动窗口方式获取
     *
     * @return
     */
    public static int getLongestSubStringLen(String s) {
        if (StringUtils.isEmpty(s)) {
            return 0;
        }
        int result = 0, len = s.length();
        Map<Character, Integer> map = Maps.newHashMap();
        // j 遍历整个字符串,i标记元素的最大下标
        for (int i = 0, j = 0; j < len; j++) {
            char tmp = s.charAt(j);
            if (map.containsKey(tmp)) {
                i = Math.max(map.get(tmp), i);
            }
            result = Math.max(result, j - i + 1);
            map.put(tmp, j + 1);
        }
        return result;
    }


    public static void main(String[] args) {
        String str = "abcabcbb";
        int lenth1 = getLongestSubStringLen(str);
        System.out.println("lenth = " + lenth1);
    }
}
