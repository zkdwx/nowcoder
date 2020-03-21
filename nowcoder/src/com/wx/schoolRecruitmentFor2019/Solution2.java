package com.wx.schoolRecruitmentFor2019;

import java.util.Scanner;

public class Solution2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();    //区间左端点
        int r = sc.nextInt();    //区间右端点
        if (l > r || l < 1) return;
        int res = 0;
        int sum = 0;
        for (int i = 1; i < l; i++) {
            sum += i;
        }
        for (int i = l; i <= r; i++) {
            sum += i;
            if (sum % 3 == 0) {
                res++;
            }
        }
        System.out.println(res);
    }
}
