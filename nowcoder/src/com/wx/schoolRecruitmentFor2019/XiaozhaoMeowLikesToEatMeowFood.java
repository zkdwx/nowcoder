package com.wx.schoolRecruitmentFor2019;

import java.util.Scanner;

public class XiaozhaoMeowLikesToEatMeowFood {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] sArr = input.split(" ");
        int[] arr = new int[sArr.length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(sArr[i]);
        }
        int H = Integer.parseInt(sc.nextLine());    //时间

        int res;
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        res = sum / H;
        while (true) {
            int yu = sum % res;
            if (yu == 0) {
                System.out.println(res);
                break;
            } else {
                res++;
            }
        }

    }
}
