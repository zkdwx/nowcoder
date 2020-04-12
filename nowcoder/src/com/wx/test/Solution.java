package com.wx.test;

public class Solution {
    public boolean canJump(int[] A) {
        int n = A.length;
        boolean[] f = new boolean[n];
        f[0] = true;
        for (int j = 0; j < n; j++) {
            f[j] = false;
            for (int i = 0; i < j; i++) {
                if (f[i] && i + A[i] >= j) {
                    f[j] = true;
                    break;
                }
            }
        }
        return f[n - 1];
    }
}
