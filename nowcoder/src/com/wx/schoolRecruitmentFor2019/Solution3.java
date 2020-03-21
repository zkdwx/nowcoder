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
        if (n == 2 && s.contains(".")) return 1;
        int res = 0;
        if (n == 1) {
            if (s.equals(".")) return 1;
            if (s.equals("X")) return 0;
        }
        boolean[] b = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'X') b[i] = true;
        }
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i - 1) == '.' && s.charAt(i) == '.' && s.charAt(i + 1) == '.') {
                b[i - 1] = true;
                b[i] = true;
                b[i + 1] = true;
                res++;
            }
        }
        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i - 1) == '.' && s.charAt(i) == 'X' && s.charAt(i + 1) == '.'
                    && b[i - 1] == false && b[i + 1] == false) {
                b[i - 1] = true;
                b[i] = true;
                b[i + 1] = true;
                res++;
            }
        }
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == '.' && b[i] == false) {
                b[i] = true;
                res++;
            }
        }
        return res;
    }
}
