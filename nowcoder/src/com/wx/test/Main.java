package com.wx.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();       //几组数据
        for (int k = 0; k < t; k++) {
            int n = sc.nextInt();       //数组的长度
            if (n == 1) {
                System.out.println("YES");
                return;
            }
            int[] arrA = new int[n];
            int[] arrB = new int[n];
            for (int i = 0; i < n; i++) {
                arrA[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arrB[i] = sc.nextInt();
            }
            int[] arr = new int[n];       //差值数组
            for (int i = 0; i < n; i++) {
                arr[i] = arrB[i] - arrA[i];
            }
            int startIndex = 0;
            int endIndex = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] != 0) {
                    startIndex = i;
                    break;
                }
            }
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] != 0) {
                    endIndex = i;
                    break;
                }
            }
            if (startIndex==endIndex){
                System.out.println("YES");
                return;
            }
            for (int i = startIndex; i <= endIndex; i++) {
                if (arr[i] != arr[startIndex]) {
                    System.out.println("NO");
                    return;
                }
            }
            System.out.println("YES");
        }

    }


}
