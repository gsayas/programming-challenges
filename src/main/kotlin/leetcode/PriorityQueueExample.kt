package leetcode

import java.util.*

//https://leetcode.com/discuss/post/1168125/toptal-live-interview-minimum-shopping-t-stva/

class PriorityQueueExample {
    fun solution(listOfTuples: List<Pair<Int, Int>>): Int {
        val nextAvailableTimes = PriorityQueue(listOf(0, 0, 0))

        listOfTuples.forEach { (arrivalTime, shoppingDuration) ->
            val nextAvailableTime = nextAvailableTimes.poll()
            val finishTime = maxOf(arrivalTime, nextAvailableTime) + shoppingDuration
            nextAvailableTimes.add(finishTime)
        }

        return nextAvailableTimes.maxOrNull() ?: 0
    }
}
