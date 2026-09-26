package coderbyte

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CodingChallengeTest {
    @Test
    fun solution() {
        assertEquals(
            "EUR:202|TRY:3485&streamer2:EUR:98|streamer16:TRY:7|streamer4:TRY:109|streamer4:TRY:1399",
            CodingChallenge().solution(
                "TRY:5000|EUR:300|AZN:150&streamer1:USD:150|streamer2:EUR:100|streamer3:USD:200" +
                    "|streamer4:TRY:1400|streamer4:TRY:110|streamer6:AZN:10|streamer7:RUB:20|streamer16:TRY:8"
            )
        )
    }

}