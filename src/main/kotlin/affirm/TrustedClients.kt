package affirm

class TrustedClients {

    fun findEstablishedUsers(logA: List<String>, logB: List<String>): List<String> {

        val logs: List<String> = logA + logB
        var structuredLogs: MutableList<List<String>> = mutableListOf()

        for (str in logs) {
            structuredLogs.add(str.split(","))
        }

        val map: Map<String, List<List<String>>> = structuredLogs
            .groupBy { it[2] }

        return map
            .filterValues(::checkTrustCriteria)
            .keys
            .toList()
    }

    private fun checkTrustCriteria(listOfLoans: List<List<String>>): Boolean {

        if (listOfLoans.size < 2)
            return false

        for (loan in listOfLoans) {
            if (listOfLoans[0][0] != loan[0] && listOfLoans[0][1] != loan[1]) {
                return true
            }

        }

        return false
    }

    /*
    #====START_LOG_A====#
    2025-01-01,Store,uuid1,100
    2025-01-01,Web,uuid1,150
    2025-01-01,Phone,uuid2,200
    2025-01-01,Web,uuid2,300
    =====END_LOG_A=====
    #====START_LOG_B====#
    2025-01-02,Web,uuid1,250
    2025-01-02,Phone,uuid2,50
    #====END_LOG_B====#

    */

}