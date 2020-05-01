package com.wx.schoolRecruitmentFor2019;
//字符串排序
import java.util.Arrays;
import java.util.Scanner;

public class CharacterSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = Integer.parseInt(sc.nextLine());  //表示有M个样例
        int[] arr = new int[M];
        for (int i = 0; i < M; i++) {
            String s = sc.nextLine();
            String substring = s.substring(s.length() - 6, s.length());
            arr[i] = Integer.parseInt(substring);
        }
        Arrays.sort(arr);
        for (int x : arr)
            System.out.println(x);
    }
}
