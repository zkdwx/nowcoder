package com.wx.acmcoder;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.Scanner;

public class Main002 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        if (s == null || s.length() <= 4) return;
        if (s.equals("MT")) return;

        int index_T = s.indexOf("T");
        int index_M = s.indexOf("M");

        int last_T = s.lastIndexOf("T");
        int last_M = s.lastIndexOf("M");

        if (index_M != -1 && index_T != -1 && index_T > index_M &&
                last_M != -1 && last_T != -1 && last_M < last_T && index_T < last_M) {
            String ss = s.substring(index_T + 1, last_M);
            System.out.println(ss);
        }
    }
}
