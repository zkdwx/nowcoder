package com.wx.swordMeansOffer;

public class jz65 {
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(matrix, rows, cols, str, i, j, new boolean[matrix.length], 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean dfs(char[] matrix, int rows, int cols, char[] str, int row, int col, boolean[] visit, int len) {
        if (matrix[row * cols + col] != str[len] || visit[row * cols + col]) return false;
        if (len == str.length - 1) return true;
        visit[row * cols + col] = true;
        if (row > 0 && dfs(matrix, rows, cols, str, row - 1, col, visit, len + 1)) return true;
        if (row < rows - 1 && dfs(matrix, rows, cols, str, row + 1, col, visit, len + 1)) return true;
        if (col > 0 && dfs(matrix, rows, cols, str, row, col - 1, visit, len + 1)) return true;
        if (col < cols - 1 && dfs(matrix, rows, cols, str, row, col + 1, visit, len + 1)) return true;
        visit[row * cols + col] = true;
        return false;
    }
}
