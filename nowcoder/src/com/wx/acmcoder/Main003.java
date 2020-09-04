package com.wx.acmcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main003 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (!list.contains(arr[i][j])) {
                    list.add(arr[i][j]);
                    break;
                }
            }
        }
        list.forEach(x -> System.out.println(x));
    }
}
