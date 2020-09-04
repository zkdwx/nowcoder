package com.wx.pingduoduo;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int max = 0;
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                max = dfs(arr, i, j, m, n, new boolean[m][n], 0);
            }
        }
        System.out.println(max);

    }

    private static int dfs(int[][] arr, int i, int j, int m, int n, boolean[][] visit, int max) {
        if (i >= m && j >= n) {
            return max;
        }
        if (!visit[i][j]) {
            if (i - 1 >= 0) {
                max++;
                visit[i][j] = true;
                dfs(arr, i - 1, j, m, n, visit, max);
                max--;
            }

            if (i + 1 < m) {
                max++;
                visit[i][j] = true;
                dfs(arr, i + 1, j, m, n, visit, max);
                max--;
            }
            if (j - 1 >= 0) {
                max++;
                visit[i][j] = true;
                dfs(arr, i, j - 1, m, n, visit, max);
                max--;
            }
            if (j + 1 < n) {
                max++;
                visit[i][j] = true;
                dfs(arr, i, j + 1, m, n, visit, max);
                max--;
            }
        }
        return 0;
    }
}
