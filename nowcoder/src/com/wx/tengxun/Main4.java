package com.wx.tengxun;

import java.util.Arrays;
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Arrays.sort(arr);
        int mid = n / 2 - 1;
        for (int i = 0; i < arr.length; i++) {
            if (i <= mid) {
                System.out.println(arr[mid + 1]);
            } else if (i >= mid + 1) {
                System.out.println(arr[mid]);
            }
        }
    }
}
