package com.wx.nowcoder;

public class NC32 {
    public int sqrt(int x) {
        if (x == 0)  return 0;
        if (x == 1)  return 1;


        int left = 1;
        int right = x / 2 + 1;
        int mid;
        while (left <= right) {
            mid = (left + right) / 2;
            if (x / mid >= mid && x / (mid + 1) < mid + 1) {
                return mid;
            } else if (x / mid > mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return right;
    }


    public static void main(String[] args) {
        NC32 nc = new NC32();
        int sqrt = nc.sqrt(15);
        System.out.println(sqrt);
    }
}
