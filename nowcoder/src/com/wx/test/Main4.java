package com.wx.test;

import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();       //样例数
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();   //房子个数
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int[] count = new int[n];
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = j - 1; k >= 0; k--) {
                    if (arr[k] > arr[j]) break;
                    if (arr[k] <= arr[j]) {
                        sum++;
                    }
                }
                for (int k = j + 1; k < n; k++) {
                    if (arr[k] > arr[j]) break;
                    if (arr[k] <= arr[j]) {
                        sum++;
                    }
                }
                count[j] = sum;
            }
            for (int x : count) {
                System.out.println(x);
            }
        }
    }
}
