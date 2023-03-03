package seven

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskOneKtTest {

    @Test
    fun flattenTest() {
        val list = listOf(listOf(1, 2, 3), listOf(4, 5), listOf(6))
        val flattenedList = flatten(list)
        Assertions.assertEquals(listOf(1,2,3,4,5,6), flattenedList)
    }

    @Test
    fun flattenTestEmpty() {
        val list = listOf(emptyList<Int>())
        val flattenedList = flatten(list)
        Assertions.assertEquals(emptyList<Int>(), flattenedList)
    }

    @Test
    fun flattenTestTwo() {
        val list = listOf(listOf(1,2,3,4,5,6))
        val flattenedList = flatten(list)
        Assertions.assertEquals(listOf(1,2,3,4,5,6), flattenedList)
    }
}