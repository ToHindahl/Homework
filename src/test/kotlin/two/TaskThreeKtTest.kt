package two

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskThreeKtTest {

    @Test
    fun reverseStringTest() {
        Assertions.assertEquals("gnirtS", reverseString("String"))
    }

    @Test
    fun reverseStringTestEmpty() {
        Assertions.assertEquals("", reverseString(""))
    }

    @Test
    fun reverseStringTestSpace() {
        Assertions.assertEquals(" ", reverseString(" "))
    }

    @Test
    fun reverseStringTestSpace2() {
        Assertions.assertEquals("  a", reverseString("a  "))
    }
}