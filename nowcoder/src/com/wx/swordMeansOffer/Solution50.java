package com.wx.swordMeansOffer;

import java.util.HashSet;
import java.util.Set;

public class Solution50 {
    public boolean duplicate(int numbers[], int length, int[] duplication) {
        duplication[0] = -1;
        if (numbers == null || numbers.length == 0) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int x : numbers) {
            boolean b = set.add(x);
            if (!b) {
                duplication[0] = x;
                return true;
            }
        }
        return false;
    }
}
