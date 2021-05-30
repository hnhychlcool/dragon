package com.dragon.cate.service.learn.algorithm;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/liang-ge-lian-biao-de-di-yi-ge-gong-gong-jie-dian-lcof/
 * <p>
 * 输入两个链表，找出它们的第一个公共节点。
 */
public class FirstIntersectionNode {


    /**
     * 假设listA的节点长度为a,公共节点为node,那么从headA到node需要遍历的节点个数为a - c
     * 同理,假设listB的节点长度为b,公共节点为node,那么从headB到node需要遍历的节点个数为b - c
     * 考虑构建两个节点指针 A , B 分别指向两链表头节点 headA , headB ，做如下操作：
     * <p>
     * 指针 A 先遍历完链表 headA ，再开始遍历链表 headB ，当走到 node 时，共走步数为：
     * a + (b - c)
     * 指针 B 先遍历完链表 headB ，再开始遍历链表 headA ，当走到 node 时，共走步数为：
     * b + (a - c)
     * 如下式所示，此时指针 A , B 重合，并有两种情况：
     * <p>
     * a + (b - c) = b + (a - c)
     * a+(b−c)=b+(a−c)
     * <p>
     * 若两链表 有 公共尾部 (即 c > 0) ：指针 A , B 同时指向「第一个公共节点」node 。
     * 若两链表 无 公共尾部 (即 c = 0) ：指针 A , B 同时指向 null 。
     */
    public static Node getIntersectionNode(Node headA, Node headB) {
        Node nodeA = headA;
        Node nodeB = headB;
        // 说明:从headA遍历一遍listA+listB 与从headB遍历完listB+listA 经过的节点数量相同,如果listA和listB有公共节点,则会出现nodeA = nodeB
        // 的情况,否则null
        // 这里边界条件还没理清楚,执行结果不匹配
        while (nodeA != nodeB) {
            nodeA = nodeA != null ? nodeA.next : headB;
            nodeB = nodeB != null ? nodeB.next : headA;
        }
        return nodeA;
    }


    @Data
    static class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        int[] arrA = new int[]{4, 1, 8, 4, 5};
        int[] arrB = new int[]{5, 0, 1, 8, 4, 5};

        List<Node> listA = creatList(arrA);
        List<Node> listB = creatList(arrB);
        Node intersectionNode = getIntersectionNode(listA.get(0), listB.get(0));
        System.out.println("intersection Node is  = " + intersectionNode.getVal());
    }

    private static List<Node> creatList(int[] arrA) {
        if (null == arrA || arrA.length == 0)
            return null;
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < arrA.length; i++) {
            Node node = new Node(arrA[i]);
            if (i > 0) {
                list.get(i - 1).setNext(node);
            }
            list.add(node);
        }
        return list;
    }
}
