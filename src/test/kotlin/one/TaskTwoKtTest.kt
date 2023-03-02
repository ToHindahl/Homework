package one

import one.square
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskTwoKtTest {

    @Test
    fun squareTestPositive() {
        Assertions.assertEquals(4, square(2))
    }

    @Test
    fun squareTestNegative() {
        Assertions.assertEquals(4, square(-2))
    }

    @Test
    fun squareTestZero() {
        Assertions.assertEquals(0, square(0))
    }
}