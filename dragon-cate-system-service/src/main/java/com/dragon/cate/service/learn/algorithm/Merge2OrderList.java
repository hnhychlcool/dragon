package com.dragon.cate.service.learn.algorithm;

import com.dragon.cate.service.learn.algorithm.common.ListNode;

/**
 * https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/solution/mian-shi-ti-25-he-bing-liang-ge-pai-xu-de-lian-b-2/
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * <p>
 * 示例1：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 */
public class Merge2OrderList {

    /**
     * 引入伪头节点： 由于初始状态合并链表中无节点，因此循环第一轮时无法将节点添加到合并链表中。解决方案：初始化一个辅助节点 dumdum 作为合并链表的伪头节点，将各节点添加至 dumdum 之后。
     */
    public static ListNode merge(ListNode list1, ListNode list2) {

        // dum 虚拟头结点, cur 游标
        ListNode dum = new ListNode(0), cur = dum;

        while (list1 != null && list2 != null) {
            if (list1.value < list2.value) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }
            cur = cur.next;
        }
        // list1,list2 中元素少的结束的,cur保留更长的链表
        cur.next = list1 != null ? list1 : list2;
        // dum作为一个虚拟的节点,保留cur的起始节点
        return dum.next;
    }

    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 4};
        int[] nums2 = new int[]{1, 3, 4};
        ListNode list1 = ListNode.createListNodes(nums1);
        ListNode list2 = ListNode.createListNodes(nums2);
        ListNode res = merge(list1, list2);
        System.out.println("merged list is: ");
        ListNode.printList(res);
    }
}
