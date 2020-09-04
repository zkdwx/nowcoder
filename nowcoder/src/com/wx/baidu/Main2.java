package com.wx.baidu;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();      //测试组数
        if (t < 100) {
            for (int i = 0; i < t; i++) {
                Map<Integer, Integer> map = new HashMap<>();
                int n = scanner.nextInt();      //奶牛数
                int m = scanner.nextInt();      //需满足特性数量
                for (int j = 0; j < m; j++) {
                    int k = scanner.nextInt();      //每个特性
                    for (int p = 0; p < k; p++) {
                        int key = scanner.nextInt();
                        int value = scanner.nextInt();

                        for (int ii = key; ii <= value; ii++) {
                            int count = map.getOrDefault(ii, 0);
                            map.put(ii, count + 1);
                        }
                    }
                }
                List<Integer> list = new ArrayList<>();
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getValue() >= m) {
                        list.add(entry.getKey());
                    }
                }
                Collections.sort(list);
                for (int x : list) {
                    System.out.print(x);
                }

            }
        }
    }
}
