package com.wx.schoolRecruitmentFor2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TheAbyssOfMagic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();       //表示有M组测试数据
        int[] arr = new int[M];
        for (int k = 0; k < M; k++) {
            arr[k] = sc.nextInt();    //台阶数
        }
        for (int x : arr) {
            getWays(x);
        }
    }

    private static List<Integer> getStepList(int N) {
        List<Integer> list = new ArrayList<>();
        int i = 1;
        while (N > 0) {
            list.add(i);
            N -= i;
            i *= 2;
        }
        return list;
    }

    private static void getWays(int N) {
        int[] dp = new int[N + 1];
        dp[0] = 1;
        for (int i = 1; i <= N; i++) {
            List<Integer> list = getStepList(N);
            for (int j : list) {
                if (i >= j) {
                    dp[i] += dp[i - j];
                    dp[i] = dp[i] % 1000000003;
                }

            }
        }
        System.out.println(dp[N]);
    }
}
