package four

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskThreeKtTest {

    @Test
    fun shuffleTestSize() {
        val size = 10
        val testArray = createRandomIntArray(size)
        shuffle(testArray, 100)
        Assertions.assertEquals(size, testArray.size)
    }

    @Test
    fun shuffleTestSum() {
    }
}