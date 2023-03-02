package three

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TaskThreeKtTest {

    @Test
    fun factorialRecursiveTest1() {
        Assertions.assertEquals(1, factorialRecursive(1))
    }

    @Test
    fun factorialRecursiveTest2() {
        Assertions.assertEquals(2, factorialRecursive(2))
    }

    @Test
    fun factorialRecursiveTest6() {
        Assertions.assertEquals(6, factorialRecursive(3))
    }

    @Test
    fun factorialRecursiveTestZero() {
        Assertions.assertEquals(1, factorialRecursive(0))

    }

    @Test
    fun factorialRecursiveTest20() {
        Assertions.assertEquals(2432902008176640000, factorialRecursive(20))
    }

    @Test
    fun factorialTailrecursiveTest1() {
        Assertions.assertEquals(1, factorialTailrecursive(1))
    }

    @Test
    fun factorialTailrecursiveTest2() {
        Assertions.assertEquals(2, factorialTailrecursive(2))
    }

    @Test
    fun factorialTailrecursiveTest6() {
        Assertions.assertEquals(6, factorialTailrecursive(3))
    }

    @Test
    fun factorialTailrecursiveTestZero() {
        Assertions.assertEquals(1, factorialTailrecursive(0))

    }

    @Test
    fun factorialTailrecursiveTest20() {
        Assertions.assertEquals(2432902008176640000, factorialTailrecursive(20))
    }
}
