package com.wx.swordMeansOffer;

public class Solution53 {
    public static boolean isNumeric(char[] str) {
        if (str.length == 0) return false;
        if (str.length == 1) {
            return Character.isDigit(str[0]);
        }
        if (String.valueOf(str).contains("e|E")) {
            String[] split = String.valueOf(str).split("e|E");
            return checkWord(split[0]) && checkWord(split[1]);
        } else {
            return checkWord(String.valueOf(str));
        }



    }

    private static boolean checkWord(String s) {
        char[] arr = s.toCharArray();

        if (arr[0] == '+' || arr[0] == '-') {
            for (int i = 1; i < arr.length; i++) {
                if (!Character.isDigit(arr[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "-.1416";
        char[] str = s.toCharArray();
        boolean numeric = isNumeric(str);
        System.out.println(numeric);
    }
}
