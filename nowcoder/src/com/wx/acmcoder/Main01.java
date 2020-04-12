package com.wx.acmcoder;

import java.util.*;

public class Main01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();                //第一个集合的大小
            int m = sc.nextInt();                //第二个集合的大小

            List<Integer> list1 = new ArrayList<>(n);
            List<Integer> list2 = new ArrayList<>(m);
            for (int i = 0; i < n; i++) {
                list1.add(sc.nextInt());
            }
            for (int i = 0; i < m; i++) {
                list2.add(sc.nextInt());
            }
            for (int i = 0; i < n; i++) {
                if (!list2.contains(list1.get(i))) {
                    list2.add(list1.get(i));
                }
            }
            int[] arr = new int[list2.size()];

            for (int i = 0; i < list2.size(); i++) {
                arr[i] = list2.get(i);
            }
            Arrays.sort(arr);

            for (int x : arr) {
                System.out.print(x + " ");
            }
        }
    }
}