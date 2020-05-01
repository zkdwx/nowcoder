package com.wx.schoolRecruitmentFor2019;

import java.util.Scanner;

/**
 * 鸡鸭分类问题
 */
public class ClassificationOfChickenAndDuck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();           //鸡鸭队伍
        int i = s.length() - 1;                           //头指针
        int j = s.length() - 1;                 //尾指针
        char[] arr = s.toCharArray();
        int count = 0;
        while (i >= 0 && j >= 0) {
            while (arr[i] == 'D' && i > 0) {
                i--;
            }
            while (arr[j] == 'C' && j > 0) {
                j--;
            }
            count = count + i - j;
            i--;
            j--;
        }

        System.out.println(count);
    }

}
