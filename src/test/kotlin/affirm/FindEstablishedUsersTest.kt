package affirm

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FindEstablishedUsersTest {
    @Test
    fun findEstablishedUsers() {
        val csv1 = listOf<String>(
            "2025-01-01,Store,uuid1,100",
            "2025-01-01,Web,uuid1,150",
            "2025-01-01,Phone,uuid2,200",
            "2025-01-01,Web,uuid2,300"
        )
        val csv2 = listOf<String>(
            "2025-01-02,Web,uuid1,250",
            "2025-01-02,Phone,uuid2,50"
        )
        val res = TrustedClients().findEstablishedUsers(csv1, csv2)
        assertEquals(listOf("uuid1", "uuid2"), res)
    }

}