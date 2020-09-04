package com.wx.acmcoder;

import java.util.*;

public class Main001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[] arr1 = new int[m];
            int[] arr2 = new int[n];
            for (int i = 0; i < m; i++) {
                arr1[i] = scanner.nextInt();
            }
            for (int i = 0; i < n; i++) {
                arr2[i] = scanner.nextInt();
            }

            Set<Integer> set = new TreeSet<>();
            for (int i = 0; i < m; i++) {
                set.add(arr1[i]);
            }
            for (int i = 0; i < n; i++) {
                set.add(arr2[i]);
            }
            set.forEach(x -> System.out.print(x + " "));
            System.out.println();
        }
    }
}
