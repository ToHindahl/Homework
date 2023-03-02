package two

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskTwoKtTest {

    @Test
    fun isPrimeTestNoPrime() {
        Assertions.assertEquals(false, isPrime(6))
    }

    @Test
    fun isPrimeTestIsPrime() {
        Assertions.assertEquals(true, isPrime(7))
    }

    @Test
    fun isPrimeTestOne() {
        Assertions.assertEquals(false, isPrime(1))
    }

    @Test
    fun isPrimeTestIsZero() {
        Assertions.assertEquals(false, isPrime(0))
    }

    @Test
    fun isPrimeTestTwo() {
        Assertions.assertEquals(true, isPrime(2))
    }

    @Test
    fun isPrimeTestNegativ() {
        Assertions.assertEquals(false, isPrime(-7))
    }
}