package com.dragon.cate.service.learn.algorithm;

import com.alibaba.fastjson.JSON;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class TreeTest {

    /**
     * 广度优先遍历二叉树
     *
     * @param root
     * @return
     */
    public static int[] bfs(BinaryTree.TreeNode root) {
        if (root == null)
            return new int[0];
        Queue<BinaryTree.TreeNode> queue = new LinkedList<BinaryTree.TreeNode>() {{
            add(root);
        }};
        ArrayList<Integer> ans = new ArrayList<>();
        while (!queue.isEmpty()) {
            BinaryTree.TreeNode node = queue.poll();
            ans.add(node.getData());
            if (node.getLeft() != null)
                queue.offer(node.getLeft());
            if (node.getRight() != null)
                queue.offer(node.getRight());
        }
        Integer[] arr = ans.toArray(new Integer[ans.size()]);
        int[] res = Arrays.stream(arr).mapToInt(Integer::valueOf).toArray();
        return res;
    }

    public static void main(String[] args) {
//        int[] datas = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        Integer[] datas = new Integer[]{3, 9, 20, null, null, 15, 7};
        BinaryTree tree = BinaryTree.createBiTree(datas);
        int[] res = bfs(tree.getRoot());
        System.out.println("after bfs data is  = " + JSON.toJSONString(res));
    }
}

@Data
class BinaryTree {

    private TreeNode root = null;

    @Data
    class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    private void buildTree(TreeNode node, Integer data) {
        if (root == null) {
            root = new TreeNode(data);
            return;
        }
        if (data == null)
            return;
        if (data < node.getData()) {
            if (node.getLeft() == null)
                node.setLeft(new TreeNode(data));
            else
                buildTree(node.getLeft(), data);
        } else {
            if (node.getRight() == null)
                node.setRight(new TreeNode(data));
            else
                buildTree(node.getRight(), data);
        }
    }

    public static BinaryTree createBiTree(Integer[] datas) {
        BinaryTree tree = new BinaryTree();
        for (Integer data : datas)
            tree.buildTree(tree.getRoot(), data);
        return tree;
    }
}

