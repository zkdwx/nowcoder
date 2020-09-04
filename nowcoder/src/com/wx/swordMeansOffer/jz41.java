package com.wx.swordMeansOffer;

import java.util.ArrayList;

public class jz41 {
    public static ArrayList<ArrayList<Integer>> FindContinuousSequence(int sum) {
        ArrayList<ArrayList<Integer>> listList = new ArrayList<>();
        for (int i = 1; i <= sum / 2; i++) {
            int tmp = i;
            for (int j = i + 1; j <= sum; j++) {
                tmp += j;
                if (tmp > sum) {
                    break;
                }
                if (tmp == sum) {
                    ArrayList<Integer> list = new ArrayList<>();
                    for (int k = i; k <= j; k++) {
                        list.add(k);
                    }
                    listList.add(list);
                }
            }
        }
        return listList;
    }

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = FindContinuousSequence(12);
        System.out.println(list);
    }
}
