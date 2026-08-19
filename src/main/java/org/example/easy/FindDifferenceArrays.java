package org.example.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDifferenceArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        List<Integer> diff1 = set1.stream().filter(a -> !set2.contains(a)).collect(Collectors.toList());
        List<Integer> diff2 = set2.stream().filter(a -> !set1.contains(a)).collect(Collectors.toList());

        List<List<Integer>> res = new ArrayList<>();
        res.add(diff1);
        res.add(diff2);

        return res;
    }

    public static void main(String[] args) {

        FindDifferenceArrays findDifferenceArrays = new FindDifferenceArrays();
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};
        List<List<Integer>> res = findDifferenceArrays.findDifference(nums1, nums2);
        System.out.println(res);
    }

}
