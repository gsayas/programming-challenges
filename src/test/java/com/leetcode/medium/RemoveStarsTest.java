package com.leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RemoveStarsTest {

    @Test
    void simpleRemoval() {
        RemoveStars rs = new RemoveStars();
        String result = rs.removeStars("leet*cod*e");

        assertEquals("leecoe", result);
    }

    @Test
    void stackedThenSimple() {
        RemoveStars rs = new RemoveStars();
        String result = rs.removeStars("leet**cod*e");

        assertEquals("lecoe", result);
    }

    @Test
    void onlyStacked() {
        RemoveStars rs = new RemoveStars();
        String result = rs.removeStars("bocas*****");

        assertEquals("", result);
    }

    @Test
    void simpleThenStacked() {
        RemoveStars rs = new RemoveStars();
        String result = rs.removeStars("abb*cdfg*****x*");

        assertEquals("a", result);
    }

}