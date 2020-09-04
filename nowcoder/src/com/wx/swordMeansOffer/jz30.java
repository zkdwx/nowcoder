package com.wx.swordMeansOffer;

public class jz30 {
    public static int FindGreatestSumOfSubArray(int[] array) {
        int[] dp = new int[array.length];
        dp[0] = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            dp[i] = dp[i - 1] > 0 ? dp[i - 1] + array[i] : array[i];
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {6, -3, -2, 7, -15, 1, 2, 2};
        int i = FindGreatestSumOfSubArray(array);
        System.out.println(i);
    }
}
