package com.wx.swordMeansOffer;

public class Solution44 {
    public static String ReverseSentence(String str) {
        if (str == null || str.trim().length() == 0) return str;
        StringBuilder sb = new StringBuilder();
        String[] split = str.split(" ");
        for (int i = split.length - 1; i >= 0; i--) {
            sb.append(split[i] + " ");
        }
        return sb.substring(0,sb.length()-1);
    }

    private static String reverseWord(String str) {
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length / 2; i++) {
            char c = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = c;
        }
        return String.valueOf(array);
    }

    public static void main(String[] args) {
        String s = ReverseSentence("I am a student.");
        System.out.println(s);
    }
}
