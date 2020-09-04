package com.wx.pingduoduo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || i + j == n - 1) {
                    arr[i][j] = 0;
                }
            }
        }
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                arr[i][n / 2] = 0;
                arr[n / 2][i] = 0;
            }
        }

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                if (j>i){
                    arr[i][j] = 2;
                }
            }
        }

        for (int i = 0; i < n/2; i++) {
            for (int j = n/2; j < n; j++) {
                if (j>i){
                    arr[i][j] = 1;
                }
            }
        }

        for (int i = 0; i <n/2 ; i++) {
            for (int j = 0; j < n/2; j++) {
                if (i>j){
                    arr[i][j] = 3;
                }
            }
        }

        for (int i = n/2; i <n ; i++) {
            for (int j = 0; j < n/2; j++) {
                if (i>j){
                    arr[i][j] = 4;
                }
            }
        }

        for (int i = n/2; i <n ; i++) {
            for (int j = 0; j < n/2; j++) {
                if (i>j){
                    arr[i][j] = 5;
                }
            }
        }
    }
}
