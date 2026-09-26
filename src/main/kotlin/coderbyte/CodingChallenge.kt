package coderbyte

class CodingChallenge {

    fun solution(str: String): String {

        val halves = splitInHalves(str)

        val computedBalances: MutableMap<String, Int> = toMapOfBalances(halves[0])
        val requests: List<Request> = toListOfRequests(halves[1])
        val paidRequests = mutableListOf<Request>()

        val requestsByCurrency: Map<String, List<Request>> = requests
            .filter { request ->
                request.currency in processingFees
            }
            .map { request ->
                val processingFee = processingFees.getValue(request.currency)

                val actualAmount = request.amount - processingFee
                Request(
                    request.streamerName,
                    request.currency,
                    actualAmount
                )
            }
            .groupBy { it.currency }
            .mapValues { it.value.sortedBy { request -> request.amount } }

        for ((currency, currencyRequests) in requestsByCurrency) {
            for (request in currencyRequests) {
                val balance = computedBalances[request.currency] ?: continue

                if (balance >= request.amount) {
                    computedBalances[currency] = balance - request.amount
                    paidRequests.add(request)
                } else {
                    //insufficient balance
                }

            }
        }

        val sortedBalances = computedBalances
            .toSortedMap()
            .filter { (key, _) -> processingFees.keys.contains(key) }

        val serializedBalances = sortedBalances.entries
            .joinToString("|") { (currency, balance) ->
                "$currency:$balance"
            }

        val paidRequestsByCurrency = paidRequests.groupBy { request ->
            request.currency
        }

        val serializedPaidRequests = sortedBalances
            .keys
            .flatMap { currency ->
                paidRequestsByCurrency[currency]
                    .orEmpty()
                    .sortedBy { request -> request.amount }
            }.joinToString("|")


        return "$serializedBalances&$serializedPaidRequests"

    }

    fun toMapOfBalances(str: String): MutableMap<String, Int> {
        return str
            .split("|")
            .associate { rawBalance ->
                val (currency, amount) = rawBalance.split(":")
                currency to amount.toInt()
            }.toMutableMap()

    }

    fun splitInHalves(str: String): List<String> {
        return str.split("&")
    }

    data class Request(
        val streamerName: String,
        val currency: String,
        val amount: Int
    ) {
        override fun toString(): String {
            return "$streamerName:$currency:$amount"
        }
    }

    val processingFees = mapOf(
        "TRY" to 1,
        "EUR" to 2,
        "USD" to 2,
    )

    fun parseRequest(rawRequest: String): Request {
        val structuredRequest = rawRequest.split(":")

        return Request(
            streamerName = structuredRequest[0],
            currency = structuredRequest[1],
            amount = structuredRequest[2].toInt()
        )
    }

    fun toListOfRequests(str: String): List<Request> {
        val rawRequests = str.split("|")

        return rawRequests.map { rawRequest -> parseRequest(rawRequest) }
    }


}

fun main() {
    println(
        CodingChallenge().solution(
            "TRY:5000|EUR:300|AZN:150&streamer1:USD:150|streamer2:EUR:100|streamer3:USD:200" +
                "|streamer4:TRY:1400|streamer4:TRY:110|streamer6:AZN:10|streamer7:RUB:20|streamer16:TRY:8"
        )
    )
}