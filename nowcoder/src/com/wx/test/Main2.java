package com.wx.test;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       //木棍个数
        int[] arr = new int[n];      //长度数组
        int count=0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 1; i < n-1; i++) {
            if (arr[i]>arr[i+1]){
                if (arr[i-1]+arr[i+1]>=arr[i]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
