
package com.wx.schoolRecruitmentFor2019;

import java.util.Scanner;

public class GetTheMostBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       //表示有多少个红包
        int[] arr = new int[n];     //红包数组，每个数组代表红包大小
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long max = 0;
        int i = 0, j = n - 1;
        long sumi = arr[0];     //计算从左边起的累加和
        long sumj = arr[n - 1];     //计算从左边起的累加和
        while (i < j) {
            if (arr[i]==0 || arr[j]==0) return;
            if (sumi == sumj) {
                max = Math.max(sumi, max);
                i++;
                j--;
                sumi += arr[i];
                sumj += arr[j];
            }

            if (sumi > sumj) {
                j--;
                sumj += arr[j];
            } else if (sumi < sumj) {
                i++;
                sumi += arr[i];
            }
        }
        System.out.println(max);
    }
}
