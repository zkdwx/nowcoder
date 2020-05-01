package com.wx.test;


import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       //乘客数量
        if (n < 1 || n > 1000) return;
        Map<Integer, Integer> map = new TreeMap<>();
        int[] arr = new int[n];
        int[] res = new int[n];  //结果标志
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            if (key < 1 || key > 100000 || value < 1 || value > 100000) return;
            map.put(key, value);
            arr[i] = key;
        }

        Arrays.sort(arr);
        res[0] = 1;
        for (int i = 1; i <= n - 1; i++) {
            int last = map.get(arr[i - 1]);
            int curr = map.get(arr[i]);
            if (curr >= last) {
                res[i] = 1;
            } else {
                res[i] = 0;
            }
        }
        int sum = 0;
        for (int x : res) {
            sum += x;
        }
        System.out.println(sum);
    }


}
