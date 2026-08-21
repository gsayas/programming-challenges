package com.anthropic

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class PriorityQueueExampleTest {
    @Test
    fun `returns the latest cashier finish time`() {
        val result = PriorityQueueExample().solution(listOf(0 to 7, 1 to 3, 1 to 4))

        assertEquals(7, result)
    }

    @Test
    fun `assigns each customer to the first available cashier`() {
        val result = PriorityQueueExample().solution(listOf(0 to 2, 0 to 5, 1 to 3, 2 to 2))

        assertEquals(5, result)
    }

    @Test
    fun `makes a customer wait when every cashier is busy`() {
        val result = PriorityQueueExample().solution(listOf(0 to 10, 0 to 10, 0 to 10, 1 to 1))

        assertEquals(11, result)
    }

    @Test
    fun `does not start a cashier before the customer arrives`() {
        val result = PriorityQueueExample().solution(listOf(10 to 2))

        assertEquals(12, result)
    }

    @Test
    fun `returns zero when there are no customers`() {
        assertEquals(0, PriorityQueueExample().solution(emptyList()))
    }
}
