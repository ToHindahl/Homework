package one

import one.factorial
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskSixKtTest {

    @Test
    fun factorialTest1() {
        Assertions.assertEquals(1, factorial(1))
    }
    @Test
    fun factorialTest2() {
        Assertions.assertEquals(2, factorial(2))
    }
    @Test
    fun factorialTest6() {
        Assertions.assertEquals(6, factorial(3))
    }
    @Test
    fun factorialTestZero() {
        Assertions.assertEquals(1, factorial(0))

    }
    @Test
    fun factorialTest20() {
        Assertions.assertEquals(2432902008176640000, factorial(20))
    }

}