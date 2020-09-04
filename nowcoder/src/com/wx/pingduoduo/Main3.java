package com.wx.pingduoduo;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = scanner.nextInt();
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                if (i % arr[j] == 0) {
                    set.add(i);
                }
            }
        }
        System.out.println(set.size());
    }
}
