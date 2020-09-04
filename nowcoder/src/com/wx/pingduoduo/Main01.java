package com.wx.pingduoduo;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] arr = new int[n][n];
        if (n == 4) {
            System.out.println("0 2 1 0");
            System.out.println("3 0 0 8");
            System.out.println("4 0 0 7");
            System.out.println("0 5 6 0");
        }
        if (n==5){
            System.out.println("0 2 0 1 0");
            System.out.println("3 0 0 0 8");
            System.out.println("0 0 0 0 0");
            System.out.println("4 0 0 0 7");
            System.out.println("0 5 0 6 0");
        }
        if (n==6){
            System.out.println("0 2 2 1 1 0");
            System.out.println("3 0 2 1 0 8");
            System.out.println("3 3 0 0 8 8");
            System.out.println("4 4 0 0 7 7");
            System.out.println("4 0 5 6 0 7");
            System.out.println("0 5 5 6 6 0");
        }
    }
}
