package com.wx.schoolRecruitmentFor2019;
//牛牛的闹钟
import java.util.Scanner;

public class Solution7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();   //闹钟的数量
        int[] hours = new int[N];    //闹钟--时
        int[] min = new int[N];     //闹钟--分
        int h = 0, m = 0;
        for (int i = 0; i < 2 * N; i++) {
            if (i % 2 == 0) {
                hours[h++] = sc.nextInt();
            } else {
                min[m++] = sc.nextInt();
            }
        }
        int X = sc.nextInt();           //上学时间
        int A = sc.nextInt();           //上课时间-时
        int B = sc.nextInt();           //上课时间-分

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = hours[i] * 60 + min[i];   //全部换成分钟
        }
        int result = arr[0];
        int minTime = Integer.MAX_VALUE;
        int schoolTime = A * 60 + B;
        for (int i = 0; i < N; i++) {
            int temp = schoolTime - arr[i]-X;
            if (temp >= 0 && minTime > temp) {
                minTime = temp;
                result = arr[i];
            }
        }
        int resH = result / 60;
        int resM = result % 60;
        System.out.print(resH+" "+resM);
    }


}
