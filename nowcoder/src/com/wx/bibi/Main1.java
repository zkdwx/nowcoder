package com.wx.bibi;

import java.util.ArrayList;
import java.util.List;

public class Main1 {

    public static int GetMaxConsecutiveOnes(int[] arr, int k) {
        if (k > arr.length) return arr.length;
        int max = 0;
        List<Integer> list = new ArrayList<>(); //index
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                list.add(i);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            int[] array = new int[arr.length];

            for (int j = 0; j < arr.length; j++) {
                array[j] = arr[j];
            }
            int kk = k;
            for (int j = list.get(i); j < array.length; j++) {

                if (kk > 0 && array[j] == 0) {
                    array[j] = 1;
                    kk--;
                }
            }
            max = Math.max(max, fun(array));
        }


        return max;
    }

    private static int fun(int[] arr) {
        int sum = 0;
        int max = -1;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int tmp = sum + arr[i];
            if (tmp > sum) {
                sum = tmp;
                count++;
            } else {
                max = Math.max(count, max);
                count = 0;
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        System.out.println(GetMaxConsecutiveOnes(arr, 2));
    }


}
