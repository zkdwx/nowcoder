package com.wx.schoolRecruitmentFor2019;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < N; i++) {
            int key = sc.nextInt();
            int value = sc.nextInt();
            map.put(key, value);
        }
        int[] A = new int[M];
        for (int i = 0; i < M; i++) {
            A[i] = sc.nextInt();
        }
        maxRemuneration(N, M, map, A);
    }

    private static void maxRemuneration(int N, int M, Map<Integer, Integer> map, int[] A) {
        if (A.length == 0) return;
        int[] diff = new int[N];
        int j = 0;
        for (int a : map.keySet()) {
            diff[j++] = a;
        }
        Arrays.sort(diff);
        for (int i = 0; i < M; i++) {
            for (int k = 0; k < N; k++) {
                if (A[i] == diff[k]) {
                    System.out.println(map.get(diff[k]) + " ");
                    break;
                }
                if (A[i] < diff[k]) {
                    System.out.println(map.get(diff[k - 1]) + " ");
                    break;
                }

            }
        }
    }
}
