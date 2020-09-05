package com.wx.nowcoder;

import java.util.ArrayList;
import java.util.List;

/**
 * 分别按照二叉树先序，中序和后序打印所有的节点。
 */
public class NC45 {
    public int[][] threeOrders(TreeNode root) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> list3 = new ArrayList<>();
        preOrder(root, list1);
        midOrder(root, list2);
        postOrder(root, list3);
        int[][] arr = new int[3][list1.size()];
        for (int j = 0; j < list1.size(); j++) {
            arr[0][j] = list1.get(j);
            arr[1][j] = list2.get(j);
            arr[2][j] = list3.get(j);
        }
        return arr;
    }

    private void preOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }

    private void midOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        midOrder(root.left, list);
        list.add(root.val);
        midOrder(root.right, list);
    }


    private void postOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        postOrder(root.left, list);
        postOrder(root.right, list);

        list.add(root.val);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        TreeNode node1 = new TreeNode();
        TreeNode node2 = new TreeNode();
        TreeNode node3 = new TreeNode();
        TreeNode node4 = new TreeNode();
        TreeNode node5 = new TreeNode();
        TreeNode node6 = new TreeNode();
        root.val = 1;
        node1.val = 2;
        node2.val = 3;
        node3.val = 4;
        node4.val = 5;
        node5.val = 6;
        node6.val = 7;

        root.left = node1;
        root.right = node2;
        node1.left = node3;
        node1.right = node4;
        node2.left = node5;
        node2.right = node6;


        NC45 nc = new NC45();
        int[][] threeOrders = nc.threeOrders(root);
        System.out.println(threeOrders);
    }


}
