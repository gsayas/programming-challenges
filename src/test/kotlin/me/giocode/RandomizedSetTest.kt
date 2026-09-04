package me.giocode

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class RandomizedSetTest {

    @Test
    fun `explanation of the problem example`() {
        val randomizedSet = RandomizedSet()
        assertTrue { randomizedSet.insert(1) }
        assertFalse { randomizedSet.remove(2) }

        randomizedSet.insert(2)
        assertEquals(listOf<Int>(1, 2), randomizedSet.toIntList())
        assertTrue { randomizedSet.getRandom() in 1..2 }

        assertTrue { randomizedSet.remove(1) }
        assertEquals(listOf<Int>(2), randomizedSet.toIntList())


        assertFalse { randomizedSet.insert(2) }
        assertEquals(2, randomizedSet.getRandom())
        // Since 2 is the only number in the set, getRandom() will always // return 2.
    }

    @Test
    fun `insertion order`() {
        val randomizedSet = RandomizedSet()
        assertTrue { randomizedSet.insert(1) }
        assertTrue { randomizedSet.insert(10) }
        assertTrue { randomizedSet.insert(20) }
        assertTrue { randomizedSet.insert(30) }

        assertEquals(10, randomizedSet.getRandom())
    }

    //"RandomizedSet","insert","insert","insert","insert","getRandom","getRandom","getRandom","getRandom"
    //[[],[1],[10],[20],[30],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],[],
    //https://leetcode.com/problems/insert-delete-getrandom-o1/description/

    //my output [null,true,true,true,true,1,1,20,10,1
    //expected  [null,true,true,true,true,10,20,20,30,10
}