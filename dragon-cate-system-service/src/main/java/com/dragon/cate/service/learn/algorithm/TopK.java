package com.dragon.cate.service.learn.algorithm;

import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.PriorityQueue;

public class TopK {


    // 在元素数据较少不考虑内存限制和时间复杂度时最简单的实现方式
    public int[] simpleTopK(int[] arr, int k) {
        //先排序，然后选择前k个即可
        Arrays.sort(arr);
        int[] res = new int[k];
        for (int i = 0; i < k; ++i) {
            res[i] = arr[i];
        }
        return res;
    }

    /**
     * @param arr
     * @param k
     * @return top k
     */
    public static int[] topK(int[] arr, int k) {
        //加个边界条件的判断
        if (k == 0) {
            return new int[0];
        }
        //创建最大堆
        PriorityQueue<Integer> queue = new PriorityQueue<>((num1, num2) -> num1 - num2);
        //先在堆中放数组的前k个元素
        for (int i = 0; i < k; ++i) {
            queue.offer(arr[i]);
        }
        //因为是最大堆，也就是堆顶的元素是堆中最大的，遍历数组后面元素的时候，
        //如果当前元素比堆顶元素大，就把堆顶元素给移除，然后再把当前元素放到堆中，
        for (int i = k; i < arr.length; ++i) {
            if (queue.peek() < arr[i]) {
                queue.poll();
                queue.offer(arr[i]);
            }
        }
        //最后再把堆中元素转化为数组
        int[] res = new int[k];
        for (int i = 0; i < k; ++i) {
            res[i] = queue.poll();
        }
        return res;
    }

    public static int[] myTopK(int[] nums, int k) {
        // 构建k个元素的最大堆
        PriorityQueue<Integer> queue = new PriorityQueue<>((num1, num2) -> num1 - num2);
        // 其他元素跟堆顶元素对比
        for (int i = 0; i < k; i++) {
            queue.offer(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
            if (queue.peek() < nums[i]) {
                queue.poll();
                queue.offer(nums[i]);
            }
        }
        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = queue.poll();
        }
        return res;
    }


    public static void main(String[] args) {
        int[] nums = new int[]{21, 0, 3, 2, 9, 5, 4, 11, 13, 43, 65, -2, 21, 11, 77, 100};
        int k = 3;
        System.out.println("topK = " + JSON.toJSONString(topK(nums, k)));
        System.out.println("topK = " + JSON.toJSONString(myTopK(nums, k)));
    }
}
