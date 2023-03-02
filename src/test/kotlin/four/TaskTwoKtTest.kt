package four

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskTwoKtTest {

    @Test
    fun sumThrowsWithTwoDiceTest() {
        Assertions.assertEquals("2, 3, 4, 5, 6, 7, 3, 4, 5, 6, 7, 8, 4, 5, 6, 7, 8, 9, 5, 6, 7, 8, 9, 10, 6, 7, 8, 9, 10, 11, 7, 8, 9, 10, 11, 12", sumThrowsWithTwoDice(12).joinToString(", " ))
    }

    @Test
    fun sumThrowsWithTwoDiceTestTwo() {
        Assertions.assertEquals("2", sumThrowsWithTwoDice(2).joinToString(", " ))
    }

    @Test
    fun sumThrowsWithTwoDiceTestFour() {
        Assertions.assertEquals("2, 3, 3, 4", sumThrowsWithTwoDice(4).joinToString(", " ))
    }

    @Test
    fun sumThrowsWithTwoDiceTestZero() {
        Assertions.assertEquals("", sumThrowsWithTwoDice(0).joinToString(", " ))
    }
}