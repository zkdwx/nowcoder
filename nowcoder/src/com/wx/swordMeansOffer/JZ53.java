package com.wx.swordMeansOffer;

public class JZ53 {
    public boolean isNumeric(char[] str) {
        int index = -1;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'E' || str[i] == 'e') {
                index = i;
            }
        }
        if (index >= 0) {
            if (index == str.length - 1) return false;
            char[] arr1 = new char[index];
            char[] arr2 = new char[str.length - index - 1];

            for (int i = 0; i < index; i++) {
                arr1[i] = str[i];
            }

            for (int i = 0; i < str.length - index - 1; i++) {
                arr2[i] = str[index + 1 + i];
            }
            int num1 = isNum(arr1);
            int num2 = isNum(arr2);
            if (num1 == 0 || num2 == 0 || num2 == -1) {
                return false;
            }
            return true;
        }
        if (isNum(str) == 0) {
            return false;
        }
        return true;

    }

    private int isNum(char[] s) {
        if (s.length == 1) {
            if (Character.isDigit(s[0])) {
                return 1;
            }
        }
        if (s[0] == '.') return 0;
        int count = 0;
        if (s[0] == '+' || s[0] == '-') {
            for (int i = 1; i < s.length; i++) {
                if (!Character.isDigit(s[i])) {
                    if (s[i] == '.') {
                        count++;
                    } else {
                        return 0;
                    }
                }
            }
        } else {
            for (int i = 0; i < s.length; i++) {
                if (!Character.isDigit(s[i])) {
                    if (s[i] == '.') {
                        count++;
                    } else {
                        return 0;
                    }
                }
            }
        }
        if (count > 1) {
            return 0;
        } else if (count == 1) {
            return -1;
        }
        return 1;

    }

    public static void main(String[] args) {
        JZ53 jz53 = new JZ53();
//        char[] arr = {'1','2', '3', 'e', '+', '5', '6'};
//        char[] arr = {'1', '2', 'e'};
        char[] arr = {'1', '.', '2', '.', '3'};
        System.out.println(jz53.isNumeric(arr)
        );
    }
}
