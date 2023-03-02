package four

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.random.Random

class TaskOneKtTest {

    @Test
    fun createRandomIntArrayTestSize() {
        val random = Random.nextInt()
        Assertions.assertEquals(random, createRandomIntArray(random).size)
    }
}