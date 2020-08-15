package com.wx.swordMeansOffer;

import java.util.HashMap;
import java.util.Map;

public class Solution40 {
    public void FindNumsAppearOnce(int[] array, int num1[], int num2[]) {
        boolean flag = false;
        Map<Integer, Integer> map = new HashMap<>();
        for (int x : array) {
            int count = map.getOrDefault(x, 0);
            map.put(x, count + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                if (!flag) {
                    num1[0] = entry.getKey();
                    flag = true;
                } else {
                    num2[0] = entry.getKey();
                }
            }
        }
    }
}
