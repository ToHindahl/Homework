package one

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskOneKtTest {

    @Test
    fun isGreaterThanConstantSmaller() {
        Assertions.assertEquals(false, isGreaterThanConstant(4))
    }

    @Test
    fun isGreaterThanConstantEquals() {
        Assertions.assertEquals(false, isGreaterThanConstant(5))
    }

    @Test
    fun isGreaterThanConstantBigger() {
        Assertions.assertEquals(true, isGreaterThanConstant(6))
    }
}