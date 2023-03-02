package two

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskFiveKtTest {

    @Test
    fun checkParenthesisTest1() {
        Assertions.assertEquals(true, checkParenthesis("()"))
    }

    @Test
    fun checkParenthesisTest2() {
        Assertions.assertEquals(true, checkParenthesis("(())()"))
    }

    @Test
    fun checkParenthesisTest3() {
        Assertions.assertEquals(false, checkParenthesis("(()))()"))
    }

    @Test
    fun checkParenthesisTest4() {
        Assertions.assertEquals(true, checkParenthesis("(foo)(bar())"))
    }

    @Test
    fun checkParenthesisTest5() {
        Assertions.assertEquals(false, checkParenthesis("(foo))((bar())"))
    }

    @Test
    fun checkParenthesisTest6() {
        Assertions.assertEquals(false, checkParenthesis(")("))
    }

    @Test
    fun checkParenthesisTest7() {
        Assertions.assertEquals(false, checkParenthesis("(()"))
    }
}