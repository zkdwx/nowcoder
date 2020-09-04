package com.wx.swordMeansOffer;


public class jz61 {
    int index = -1;

    public String Serialize(TreeNode root) {
        if (root == null) {
            return "#";
        }
        return root.val + "," + Serialize(root.left) + "," + Serialize(root.right);

    }

    public TreeNode Deserialize(String str) {
        String[] arr = str.split(",");
        index++;
        if (index > str.length()) {
            return null;
        }
        TreeNode root = null;
        if (!arr[index].equals("#")) {
            root = new TreeNode(Integer.parseInt(arr[index]));
            root.left = Deserialize(str);
            root.right = Deserialize(str);
        }
        return root;
    }
}
