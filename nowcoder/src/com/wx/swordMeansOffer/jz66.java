package com.wx.swordMeansOffer;

public class jz66 {
    public int movingCount(int threshold, int rows, int cols) {
        if (threshold < 0 || rows <= 0 || cols <= 0) {
            return 0;
        }
        return dfs(threshold, rows, cols, 0, 0, new boolean[rows][cols]);
    }

    private int dfs(int threshold, int rows, int cols, int row, int col, boolean[][] visit) {
        if (row < 0 || col < 0 || row >= rows || col >= cols || visit[row][col] || cal(row) + cal(col) > threshold) {
            return 0;
        }
        visit[row][col] = true;
        return 1 + dfs(threshold, rows, cols, row - 1, col, visit) +
                dfs(threshold, rows, cols, row + 1, col, visit) +
                dfs(threshold, rows, cols, row, col - 1, visit) +
                dfs(threshold, rows, cols, row, col + 1, visit);
    }

    private int cal(int sum) {
        int val = 0;
        while (sum > 0) {
            int x = sum % 10;
            val += x;
            sum /= 10;
        }
        return val;
    }
}
