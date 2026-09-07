package me.giocode

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class DiagonalDifferenceTest {
    @Test
    fun diagonalDifference() {
        val input = arrayOf(
            arrayOf(1, 2, 3),
            arrayOf(4, 5, 6),
            arrayOf(9, 8, 9)
        )
        val res = DiagonalDifference().diagonalDifference(input)
        assertEquals(2, res)

    }

    @Test
    fun case1() {
        val input = arrayOf(
            arrayOf(11, 2, 4),
            arrayOf(4, 5, 6),
            arrayOf(10, 8, -12)
        )
        val res = DiagonalDifference().diagonalDifference(input)
        assertEquals(15, res)

    }

}