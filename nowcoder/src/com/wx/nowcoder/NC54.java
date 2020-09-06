package com.wx.nowcoder;

import java.util.ArrayList;
import java.util.Arrays;

public class NC54 {
    public ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        Arrays.sort(num);
        dfs(0, num, new ArrayList<>(), lists, 0, new boolean[num.length]);
        return lists;

    }

    private void dfs(int step, int[] num, ArrayList<Integer> list, ArrayList<ArrayList<Integer>> lists, int target, boolean[] visit) {
        if (list.size() == 3 && target == 0) {
            lists.add(new ArrayList<>(list));
            return;
        }
        if (list.size() > 3) return;
        for (int i = step; i < num.length; i++) {
            if (!visit[i]) {
                list.add(num[i]);
                visit[i] = true;
                dfs(step++, num, list, lists, target - num[i], visit);
                visit[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        NC54 nc = new NC54();
        int[] num = {-1, 0, 1, 2, -1, -4};
        ArrayList<ArrayList<Integer>> list = nc.threeSum(num);
        System.out.println(list);
    }
}
