package com.wx.schoolRecruitmentFor2019;
//字符串归一化
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class StringNormalization {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Map<Character, Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int count = map.get(c) + 1;
                map.put(c, count);
            } else {
                map.put(c, 1);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : map.keySet()) {
            sb.append(c).append(map.get(c));
        }
        System.out.println(sb.toString());
    }

}

