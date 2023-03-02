package three

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskSevenKtTest {

    @Test
    fun isPalindromeTestTrue() {
        Assertions.assertEquals(true, isPalindrome("otto"))
    }
    @Test
    fun isPalindromeTestFalse() {
        Assertions.assertEquals(false, isPalindrome("ott"))
    }
}