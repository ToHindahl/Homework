package four

import kotlin.system.measureTimeMillis


fun main() {
    println(measureExecutionTimesBubbleSort(intArrayOf(10, 10, 100, 1000, 10000, 1000000)).joinToString(", "))
}

fun measureExecutionTimesBubbleSort(inputSizes : IntArray) : LongArray {
    val result = LongArray(inputSizes.size)
    for(i in inputSizes.indices) {
        result[i] = measureTimeMillis { bubbleSort(createRandomIntArray(inputSizes[i])) }
    }
    return  result
}