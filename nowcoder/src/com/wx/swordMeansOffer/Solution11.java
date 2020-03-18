package com.wx.swordMeansOffer;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Solution11 {
    public static int NumberOf1(int n) {
        int count = 0;
        if (n == 0) return 0;
        if (n > 0) {
            while (n != 0) {
                int a = n % 2;
                n = n / 2;
                if (a == 1)
                    count++;
            }
            return count;
        }
        if (n < 0) {
            int i = 31;
            int[] arr = new int[32];
            n = -n;
            while (n != 0) {
                int a = n % 2;
                arr[i--] = a;
                n = n / 2;
            }
            for (int j = 0; j < 32; j++) {
                if (arr[j] == 1) {
                    arr[j] = 0;
                } else {
                    arr[j] = 1;
                }
            }
            int jinwei = 1;
            for (int j = 31; j > 0; j--) {
                int temp = jinwei + arr[j];
                arr[j] = temp % 2;
                if (arr[j] == 1) {
                    count++;
                }
                jinwei = temp / 2;
            }
            return count + 1;
        }
        return 0;

    }

    public static void main(String[] args) {
        System.out.println(NumberOf1(-8));
    }
}
