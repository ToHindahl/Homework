package three

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import two.checkParenthesis

class TaskTenKtTest {

    @Test
    fun checkParenthesisRecursiveTest1() {
        Assertions.assertEquals(true, checkParenthesisRecursive("()"))
    }

    @Test
    fun checkParenthesisRecursiveTest2() {
        Assertions.assertEquals(true, checkParenthesisRecursive("(())()"))
    }

    @Test
    fun checkParenthesisRecursiveTest3() {
        Assertions.assertEquals(false, checkParenthesisRecursive("(()))()"))
    }

    @Test
    fun checkParenthesisRecursiveTest4() {
        Assertions.assertEquals(true, checkParenthesisRecursive("(foo)(bar())"))
    }

    @Test
    fun checkParenthesisRecursiveTest5() {
        Assertions.assertEquals(false, checkParenthesisRecursive("(foo))((bar())"))
    }

    @Test
    fun checkParenthesisRecursiveTest6() {
        Assertions.assertEquals(false, checkParenthesisRecursive(")("))
    }

    @Test
    fun checkParenthesisRecursiveTest7() {
        Assertions.assertEquals(false, checkParenthesisRecursive("(()"))
    }
}