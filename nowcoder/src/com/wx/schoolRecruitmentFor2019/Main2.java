package com.wx.schoolRecruitmentFor2019;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int globalMax=Integer.MIN_VALUE;
        int n = Integer.parseInt(sc.nextLine());
        String[] strArr = new String[n];
        for (int i = 0; i < n; i++) {
            strArr[i] = sc.nextLine();
        }
        for (int k = 0; k < n; k++) {
            StringBuilder sb = new StringBuilder();
            sb.append(strArr[k]);
            for (int i = k+1; i < n; i++) {
                if (sb.toString().charAt(sb.toString().length() - 1) <= strArr[i].charAt(0)) {
                    String s = sb.toString() + strArr[i];
                    if (max < s.length()) {
                        max = s.length();
                        sb.append(strArr[i]);
                        globalMax=Math.max(globalMax,max);
                    }
                }
            }
        }

        System.out.println(globalMax);
    }

}
