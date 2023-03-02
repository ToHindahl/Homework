package four

import one.abs
import kotlin.random.Random

fun main() {
    val arrayTest = intArrayOf(1,2,3,4,6,7,8,9,10,11,12,13)
    shuffle(arrayTest, 100)
    println(arrayTest.joinToString(", " ))
}

fun shuffle(a : IntArray, numberOfSwaps : Int) : Unit {
    if(numberOfSwaps <= 0) {
        return
    }
    var indexOne = 0
    var indexTwo = 0
    while(indexOne == indexTwo) {
        indexOne = Random.nextInt(a.size)
        indexTwo = Random.nextInt(a.size)
        println("1: $indexOne, 2: $indexTwo")
    }

    val dataOne = a[indexOne]
    val dataTwo = a[indexTwo]
    a[indexOne] = dataTwo
    a[indexTwo] = dataOne
    println("Swap: " + numberOfSwaps + " - " + a.joinToString(", " ))

    return shuffle(a, numberOfSwaps-1)
}
