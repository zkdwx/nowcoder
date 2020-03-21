package com.wx.schoolRecruitmentFor2019;

import java.util.Scanner;

public class Solution4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] c = {'N', 'E', 'S', 'W'};
        int N = sc.nextInt();         //转方向次数
        sc.nextLine();
        String s = sc.nextLine();
        int time = turnTimes(N, s);
        System.out.println(time > 0 ? c[time] : c[time + 4]);
    }

    private static int turnTimes(int N, String s) {  //s 左右转次数
        int res = 0;
        for (int i = 0; i < N; i++) {
            if (s.charAt(i) == 'L') {
                res += -1;
            } else {
                res += 1;
            }
            res = res % 4;
        }
        return res;
    }
}
