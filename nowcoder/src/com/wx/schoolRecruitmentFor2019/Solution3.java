package com.wx.schoolRecruitmentFor2019;

import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();         //测试用例数
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();         //道路的长度
            sc.nextLine();
            String s = sc.nextLine();
            arr[i] = minRoadDeng(n, s);
        }
        for (int i = 0; i < t; i++) {
            System.out.println(arr[i]);
        }
    }

    private static int minRoadDeng(int n, String s) {  //n=s.length()
        int i = 0;
        int res = 0;
        while (i < n) {
            if (s.charAt(i) == '.') {
                res++;
                i += 3;
            }
            if (i < n && s.charAt(i) == 'X')
                i++;
        }
        return res;
    }
}
