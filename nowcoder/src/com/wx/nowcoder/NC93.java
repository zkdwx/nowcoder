package com.wx.nowcoder;

import java.util.*;

/**
 * 设计LRU缓存结构
 */
public class NC93 {
    public int[] LRU(int[][] operators, int k) {
        List<Integer> result = new ArrayList<>();
        List<Integer> list = new LinkedList<>();
        Map<Integer, Integer> map = new HashMap<>(k);
        for (int i = 0; i < operators.length; i++) {
            int[] arr = operators[i];
            if (arr[0] == 1) {
                if (list.size() <= k) {
                    list.add(0, arr[1]);
                } else {
                    list.add(0, arr[1]);
                    list.remove(list.size() - 1);
                }
                map.put(arr[1], arr[2]);
            }
            if (arr[0] == 2) {
                Integer tmp = map.get(arr[1]);
                if (tmp == null) {
                    result.add(-1);
                } else {
                    result.add(tmp);
                    if (list.size() <= k) {
                        list.add(0, arr[1]);
                    } else {
                        list.add(0, arr[1]);
                        list.remove(list.size() - 1);
                    }
                }
            }
        }
        int[] array = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            array[i] = result.get(i);
        }
        return array;
    }
}
