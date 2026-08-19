package com.toptal.interview

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SolutionTest {
    @Test
    fun solution() {
        val result = solution(listOf("X00", "000", "XX0"))
        assertEquals(listOf("X 1 0", "3 3 1", "X X 1"), result)
    }

    @Test
    fun case2() {
        val result = solution(
            listOf(
                "XOOXXXOO",
                "OOOOXOXX",
                "XXOXXOOO",
                "OXOOOXXX",
                "OOXXXXOX",
                "XOXXXOXO",
                "OOOXOXOX",
                "XOXXOXOX"
            )
        )
        assertEquals(
            listOf(
                "X 1 1 X X X 3 2",
                "3 3 3 5 X 5 X X",
                "X X 3 X X 5 5 4",
                "3 X 5 5 6 X X X",
                "2 4 X X X X 6 X",
                "X 3 X X X 5 X 3",
                "2 4 5 X 6 X 5 X",
                "X 2 X X 4 X 4 X",
            ), result
        )
    }

}