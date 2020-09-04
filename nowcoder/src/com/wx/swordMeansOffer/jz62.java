package com.wx.swordMeansOffer;

import java.util.ArrayList;
import java.util.List;

public class jz62 {
    List<TreeNode> list = new ArrayList<>();

    TreeNode KthNode(TreeNode pRoot, int k) {
        orderTree(pRoot);
        if (k >= 1 && list.size() >= k) {
            return list.get(k - 1);
        }
        return null;

    }

    public void orderTree(TreeNode root) {
        if (root != null) {
            orderTree(root.left);
            list.add(root);
            orderTree(root.right);
        }
    }
}
