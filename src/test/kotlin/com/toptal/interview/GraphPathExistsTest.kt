package com.toptal.interview

import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class GraphPathExistsTest {

    private val graphPathExists = GraphPathExists()

    @Test
    fun `path exists when every consecutive pair is connected`() {
        assertTrue(
            graphPathExists.solution(
                4, intArrayOf(1, 2, 4, 4, 3), intArrayOf(2, 3, 1, 3, 1)))
    }

    @Test
    fun `path does not exist when a consecutive edge is missing`() {
        assertFalse(
            graphPathExists.solution(
                4, intArrayOf(1, 2, 1, 3), intArrayOf(2, 4, 3, 4)))
    }

    @Test
    fun `path does not exist when node one is disconnected`() {
        assertFalse(
            graphPathExists.solution(
                6, intArrayOf(2, 4, 5, 3), intArrayOf(3, 5, 6, 4)))
    }

    @Test
    fun `edges can be supplied in either direction`() {
        assertTrue(
            graphPathExists.solution(3, intArrayOf(1, 3), intArrayOf(2, 2)))
    }

    @Test
    fun `single node is already the destination`() {
        assertTrue(graphPathExists.solution(1, intArrayOf(), intArrayOf()))
    }
}
