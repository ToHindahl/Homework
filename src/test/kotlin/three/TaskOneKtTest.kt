package three

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskOneKtTest {

    @Test
    fun powerTest1() {
        Assertions.assertEquals(16, power(2,4))
    }

    @Test
    fun powerTest2() {
        Assertions.assertEquals(2187, power(3,7))
    }

    @Test
    fun powerRecursiveTest1() {
        Assertions.assertEquals(16, powerRecursive(2,4))
    }

    @Test
    fun powerRecursiveTest2() {
        Assertions.assertEquals(2187, powerRecursive(3,7))
    }
}