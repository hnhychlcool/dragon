package com.dragon.cate.service.learn.algorithm;

import com.alibaba.fastjson.JSON;

/**
 * https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/solution/jie-di-qi-jiang-jie-fen-zu-wei-yun-suan-by-eddievi/
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 * 示例 1：
 * <p>
 * 输入：nums = [4,1,4,6]
 * 输出：[1,6] 或 [6,1]
 */
public class SingleNumbers {

    public static int[] singleNumbers(int[] nums) {
        // 用于将所有数异或起来
        int k = 0;
        for (int num : nums) {
            k ^= num;
        }
        // 获取k中最低位的1
        int mask = 1;
        //mask = k & (-k) 这种方法也可以得到mask，具体原因百度 哈哈哈哈哈
        while ((k & mask) == 0) {
            // 从最低位往左移动1位,直至取到k的最低位1
            mask <<= 1;
        }
        int a = 0, b = 0;
        for (int num : nums) {
            // mask =1 , & == 0说明num只出现了一次
            if ((num & mask) == 0)
                a ^= num;
            else
                b ^= num;
        }
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 4, 6};
        System.out.println("singleNumbers = " + JSON.toJSONString(singleNumbers(nums)));
    }
}
