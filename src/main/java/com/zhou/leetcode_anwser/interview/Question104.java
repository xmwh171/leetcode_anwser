package com.zhou.leetcode_anwser.interview;

/**
 * @Description 二叉树的最大深度
 * @Author xiaohu
 * @Date 2020/1/21 9:28
 */
public class Question104 {

    /**
     给定一个二叉树，找出其最大深度。
     二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
     说明: 叶子节点是指没有子节点的节点。
     示例：
     给定二叉树 [3,9,20,null,null,15,7]，
     3
     / \
     9  20
     /  \
     15   7
     返回它的最大深度 3 。
     */

    /**
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        return 0;
    }

    private static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
}
