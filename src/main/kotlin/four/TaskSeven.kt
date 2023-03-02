package four

import five.one.isSorted

fun main() {
    println(isSorted(intArrayOf(1,2,3,3,5)))
    println(isSorted(intArrayOf(5,2,3,5)))
    println(isSorted(bubbleSort( createRandomIntArray(10))))
}

fun bubbleSort(a : IntArray) : IntArray {
    val result = a.copyOf()
    while(!isSorted(result)) {
        for (i in 1 until result.size) {
            if (result[i] < result[i - 1]) {
                val temp = result[i]
                result[i] = result[i - 1]
                result[i - 1] = temp
            }
        }
    }
    return result
}

