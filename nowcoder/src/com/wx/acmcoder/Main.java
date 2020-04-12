package com.wx.acmcoder;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nStr = sc.nextLine();
        int n = Integer.parseInt(nStr);           //电话记录数
        Map<Integer, Integer> map = new HashMap<>();
        int[] start = new int[n];
        int[] end = new int[n];
        boolean[] b = new boolean[n];
        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            String[] strArr = s.split(",");
            start[i] = Integer.parseInt(strArr[0]);
            end[i] = Integer.parseInt(strArr[1]);
        }
        int count = 1;
        b[0] = true;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (start[i] < end[j] && b[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}

