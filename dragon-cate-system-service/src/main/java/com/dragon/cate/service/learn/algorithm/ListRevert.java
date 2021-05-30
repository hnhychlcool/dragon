package com.dragon.cate.service.learn.algorithm;

import com.dragon.cate.service.learn.algorithm.common.ListNode;

/**
 * 链表反转
 * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/solution/fan-zhuan-lian-biao-yi-dong-de-shuang-zhi-zhen-jia/
 */
public class ListRevert {

    public static ListNode revert(ListNode head) {
        if (head == null)
            return null;
        // cur 逐个往后移动,直至列表最后
        ListNode cur = head;
        // cur 记录head,开始遍历后,cur变成head的next,head.next变成head.next.next,head.next.next替换为cur
        while (head.next != null) {
            ListNode pre = head.next.next;
            head.next.next = cur;
            cur = head.next;
            head.next = pre;
        }
        return cur;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        ListNode head = ListNode.createListNodes(nums);
        ListNode.printList(head);
        head = revert(head);
        System.out.println("after revert list is:");
        ListNode.printList(head);
    }

}
