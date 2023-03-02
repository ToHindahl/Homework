package three

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskNineKtTest {

    @Test
    fun isPrimeRecursiveTestNoPrime() {
        Assertions.assertEquals(false, isPrimeRecursive(6))
    }

    @Test
    fun isPrimeRecursiveTestIsPrime() {
        Assertions.assertEquals(true, isPrimeRecursive(7))
    }

    @Test
    fun isPrimeRecursiveTestOne() {
        Assertions.assertEquals(false, isPrimeRecursive(1))
    }

    @Test
    fun isPrimeRecursiveTestIsZero() {
        Assertions.assertEquals(false, isPrimeRecursive(0))
    }

    @Test
    fun isPrimeRecursiveTestTwo() {
        Assertions.assertEquals(true, isPrimeRecursive(2))
    }

    @Test
    fun isPrimeRecursiveTestNegativ() {
        Assertions.assertEquals(false, isPrimeRecursive(-7))
    }
}