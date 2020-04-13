package com.wx.test;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       //优惠券个数
        int m = sc.nextInt();       //商品个数
        int[] a = new int[n];
        int[] b = new int[m];
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            countA += a[i];
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
            countB += b[i];
        }
        System.out.println(countB - countA);
    }
}
