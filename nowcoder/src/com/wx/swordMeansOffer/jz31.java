package com.wx.swordMeansOffer;

public class jz31 {
    public static int NumberOf1Between1AndN_Solution(int n) {
        int count = 0;
        for (int i = n; i >= 0; i--) {
            for (int j = i; j > 0; j /= 10) {
                if (j % 10 == 1) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int i = NumberOf1Between1AndN_Solution(12);
        System.out.println(i);
    }
}
