package com.wx.schoolRecruitmentFor2019;

import java.util.Scanner;

/**
 * 比特币最佳买卖时机
 */
public class TheBestTimeToBuyAndSellBitcoin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] s = input.split(" ");
        int[] arr = new int[s.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int minPrice = arr[0];
        int maxProfit = 0;
        for (int i = 0; i < arr.length; i++) {
            minPrice = Math.min(minPrice, arr[i]);
            int temp = arr[i] - minPrice;
            maxProfit = Math.max(temp, maxProfit);
        }
        System.out.println(maxProfit);
    }
}
