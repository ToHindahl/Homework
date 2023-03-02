package one

import one.max
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TaskThreeKtTest {

    @Test
    fun maxTestPositive() {
        Assertions.assertEquals(8, max(5, 8))
    }

    @Test
    fun maxTestNegative() {
        Assertions.assertEquals(-5, max(-8, -5))
    }

    @Test
    fun maxTestEqual() {
        Assertions.assertEquals(-5, max(-8, -5))
    }

    @Test
    fun maxTestNegativePositive() {
        Assertions.assertEquals(8, max(8, 2))
    }

    @Test
    fun maxTestZero() {
        Assertions.assertEquals(8, max(8, 2))
    }

    @Test
    fun maxTestSwitched() {
        Assertions.assertEquals(8, max(8, 2))
    }
}