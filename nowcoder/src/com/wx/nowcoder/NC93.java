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
                if (list.size() < k) {
                    list.add(0, arr[1]);
                } else {
                    list.add(0, arr[1]);
                    list.remove(list.size() - 1);
                }
                map.put(arr[1], arr[2]);
            }
            if (arr[0] == 2) {
                if (!list.contains(arr[1])) {
                    result.add(-1);
                } else {
                    int tmp = map.get(arr[1]);
                    result.add(tmp);
                    if (list.size() < k) {
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

    public static void main(String[] args) {
        NC93 nc93 = new NC93();
        int[][] operators = {{1, 1, 1}, {1, 2, 2}, {1, 3, 2}, {2, 1}, {1, 4, 4}, {2, 2}};
        int k = 3;
        int[] lru = nc93.LRU(operators, 3);
        System.out.println(Arrays.stream(lru).count());
    }
}
