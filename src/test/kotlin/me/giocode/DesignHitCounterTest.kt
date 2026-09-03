package me.giocode

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DesignHitCounterTest {

    @Test
    fun case1() {
        val hitCounter = DesignHitCounter()

        hitCounter.hit(1);       // hit at timestamp 1.
        hitCounter.hit(2);       // hit at timestamp 2.
        hitCounter.hit(3);       // hit at timestamp 3.
        assertEquals(3, hitCounter.getHits(4))

        hitCounter.hit(300);     // hit at timestamp 300.
        assertEquals(4, hitCounter.getHits(300))

        assertEquals(3, hitCounter.getHits(301))

    }

    @Test
    fun case2() {
        val hitCounter = DesignHitCounter()

        hitCounter.hit(1);       // hit at timestamp 1.
        hitCounter.hit(300);       // hit at timestamp 1.

        assertEquals(1, hitCounter.getHits(301))

    }
}