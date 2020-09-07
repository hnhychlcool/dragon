package com.dragon.cate.service.learn.algorithm;

import java.util.HashMap;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的
 * 那 两个 整数，并返回他们的数组下标。
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class TwoSum {

    /**
     * 暴利法,时间复杂度O(n²),control+command+空格搜索2,输入平方
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum1(int[] nums, int target) {
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            // j = i + 1 的目的是减少重复计算和避免两个元素下标相同
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == dif) {
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }


    /**
     * 利用map来查找减少循环,但是map 读写有一定开销,但在大数据量时,hash能
     * 大幅缩小循环次数,所以效率有明显提升
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int dif = target - nums[i];
            if (map.get(dif) != null) {
                res[0] = map.get(dif);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{2, 7, 11, 8, 20};
        int target = 28;

        int [] index1 = twoSum1(arr, target);
        int [] index2 = twoSum1(arr, target);

        System.out.println(1/10);

//        System.out.println("index1 = [" + JSON.toJSONString(index1) + "]");
//        System.out.println("index2 = [" + JSON.toJSONString(index2) + "]");

    }

}
