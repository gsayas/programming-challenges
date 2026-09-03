package me.giocode

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ManhattanCleverTest {
    @Test
    fun case1() {
        val result = ManhattanClever().solution(listOf("XOO", "OOO", "XXO"))
        assertEquals(listOf("X 1 0", "3 3 1", "X X 1"), result)
    }

    @Test
    fun case2() {
        val result = Manhattan().solution(
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
        Assertions.assertEquals(
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