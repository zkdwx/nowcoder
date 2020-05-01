package com.wx.schoolRecruitmentFor2019;

import java.util.Scanner;

/**
 * 数字序列第n位的值
 */
public class TheValueOfTheNthDigitOfTheNumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();        //输入的整数
        if (n<1) return;
        if(n==1 || n==2){
            System.out.println(n);
            return;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + i - 1;
        }
        for (int i = 1; i < dp.length-1; i++) {
            if (dp[i] <= n && dp[i + 1] > n) {
                System.out.println(i);
                return;
            }
        }
    }

}
