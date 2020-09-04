package com.wx.bibi;

import java.util.ArrayList;
import java.util.List;

public class Main3 {

    public static int GetFragment(String str) {
        if (str == null || str.length() == 0) return 0;
        if (str.length() == 1) return 1;
        int count = 0;
        int size = 1;
        List<Integer> list = new ArrayList<>();
        str = str + "#";
        for (int i = 1; i < str.length(); i++) {
            char c1 = str.charAt(i - 1);
            char c2 = str.charAt(i);
            if (c1 == c2) {
                size++;
            } else {
                count++;
                list.add(size);
                size = 1;
            }
        }
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / count;
    }


    public static void main(String[] args) {
        String s = "aaabbaaac";
        GetFragment(s);

    }


}
