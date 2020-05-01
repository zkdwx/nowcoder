package com.wx.schoolRecruitmentFor2019;

import java.util.Scanner;

/**
 * a/b
 */
public class ADividedByB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();       //分子
        int b = sc.nextInt();       //分母
        double result;             //结果
        if (a % b == 0) {
            System.out.println(a / b);    //整除
            return;
        }
        result = (double) a / b;
        String s = String.valueOf(result);
        String ss = getRepeatStr(s);
        System.out.println(ss);

    }
    private static String getRepeatStr(String ss) {
        StringBuilder sb = new StringBuilder();
        String[] arrStr = ss.split("\\.");
        sb.append(arrStr[0]).append(".");
        String s = arrStr[1];
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    sb.append(s, 0, i)
                            .append("(")
                            .append(s, i, j)
                            .append(")");
                    return sb.toString();
                }
            }
        }
        return "";
    }
}
