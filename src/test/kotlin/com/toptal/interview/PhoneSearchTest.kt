package com.toptal.interview

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PhoneSearchTest {

    val phoneSearch = PhoneSearch()

    @Test
    fun solution() {
        assertEquals(
            "pom",
            phoneSearch.solution(
                arrayOf("pim", "pom"),
                arrayOf("999999999", "777888999"),
                "88999"
            )
        )
    }

    @Test
    fun case2() {
        assertEquals(
            "ann",
            phoneSearch.solution(
                arrayOf("sander", "amy", "ann", "michael"),
                arrayOf("123456789", "234567890", "789123456", "123123123"),
                "1"
            )
        )
    }

    @Test
    fun case3() {
        assertEquals(
            "NO CONTACT",
            phoneSearch.solution(
                arrayOf("adam", "eva", "leo"),
                arrayOf("121212121", "111111111", "444555666"),
                "112"
            )
        )
    }
}
