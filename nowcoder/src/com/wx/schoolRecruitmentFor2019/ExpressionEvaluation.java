package com.wx.schoolRecruitmentFor2019;
//表达式求值
import java.util.Scanner;

public class ExpressionEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Integer.MIN_VALUE;
        max = Math.max(a * b * c, (a + b) * c);
        max = Math.max(max, a * (b + c));
        max = Math.max(max, a + b + c);
        max = Math.max(max, a + b * c);
        max = Math.max(max, a * b + c);
        System.out.println(max);
    }
}
