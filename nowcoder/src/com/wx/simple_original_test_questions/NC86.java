package com.wx.simple_original_test_questions;

import java.util.ArrayList;
import java.util.List;

/**
 * 车站建造问题
 * 数学问题
 * 2020-07-23
 */
public class NC86 {
    public int work(int n, int[] a) {
        return 0;
    }

    private List<Integer> maxPrimeNumber(int x) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            if (isPrime(i)) {
                list.add(i);
            }
        }
        return list;
    }

    private boolean isPrime(int x) {
        boolean flag = true;
        for (int i = 2; i < Math.sqrt(x); i++) {
            if (x % i == 0) {
                flag = false;
            }
        }
        return flag;
    }

    public static void main(String[] args) {

    }
}
