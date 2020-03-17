package com.wx.swordMeansOffer;

/**
 * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
 * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
 */
public class Solution6 {
    public static int minNumberInRotateArray(int[] array) {
        int len = array.length;
        if (len == 0) return 0;
        int first = array[0];
        for (int x : array) {
            if (x < first)
                return x;
        }
        return first;
    }

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 1, 2};
        System.out.println(minNumberInRotateArray(array));
    }
}
