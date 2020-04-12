package com.wx.acmcoder;

import java.util.*;

public class Main02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            if (n < 1) return;
            int m = sc.nextInt();
            if (n > 1000) return;
            int[] price = new int[n];
            for (int i = 0; i < n; i++) {
                price[i] = sc.nextInt();
            }
            sc.nextLine();
            Map<String, Integer> map = new HashMap<>();
            for (int i = 0; i < m; i++) {
                String s = sc.nextLine();
                if (map.containsKey(s)) {
                    int count = map.get(s) + 1;
                    map.put(s, count);
                } else {
                    map.put(s, 1);
                }
            }
            int k = 0;
            int[] goods = new int[map.size()];
            for (String s : map.keySet()) {
                goods[k++] = map.get(s);
            }
            Arrays.sort(goods);
            Arrays.sort(price);
            int max = 0, min = 0;
            for (int i = 0; i < goods.length; i++) {
                min += goods[goods.length - 1 - i] * price[i];
                max += goods[goods.length - 1 - i] * price[price.length - 1 - i];
            }
            System.out.print(min + " " + max + "\n");
        }
    }

}
