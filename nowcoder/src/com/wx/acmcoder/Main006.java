package com.wx.acmcoder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[n + 1];
        String input = scanner.nextLine();
        String[] arrStr = input.split(" ");
        for (int i = 1; i <= n; i++) {
            arr[i] = Integer.parseInt(arrStr[i - 1]);
        }
        int m = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            list.add(scanner.nextLine());
        }

        int[] arrB = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            arrB[i] = -1;
        }

        for (String s : list) {
            String[] split = s.split(" ");
            if (split.length == 2) {
                if (Integer.parseInt(split[1]) > n) {
                    return;
                }
                System.out.println(arrB[Integer.parseInt(split[1])]);
            }
            if (split.length > 2) {
                int y = Integer.parseInt(split[3]);
                for (int i = Integer.parseInt(split[2]); i <= Integer.parseInt(split[1]) + Integer.parseInt(split[2]); i++) {
                    if (y <= n) {
                        arrB[y] = arr[i];
                        y++;
                    }
                }
            }
        }
    }
}
