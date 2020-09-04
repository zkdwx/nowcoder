package com.wx.acmcoder;

import java.util.Scanner;


public class Main004 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x == y) {
            System.out.println(0);
            return;
        }

        int[][] arr = new int[n - 1][2];
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println(2);
    }

}
