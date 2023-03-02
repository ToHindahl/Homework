package three

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskTwoKtTest {

    @Test
    fun squareDigitTest() {
        Assertions.assertEquals(91, squareDigit(139))
    }

    @Test
    fun squareDigitRecursiveTest() {
        Assertions.assertEquals(91, squareDigitRecursive(139))
    }
}