package com.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MergeStringsAlternativelyTest {

    @Test
    void mergeAlternately() {
        String result = new MergeStringsAlternatively().mergeAlternately("abc", "pqr");
        assertEquals("apbqcr", result);
    }

    @Test
    void mergeAlternately2() {
        String result = new MergeStringsAlternatively().mergeAlternately("ab", "pqrs");
        assertEquals("apbqrs", result);
    }

    @Test
    void mergeAlternately3() {
        String result = new MergeStringsAlternatively().mergeAlternately("ab", "pq");
        assertEquals("apbq", result);
    }

    @Test
    void mergeAlternately4() {
        String result = new MergeStringsAlternatively().mergeAlternately("abcd", "pq");
        assertEquals("apbqcd", result);
    }
}