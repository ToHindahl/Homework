package four

import kotlin.random.Random

/**
 * Aufgabe 1, Übungsblatt 4 - Int Array mit vorgebener Größe und Random Werten
 * @param[size] Size of Int Array
 * @return IntArray of given size with random Values
 */

fun createRandomIntArray(size : Int) : IntArray {
    val ints = IntArray(size)
    for (i in ints.indices){
        ints[i] = Random.nextInt(Int.MAX_VALUE)
    }
    return ints
}