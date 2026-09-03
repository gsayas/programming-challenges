package me.giocode

class DesignHitCounter() {

    val counters = sortedMapOf<Int, Int>(reverseOrder())

    fun hit(timestamp: Int) {
        counters[timestamp] = counters.getOrDefault(timestamp, 0) + 1
    }

    fun getHits(timestamp: Int): Int {

        var sum = 0
        val timeWindow = timestamp - 300

        for ((counterTimestamp, counterHits) in counters) {

            if (counterTimestamp <= timeWindow) {
                break
            }

            sum += counterHits
        }

        return sum

    }

}