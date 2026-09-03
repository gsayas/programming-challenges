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

    /*
    Your current complexity is:
    - hit: O(log n)
    - getHits: O(w), where w is the number of distinct timestamps examined in the active window
    - Space: O(n) because expired timestamps are never removed

    That last point is the primary weakness of this version. The next refinement of the same approach would remove expired entries;
    afterward, the classic queue and fixed-size circular-array solutions are worth comparing.

    */

}