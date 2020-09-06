package com.wx.nowcoder;

public class NC88 {
    public int findKth(int[] a, int n, int K) {
        return find(a, 0, n - 1, K);
    }

    private int find(int[] a, int left, int right, int k) {
        int index = partion(a, left, right);
        if (right - index + 1 == k) {
            return a[index];
        }
        if (right - index + 1 < k) {
            return find(a, left, index - 1, k - right + index - 1);
        }
        return find(a, index + 1, right, k);
    }


    private int partion(int[] arr, int left, int right) {
        int key = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= key) {
                right--;
            }
            arr[left] = arr[right];
            while (left < right && arr[left] <= key) {
                left++;
            }
            arr[right] = arr[left];
        }
        arr[left] = key;
        return left;
    }

    public static void main(String[] args) {
        NC88 nc = new NC88();
        int[] a = {4, 1, 3, 5, 2};
        int k = 3;
        int i = nc.findKth(a, a.length, k);
        System.out.println(i);
    }
}
