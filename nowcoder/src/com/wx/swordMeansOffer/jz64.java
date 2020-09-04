package com.wx.swordMeansOffer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class jz64 {
    public ArrayList<Integer> maxInWindows(int[] num, int size) {
        ArrayList<Integer> list = new ArrayList<>();
        if (size > num.length || size == 0) return list;
        PriorityQueue<Integer> queue = new PriorityQueue<>(size, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < size; i++) {
            queue.offer(num[i]);
        }
        list.add(queue.peek());
        for (int i = 1; i <= num.length - size; i++) {
            queue.remove(num[i - 1]);
            queue.offer(num[i + size - 1]);
            list.add(queue.peek());
        }
        return list;
    }

    public static void main(String[] args) {
        jz64 jz64 = new jz64();
        int[] nums = {2, 3, 4, 2, 6, 2, 5, 1};
        ArrayList<Integer> list = jz64.maxInWindows(nums, 3);
        System.out.println(list);
    }
}
