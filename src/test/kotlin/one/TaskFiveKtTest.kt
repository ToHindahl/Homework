package one

import one.moduloNegativ
import one.moduloPositiv
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskFiveKtTest {

//Aufgabe 5a)

    @Test
    fun moduloPositivTest1() {
        Assertions.assertEquals(3, moduloPositiv(7, 4))
    }

    @Test
    fun moduloPositivTest2() {
        Assertions.assertEquals(0, moduloPositiv(12, 6))
    }

    @Test
    fun moduloPositivTest3() {
        Assertions.assertEquals(7, moduloPositiv(7, 10))
    }

    //Aufgabe 5b)
    @Test
    fun moduloNTest() {
        Assertions.assertEquals(-7, moduloNegativ(-7, -10))
    }

    @Test
    fun moduloNTest2() {
        Assertions.assertEquals(7, moduloNegativ(7, -10))
    }
}