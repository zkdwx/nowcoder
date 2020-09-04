package com.wx.swordMeansOffer;

public class Solution37 {
    static int count = 0;

    public static int GetNumberOfK(int[] array, int k) {
        partion(0, array.length - 1, array, k);
        return count;
    }

    private static void partion(int i, int j, int[] arr, int k) {
        if (i > j) return;
        int mid = (i + j) / 2;
        if (arr[mid] == k) {
            count++;
        }
        partion(i, mid - 1, arr, k);
        partion(mid + 1, j, arr, k);
    }

    public static void main(String[] args) {
        int[] array = {3,3,3,3,4,5};
        int i = GetNumberOfK(array, 3);
        System.out.println(i);
    }
}
