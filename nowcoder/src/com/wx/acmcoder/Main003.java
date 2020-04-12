package com.wx.acmcoder;

import java.util.Scanner;

public class Main003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int r = minTime(s1, s2);
        if (r <= 2) {
            System.out.println(s2);
        } else {
            System.out.println("null");
        }
    }

    public static int minTime(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        if (word1.equals(word2)) return 0;
        if (len1 == 0 && len2 != 0) return len2;
        if (len2 == 0 && len1 != 0) return len1;
        int[][] dp = new int[len1 + 1][len2 + 1];
        dp[0][0] = 0;
        for (int i = 1; i <= len1; i++) {
            dp[i][0] = i;
        }
        for (int i = 1; i <= len2; i++) {
            dp[0][i] = i;
        }
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i][j - 1] + 1, dp[i - 1][j] + 1), dp[i - 1][j - 1] + 1);
                }
            }
        }
        return dp[len1][len2];
    }
}

