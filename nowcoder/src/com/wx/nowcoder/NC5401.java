package com.wx.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NC5401 {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        Arrays.sort(num);
        for (int i = 0; i < num.length; i++) {
            int j = i + 1;
            int k = num.length - 1;
            while (j < k) {
                if (num[i] + num[j] + num[k] == 0) {
                    ArrayList<Integer> list = new ArrayList<>();
                    list.add(num[i]);
                    list.add(num[j]);
                    list.add(num[k]);
                    lists.add(list);
                }
                if (num[i] + num[j] + num[k] > 0) {
                    k--;
                }
                if (num[i] + num[j] + num[k] < 0) {
                    j++;
                }
            }
        }
        return lists;

    }

    public static void main(String[] args) {
        NC5401 nc = new NC5401();
        int[] num = {-1, 0, 1, 2, -1, -4};
        ArrayList<ArrayList<Integer>> list = nc.threeSum(num);
        System.out.println(list);
    }
}
