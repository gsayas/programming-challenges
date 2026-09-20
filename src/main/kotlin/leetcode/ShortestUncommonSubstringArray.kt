package leetcode

//https://leetcode.com/problems/shortest-uncommon-substring-in-an-array/description/?envType=company&envId=affirm&favoriteSlug=affirm-all

class ShortestUncommonSubstringArray {

    fun shortestSubstrings(arr: Array<String>): Array<String> {

        val subsMap: Map<Int, List<String>> =
            arr.indices.associateWith { index ->
                getSubstringsOf(arr[index])
            }


        val answer: MutableList<String> = mutableListOf()


        for (index in arr.indices) { //for every String in arr
            val currentSubs = subsMap.getValue(index).toSet()
//            otherSubs = (subsMap - s).values.flatMap { it }.toSet()
            val otherSubs = (subsMap - index).values.flatten().toSet()
            val uncommonSubs = currentSubs - otherSubs

            val shortest = uncommonSubs.minWithOrNull(
                compareBy<String> { it.length }
                    .thenBy { it }
            ) ?: ""
            answer.add(shortest)

        }

        return answer.toTypedArray()
    }

    fun getSubstringsOf(s: String): List<String> {
        val result = mutableListOf<String>()

        for (length in 1..s.length) {
            for (start in 0..s.length - length) {
                val endExclusive = start + length
                result.add(s.substring(start, endExclusive))
            }
        }

        return result
    }

}