package com.wx.schoolRecruitmentFor2019;

import java.util.Scanner;

public class Solution5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();            //x和y均不大于n
        int k = sc.nextInt();             //余数大于等于k
        if (k > n) return;
        System.out.println(shudui(n, k));

    }

    private static long shudui(int n, int k) {
        int len = n - k;
        long res1 = (1 + len) ;
        long res=res1*len/2;
        for (int i = k; i <= n; i++) {
            if (n % i >= k)
                res++;
        }
        return res;
    }

}

/**
 * 用例:
 * 88856 768
 *
 * 对应输出应该为:
 *
 * 7465536938
 *
 * 你的输出为:
 *
 * -415091372
 */
