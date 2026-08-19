package org.example.easy;

import java.io.InputStream;
import java.util.Arrays;
import java.util.Properties;

public class MaximumAverageSubarray {

    public double findMaxAverage(int[] nums, int k) {
        double windowSum = 0;

        for(int i = 0; i < k; i ++) {
            windowSum += nums[i];
        }

        double maxSum = windowSum;

        if(nums.length == k) return windowSum / k;

        for (int i = 1; i < nums.length - k + 1; i++) {
            windowSum += nums[i + k - 1] - nums[i - 1];
            if( windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        return maxSum / k;
    }

//    public static void main(String[] args) {
//        Properties properties = new Properties();
//
//        try (InputStream input = MaximumAverageSubarray.class.getClassLoader()
//                .getResourceAsStream("maxAvgSubArray-input.properties")) {
//
//            if (input == null) {
//                System.out.println("Sorry, unable to find maxAvgSubArray-input.properties");
//                return;
//            }
//
//            // Load the properties file
//            properties.load(input);
//
//            // Read the array as a comma-separated string and convert it to an int array
//            String[] numsStr = properties.getProperty("nums").split(",");
//            int[] nums = Arrays.stream(numsStr).mapToInt(Integer::parseInt).toArray();
//
//            // Read the value of k
//            int k = Integer.parseInt(properties.getProperty("k"));
//
//            System.out.println(nums.length);
//            System.out.println(k);
//            MaximumAverageSubarray solver = new MaximumAverageSubarray();
//            System.out.println("Maximum Average: " + solver.findMaxAverage(nums, k));
//
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

    public static void main(String[] args) {
//        int [] nums = new int[]{1,12,-5,-6,50,3};
        int [] nums = new int[]{0,1,1,3,3};
        int k = 4;
        System.out.println(nums.length);
            System.out.println(k);
            MaximumAverageSubarray solver = new MaximumAverageSubarray();
            System.out.println("Maximum Average: " + solver.findMaxAverage(nums, k));


    }

}
