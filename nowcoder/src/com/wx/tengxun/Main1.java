package com.wx.tengxun;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int[] arr1 = new int[m];
        for (int i = 0; i < m; i++) {
            arr1[i] = scanner.nextInt();
        }
        int n = scanner.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr2[i] = scanner.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            while (i < m && arr1[i] > arr2[j]) {
                i++;
            }
            while (j < n && arr2[j] > arr1[i]) {
                j++;
            }
            while (i < m && j < n && arr1[i] == arr2[j]) {
                list.add(arr1[i]);
                i++;
                j++;
            }
        }
        list.forEach(x -> System.out.println(x + " "));
    }
}
