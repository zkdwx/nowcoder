package com.wx.swordMeansOffer;

public class jz39 {
    public static boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) return true;
        if (Math.abs(TreeDepth(root.left) - TreeDepth(root.right)) > 1) {
            return false;
        }
        return IsBalanced_Solution(root.left) && IsBalanced_Solution(root.right);


    }

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
}
