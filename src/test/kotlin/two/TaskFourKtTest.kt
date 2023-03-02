package two

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskFourKtTest {

    @Test
    fun countWordsTest1() {
        Assertions.assertEquals(2, countWords("Hello World!"))
    }

    @Test
    fun countWordsTest2() {
        Assertions.assertEquals(3, countWords("Hello World! Google"))
    }

    @Test
    fun countWordsTest3() {
        Assertions.assertEquals(4, countWords("Hello World! From Tobias"))
    }

    @Test
    fun countWordsTest4() {
        Assertions.assertEquals(0, countWords(" "))
    }

    @Test
    fun countWordsTest5() {
        Assertions.assertEquals(4, countWords(" Hello World! From Tobias"))
    }

    @Test
    fun countWordsTest6() {
        Assertions.assertEquals(4, countWords("Hello World!    From Tobias  "))
    }

}