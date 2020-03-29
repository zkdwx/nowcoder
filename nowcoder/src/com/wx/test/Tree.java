package com.wx.test;

import java.util.Arrays;

/**
 * 例如：前序：1，2，4，7，3，5，6，8
 *         中序：4，7，2，1，5，3，6，8
 *
 *         后序：7，4，2，5，8，6，3，1
 *
 *   方法1：如果需要重构再输出后序
 *    步骤如下：
 *        1.根据前序确定根节点就是第一个；
 *        2.根据根节点在中序的位置确定左右子树
 *       3.递归重复上述1 2 步骤
 *       4.二叉树重构完成
 *        5.再递归后序遍历二叉树
 *        如此递归
 */
public class Tree {
    public static TreeNode buildTree(int[] pre,int[] order){
        if (pre.length==0 || order.length==0) return null;
        TreeNode root=new TreeNode(pre[0]);
        for (int i = 0; i < order.length; i++) {
            if(order[i]==pre[0]){
                root.left=buildTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(order,0,i));
                root.right=buildTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(order,i+1,order.length));
            }
        }
        return root;
    }
    public static void postTree(TreeNode root){
        if (root!=null){
            postTree(root.left);
            postTree(root.right);
            System.out.print(root.val+" ");
        }
    }

    public static void main(String[] args) {
        int[] pre={1,2,4,7,3,5,6,8};
        int[] ord={4,7,2,1,5,3,8,6};
        TreeNode root=buildTree(pre,ord);
        postTree(root);
    }
}
