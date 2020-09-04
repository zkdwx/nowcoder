package com.wx.swordMeansOffer;

public class jz58 {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null) return true;
        return isSame(pRoot.left, pRoot.right);
    }

    private boolean isSame(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) return true;
        if (node1 == null && node2 != null) return false;
        if (node1 != null && node2 == null) return false;
        if (node1.val != node2.val) return false;
        return isSame(node1.left, node2.right) && isSame(node1.right, node2.left);
    }
}
