package com.wx.swordMeansOffer;

import java.util.ArrayList;

public class JZ19 {
    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return list;
        int up = 0;
        int down = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length-1;
        while (true) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[up][i]);
            }
            up++;
            if (up > down) {
                break;
            }
            for (int i = up; i <= down; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (left > right) {
                break;
            }
            for (int i = right; i >= left; i--) {
                list.add(matrix[down][i]);
            }
            down--;
            if (up > down) {
                break;
            }
            for (int i = down; i >= up; i--) {
                list.add(matrix[i][left]);
            }
            left++;
            if (left > right) {
                break;
            }

        }
        return list;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] matrix = new int[n][n];
        int s = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = s++;
            }
        }
        ArrayList<Integer> list = printMatrix(matrix);
        System.out.println(list);
    }
}
