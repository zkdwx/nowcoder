package com.wx.swordMeansOffer;

import java.util.HashMap;

/**
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，
 * 使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 * 并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */
public class Solution13 {
    public void reOrderArray(int [] array) {
        int len = array.length;
        int i=0;
        int j=0;
        while (i<len){
            if (array[i]%2!=0)
                i++;
            while (j<len){
                if (array[j]==0)
                    j++;
            }
            HashMap<Integer,Integer> map=new HashMap<>();
        }

    }



    public static void main(String[] args) {

    }
}
