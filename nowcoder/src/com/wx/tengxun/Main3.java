package com.wx.tengxun;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int n = Integer.parseInt(input.split(" ")[0]);
        int k = Integer.parseInt(input.split(" ")[1]);
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLine();
        }

        Map<String, Integer> map = new TreeMap<>();
        Map<Integer, String> countMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            String s = arr[i];
            int count = map.getOrDefault(s, 0);
            map.put(s, count + 1);
        }
        List<Integer> maxList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (!countMap.containsKey(entry.getValue())) {
                countMap.put(entry.getValue(), entry.getKey());
            }
        }
        List<Integer> listInt = new ArrayList<>();
        List<String> listStr = new ArrayList<>();

        for (Map.Entry<Integer, String> entry : countMap.entrySet()) {
            listInt.add(entry.getKey());
            listStr.add(entry.getValue());
        }

        for (int i = 0; i < k; i++) {
            System.out.print(listStr.get(i) + " ");
            System.out.print(listInt.get(i));
        }
        System.out.println();
        for (int i = listInt.size() - 1; i < listInt.size() - 1 - k; i++) {
            System.out.print(listStr.get(i) + " ");
            System.out.print(listInt.get(i));
        }
    }
}
