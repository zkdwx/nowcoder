package com.wx.swordMeansOffer;

/**
 *给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 * 保证base和exponent不同时为0
 */
public class Solution12 {
    public static double Power(double base, int exponent) {
        if (exponent==0) return 1;
        if (exponent> 0) return powerByPositive(base,exponent);
        if (exponent<0) return 1/powerByPositive(base,-exponent);
        return 0;
    }

    private static double powerByPositive(double base, int exponent) {
        double result = 1;
        for (int i = 0; i < exponent; i++) {
            result = result * base;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Power(2,-3));

    }
}
