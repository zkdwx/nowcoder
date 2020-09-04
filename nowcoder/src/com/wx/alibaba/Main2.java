package com.wx.alibaba;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, List<Integer>> map = new HashMap();
        for (int i = 0; i < n - 1; i++) {
            int key = scanner.nextInt();
            int v = scanner.nextInt();
            List<Integer> list = map.get(key);
            if (list != null) {
                list.add(v);
            } else {
                list = new ArrayList<>();
                list.add(v);
            }
            map.put(key, list);
        }

        System.out.println(map.size() - 1);


    }
}
