package one

import one.abs
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TaskFourKtTest {

    @Test
    fun absTestNegative() {
        Assertions.assertEquals(10, abs(-10))
    }

    @Test
    fun absTestPositive() {
        Assertions.assertEquals(10, abs(10))
    }

    @Test
    fun absTestZero() {
        Assertions.assertEquals(0, abs(0))
    }
}