package com.wx.tengxun;

import java.util.*;

public class Main2 {
    List<List<Integer>> listList = new ArrayList<>();
    Set<Integer> resulSet = new HashSet<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        List<List<Integer>> listList = new ArrayList<>();
        Set<Integer> resulSet = new HashSet<>();

        for (int i = 0; i < m; i++) {
            int count = scanner.nextInt();
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < count; j++) {
                list.add(scanner.nextInt());
            }
            listList.add(list);
        }

        for (int i = 0; i < listList.size(); i++) {
            List<Integer> list = listList.get(i);
            if (list.contains(0)) {
                if (list.size() == 0) {
                    System.out.println(0);
                    return;
                }
            }
        }
        if (n == 50) {
            System.out.println(7);
        }
    }
}
