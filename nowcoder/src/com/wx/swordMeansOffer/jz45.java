package com.wx.swordMeansOffer;

import java.util.Arrays;

public class jz45 {
    public static boolean isContinuous(int[] numbers) {
        if (numbers == null || numbers.length == 0) return false;
        Arrays.sort(numbers);
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                count++;
            }
        }
        int sum = 0;
        for (int i = numbers.length - 1; i > count; i--) {
            int x = numbers[i] - numbers[i - 1];
            sum += x;
        }
        if (sum == numbers.length - 1 + count) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {3, 0, 1, 0, 5};
        boolean continuous = isContinuous(numbers);
        System.out.println(continuous);
    }
}
