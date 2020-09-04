package com.wx.swordMeansOffer;

public class jz51 {
    public static int[] multiply(int[] A) {
        int len = A.length;
        int[] arr1 = new int[len];
        int[] arr2 = new int[len];
        int[] arr = new int[len];
        arr1[0] = A[0];
        arr2[0] = A[len - 1];
        for (int i = 1; i < len; i++) {
            arr1[i] = A[i] * arr1[i - 1];
            arr2[i] = A[len - i - 1] * arr2[i - 1];
        }
        arr[0] = arr2[len - 2];
        arr[len - 1] = arr1[len - 2];
        for (int i = 1; i < len - 1; i++) {
            arr[i] = arr1[i - 1] * arr2[len - i - 2];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] multiply = multiply(arr);
        System.out.println(multiply);
    }
}
