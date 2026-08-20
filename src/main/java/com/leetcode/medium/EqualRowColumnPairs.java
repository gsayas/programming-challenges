package com.leetcode.medium;

public class EqualRowColumnPairs {

    public int equalPairs(int[][] grid) {
        int out = 0;
        boolean eq = true;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                eq = true;
                for (int k = 0; k < grid.length; k++) {
                    if (grid[i][k] != grid[k][j]) {
                        eq = false;
                        break;
                    }
                }

                if (eq) out++;
            }
        }

        return out;
    }


}
