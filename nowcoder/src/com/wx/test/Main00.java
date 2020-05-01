package com.wx.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main00 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();        //测试组数样例
        boolean[] res = new boolean[T];
        for (int i = 0; i < T; i++) {
            res[i]=true;
        }
        for (int i = 0; i < T; i++) {
            int[] arr = new int[12];

            for (int j = 0; j < 12; j++) {
                arr[j]=sc.nextInt();
            }
            Map<Integer,Integer> map = new HashMap<>();
            for (int j = 0; j < arr.length; j++) {
                if (map.containsKey(arr[j])){
                    int count = map.get(arr[j])+1;
                    map.put(arr[j],count);
                }else {
                    map.put(arr[j],1);
                }
            }

            for (int x:map.keySet()){
                if (map.get(x)!=4){
                    res[i]=false;
                    break;
                }
            }
        }
        for (boolean b:res){
            if (b){
                System.out.println("POSSIBLE");
            }else {
                System.out.println("IMPOSSIBLE");
            }
        }

    }


}
