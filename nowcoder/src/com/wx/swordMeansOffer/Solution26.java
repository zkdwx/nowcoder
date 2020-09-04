package com.wx.swordMeansOffer;

public class Solution26 {
    private TreeNode treeNode = null;

    public void Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return;
        }
        Convert(pRootOfTree.left);
        pRootOfTree.left = treeNode;
        if (treeNode != null) {
            treeNode.left=pRootOfTree;
            treeNode.right = pRootOfTree;
        }
        treeNode = pRootOfTree;
        Convert(pRootOfTree.right);
    }
}
