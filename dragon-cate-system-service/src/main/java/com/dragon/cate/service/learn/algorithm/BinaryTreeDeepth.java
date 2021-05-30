package com.dragon.cate.service.learn.algorithm;

/**
 * 求二叉树的深度
 * https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
 * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 * <p>
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * <p>
 * 3
 * / \
 * 9  20
 * /  \
 * 15   7
 * 返回它的最大深度3
 * <p>
 * 树的后序遍历 / 深度优先搜索往往利用 递归 或 栈 实现，本文使用递归实现。
 * 关键点： 此树的深度和其左（右）子树的深度之间的关系。显然，此树的深度 等于 左子树的深度 与 右子树的深度 中的 最大值 +1+1
 */
public class BinaryTreeDeepth {

    /**
     * 方法一: 递归实现
     */
    public static int maxDeepth(BinaryTree.TreeNode root) {
        if (root == null)
            return 0;
        return Math.max(maxDeepth(root.left), maxDeepth(root.right)) + 1;
    }

}
