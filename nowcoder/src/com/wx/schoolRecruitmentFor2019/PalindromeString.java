package com.wx.schoolRecruitmentFor2019;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();       //字符串

        int max=0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (checkPalindrome(i,j,s)){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        System.out.println(max);
    }




    private static boolean checkPalindrome(int i, int j, String s) {
        for (int k = i; k <= j; k++) {
            if (s.charAt(k) != s.charAt(i + j - k)) {
                return false;
            }
        }
        return true;
    }
}
