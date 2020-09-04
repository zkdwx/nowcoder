package com.wx.swordMeansOffer;

public class Solution23 {
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return isBST(sequence, 0, sequence.length - 1);

    }

    private boolean isBST(int[] sequence, int start, int end) {
        if (start >= end) {
            return true;
        }
        int i = 0;
        for (; i < end; i++) {
            if (sequence[i] > sequence[end]) {
                break;
            }
        }
        for (int j = i; j < end; j++) {
            if (sequence[j] < sequence[end]) {
                return false;
            }
        }
        return isBST(sequence, 0, i - 1) && isBST(sequence, i, end - 1);
    }

    public static void main(String[] args) {
        Solution23 solution23 = new Solution23();
        int[] sequence = {1,2,3};
        boolean b = solution23.VerifySquenceOfBST(sequence);
        System.out.println(b);
    }
}
