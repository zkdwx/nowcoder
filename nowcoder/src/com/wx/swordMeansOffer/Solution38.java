package com.wx.swordMeansOffer;

public class Solution38 {
    public static int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.right == null) {
            return TreeDepth(root.left) + 1;
        }
        if (root.left == null && root.right != null) {
            return TreeDepth(root.right) + 1;
        }
        return Math.max(TreeDepth(root.left), TreeDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(0);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        int i = TreeDepth(root);
        System.out.println(i);

    }
}
