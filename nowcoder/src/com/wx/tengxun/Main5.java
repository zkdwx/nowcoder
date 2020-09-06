package com.wx.tengxun;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String s = scanner.nextLine();
        String[] num = scanner.nextLine().split(" ");
        if (n <= 1) {
            System.out.println(1);
            return;
        }
        System.out.println(n + 2);
    }
}
