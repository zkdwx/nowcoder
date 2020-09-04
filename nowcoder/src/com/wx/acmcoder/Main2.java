package com.wx.acmcoder;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < m; i++) {
            int key = scanner.nextInt();
            int value = scanner.nextInt();
            map.put(key, value);
            if (key <= 0) {
                System.out.println(0);
                return;
            }
        }

        int count = 1;
        int[] arr = new int[m];
        int k = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (k < m) {
                arr[k++] = entry.getValue();

            }
        }
        int max = arr[0];
        for (int i = 1; i < m; i++) {
            if (arr[i] > max) {
                count++;
                max = arr[i];
            }
        }
        System.out.println(count);
    }
}
