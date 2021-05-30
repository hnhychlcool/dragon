package com.dragon.cate.service.learn.algorithm.common;

import com.google.common.base.Joiner;
import lombok.Data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Data
public class ListNode {
    public int value;
    public ListNode next;

    public ListNode(int value) {
        this.value = value;
        next = null;
    }

    public static ListNode createListNodes(int[] nums) {
        if (null == nums || nums.length == 0) {
            return null;
        }
        LinkedList<ListNode> linkedList = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            linkedList.add(new ListNode(nums[i]));
        }
        for (int i = 0; i < linkedList.size() - 1; i++) {
            linkedList.get(i).setNext(linkedList.get(i + 1));
        }
        return linkedList.get(0);
    }

    public static void printList(ListNode list) {
        if (list == null)
            return;
        List<Integer> res = new ArrayList<>();
        while (list != null) {
            res.add(list.getValue());
            list = list.next;
        }
        System.out.println("list = " + Joiner.on("->").join(res));
    }
}