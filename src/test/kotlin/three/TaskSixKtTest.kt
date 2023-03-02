package three

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import two.countWords

class TaskSixKtTest {

    @Test
    fun countWordsRecursiveTest1() {
        Assertions.assertEquals(2, countWordsRecursive("Hello World!"))
    }

    @Test
    fun countWordsRecursiveTest2() {
        Assertions.assertEquals(3, countWordsRecursive("Hello World! Google"))
    }

    @Test
    fun countWordsRecursiveTest3() {
        Assertions.assertEquals(4, countWordsRecursive("Hello World! From Tobias"))
    }

    @Test
    fun countWordsRecursiveTest4() {
        Assertions.assertEquals(0, countWordsRecursive(" "))
    }

    @Test
    fun countWordsRecursiveTest5() {
        Assertions.assertEquals(4, countWordsRecursive(" Hello World! From Tobias"))
    }

    @Test
    fun countWordsRecursiveTest6() {
        Assertions.assertEquals(4, countWordsRecursive("Hello World!    From Tobias  "))
    }

}