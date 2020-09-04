package com.wx.baidu;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if (n <= 9) {
            System.out.println(-1);
            return;
        }
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 5) {
                a++;
            } else {
                b++;
            }
        }
        if (b < 1 || a < 9) {
            System.out.println(-1);
            return;
        }
        int tmp = a / 9;
        a = tmp * 9;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a; i++) {
            sb.append(5);
        }
        for (int i = 0; i < b; i++) {
            sb.append(0);
        }
        System.out.println(sb.toString());
    }

}
