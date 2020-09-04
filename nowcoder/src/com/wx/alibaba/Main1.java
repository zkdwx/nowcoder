package com.wx.alibaba;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        if (n <= 1) {
            System.out.println(n);
            return;
        }
        List<List<Character>> listList = new ArrayList<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            list.add('A');
        }
        for (int i = 0; i < b; i++) {
            list.add('B');
        }
        for (int i = 0; i < c; i++) {
            list.add('C');
        }
        for (int i = 0; i < d; i++) {
            list.add('D');
        }
        dfs(list, new ArrayList<Character>(), listList, new boolean[n * n], n);

        Set<String> set = new HashSet<>();
        for (List tmpList : listList) {
            String s = String.valueOf(tmpList);
            set.add(s);
        }
        System.out.println(set.size() % 998244353);

    }

    private static void dfs(List<Character> listArr, List<Character> list, List<List<Character>> listList, boolean[] visit, int n) {
        if (list.size() == n * n) {
            listList.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < listArr.size(); i++) {
            if (!visit[i]) {
                list.add(listArr.get(i));
                visit[i] = true;
                dfs(listArr, list, listList, visit, n);
                visit[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}
