package com.wx.schoolRecruitmentFor2019;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//俄罗斯方块
public class Tetris {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       //列数
        int m = sc.nextInt();        //方块个数
        if (n < 1 || m > 1000) return;
        if(m<n){
            System.out.println(0);
            return;
        }
        int min = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            if (x < 1 || x > n) return;
            if (map.containsKey(x)) {
                int count = map.get(x) + 1;
                map.put(x, count);
            } else {
                map.put(x, 1);
            }
        }
        for (int i = 1; i <= n; i++) {
            if (!map.containsKey(i)){
                System.out.println(0);
                return;
            }
            min = Math.min(min, map.get(i));
        }
        System.out.println(min);
    }
}
