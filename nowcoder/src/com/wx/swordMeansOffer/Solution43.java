package com.wx.swordMeansOffer;

public class Solution43 {
    public static String LeftRotateString(String str, int n) {
        if (str == null || str.length() == 0) return str;
        if (n >= str.length()) {
            n = n % str.length();
        }
        return str.substring(n) + str.substring(0, n);
    }

    public static void main(String[] args) {
        String abcXYZdef = LeftRotateString("abcXYZdef", 3);
        System.out.println(abcXYZdef);
    }
}
