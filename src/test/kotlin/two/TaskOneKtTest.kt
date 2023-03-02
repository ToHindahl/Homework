package two

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TaskOneKtTest {

    @Test
    fun binaryToDecimalTest() {
        Assertions.assertEquals(156, binaryToDecimal(10011100))
    }

    @Test
    fun binaryToDecimalTestOne() {
        Assertions.assertEquals(1, binaryToDecimal(1))
    }

    @Test
    fun binaryToDecimalTestZero() {
        Assertions.assertEquals(0, binaryToDecimal(0))
    }

    @Test
    fun binaryStringToDecimalTest() {
        Assertions.assertEquals(156, binaryStringToDecimal("10011100"))
    }

}