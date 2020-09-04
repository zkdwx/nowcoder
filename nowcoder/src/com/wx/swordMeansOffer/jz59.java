package com.wx.swordMeansOffer;


import java.util.*;

public class jz59 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        LinkedList<TreeNode> linkedList = new LinkedList<>();
        boolean b = true;
        linkedList.add(pRoot);
        while (!linkedList.isEmpty()) {
            int size = linkedList.size();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode tmp = linkedList.poll();
                if (tmp == null) continue;
                if (b) {
                    arrayList.add(tmp.val);
                } else {
                    arrayList.add(0, tmp.val);
                }
                linkedList.add(tmp.left);
                linkedList.add(tmp.right);
            }
            if (arrayList.size() != 0) {
                list.add(arrayList);
            }
            b = !b;
        }
        return list;
    }
}
