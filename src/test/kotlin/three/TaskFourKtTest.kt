package three

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import two.binaryStringToDecimal

class TaskFourKtTest {

    @Test
    fun binaryToDecimalRecursiveTest() {
        Assertions.assertEquals(156, binaryStringToDecimalRecursive(10011100))
    }
}