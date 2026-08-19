package org.example.easy;

import java.util.Arrays;

public class PivotIndex {

    public int pivotIndex(int[] nums) {

        int sumLeft = 0;
        int sumRight = Arrays.stream(nums).sum() - nums[0];
        long zeroes = Arrays.stream(nums).filter(a -> a == 0).count();

        if(sumRight == 0) return 0;

        if(zeroes <= 1 && sumRight + nums[0] - nums[nums.length - 1] == 0) return nums.length - 1;

        for (int i = 1; i < nums.length; i++) {

            sumLeft += nums[i - 1];
            sumRight -= nums[i];

            if ( sumLeft == sumRight) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        PivotIndex pivotIndex = new PivotIndex();

        System.out.println(pivotIndex.pivotIndex(new int[]{1,7,3,6,5,6}));
    }
}
