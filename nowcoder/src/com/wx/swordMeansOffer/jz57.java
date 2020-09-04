package com.wx.swordMeansOffer;

public class jz57 {
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null) return null;
        if (pNode.right != null) {
            pNode = pNode.right;
            while (pNode != null) {
                pNode = pNode.left;
            }
            return pNode;
        }
        while (pNode.next != null && pNode.next.right == pNode) {
            pNode = pNode.next;
        }
        return pNode.next;
    }
}
