package com.wx.swordMeansOffer;

import java.util.*;

public class Solution42 {
    public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
        int i = 0;
        int j = array.length - 1;
        ArrayList<Integer> list = new ArrayList<>(2);
        while (i <= j) {
            if (array[i] + array[j] == sum) {
                list.add(array[i]);
                list.add(array[j]);
                return list;
            }
            while (array[i] + array[j] < sum) {
                i++;
            }
            while (array[i] + array[j] > sum) {
                j--;
            }
        }
        return list;
    }
}
