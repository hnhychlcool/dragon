package com.dragon.cate.service.learn.algorithm;

import com.alibaba.fastjson.JSON;

/**
 * 数组去除重复元素
 */
public class RemoveDuplicates {

    // 由于数组有序,所以相同的元素是相邻的
    // 算法思路:由快慢2个指针fast和slow分别记录当前元素,如果元素相同,则fast跳过去,直到fast和slow的元素不同时,向左覆盖元素,实现去重
    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) {
            return 0;
        }
        int fast = 1, slow = 1;
        while (fast < n) {
            if (nums[fast] != nums[fast - 1]) {
                nums[slow] = nums[fast];
                ++slow;
            }
            ++fast;
        }
        System.out.println("afect rows = " + slow);
        return slow;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 1, 2};
        removeDuplicates(nums);
        System.out.println("new nums is = " + JSON.toJSONString(nums));
    }
}
