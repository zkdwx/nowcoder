package com.wx.swordMeansOffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class jz63 {
    List<Integer> list = new ArrayList<>();

    public void Insert(Integer num) {
        list.add(num);

    }

    public Double GetMedian() {
        if (list.size() == 0) return 0.0;
        if (list.size() == 1) return (double) list.get(0);
        Collections.sort(list);
        int index = list.size() / 2;
        if (list.size() % 2 == 0) {
            return (list.get(index - 1) + list.get(index)) / 2.0;
        } else {
            return (double) list.get(index);
        }
    }

    public static void main(String[] args) {
        jz63 j = new jz63();
        j.Insert(1);
        System.out.println(j.GetMedian());
        j.Insert(3);
        System.out.println(j.GetMedian());
        j.GetMedian();
        j.Insert(2);
        j.GetMedian();
        System.out.println(j.GetMedian());
    }

}
