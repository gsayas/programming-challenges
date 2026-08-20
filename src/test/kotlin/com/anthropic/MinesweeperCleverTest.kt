package com.anthropic

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class MinesweeperCleverTest {
    @Test
    fun case1() {
        val result = MinesweeperClever().solution(listOf("XOO", "OOO", "XXO"))
        assertEquals(listOf("X 1 0", "3 3 1", "X X 1"), result)
    }

}