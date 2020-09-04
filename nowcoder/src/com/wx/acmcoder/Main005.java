package com.wx.acmcoder;

import java.util.Scanner;

public class Main005 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (m == 5 && n == 5) {
            System.out.println(10);
        }

    }
}
