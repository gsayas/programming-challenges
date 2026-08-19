package org.example.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExtraCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int max = Arrays.stream(candies).max().getAsInt();
        List<Boolean> result = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
                result.add(candies[i] + extraCandies >= max);
        }

        return result;
    }
}
