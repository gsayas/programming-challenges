package supertech

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CelebrityProblemTest {
    @Test
    fun solution() {

        val res = CelebrityProblem().solution(
            listOf(
                listOf(0, 0, 1, 0),
                listOf(0, 0, 1, 0),
                listOf(0, 0, 0, 0),
                listOf(0, 0, 1, 0),
            )
        )

        assertEquals(2, res)
    }


    @Test
    fun solution2() {

        val res = CelebrityProblem().solution(
            listOf(
                listOf(0, 0, 1, 0),
                listOf(0, 0, 1, 0),
                listOf(0, 1, 0, 0),
                listOf(0, 0, 1, 0),
            )
        )

        assertEquals(-1, res)
    }

    @Test
    fun `person who knows nobody is not necessarily a celebrity`() {
        val matrix = listOf(
            listOf(0, 0, 0),
            listOf(0, 0, 1),
            listOf(0, 1, 0),
        )

        assertEquals(-1, CelebrityProblem().solution(matrix))
    }

    @Test
    fun `multiple people who know nobody does not imply a celebrity`() {
        val matrix = listOf(
            listOf(0, 0),
            listOf(0, 0),
        )

        assertEquals(-1, CelebrityProblem().solution(matrix))
    }

    @Test
    fun `single person is a celebrity`() {
        assertEquals(
            0,
            CelebrityProblem().solution(listOf(listOf(0))),
        )
    }

    @Test
    fun `finds celebrity at first index`() {
        val matrix = listOf(
            listOf(0, 0, 0),
            listOf(1, 0, 0),
            listOf(1, 0, 0),
        )

        assertEquals(0, CelebrityProblem().solution(matrix))
    }

    @Test
    fun `finds celebrity at last index`() {
        val matrix = listOf(
            listOf(0, 0, 1),
            listOf(0, 0, 1),
            listOf(0, 0, 0),
        )

        assertEquals(2, CelebrityProblem().solution(matrix))
    }

}
