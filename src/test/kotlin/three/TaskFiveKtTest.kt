package three

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class TaskFiveKtTest {

    @Test
    fun reverseStringRecursiveTest() {
        Assertions.assertEquals("gnirtS", reverseStringEndrecursive("String"))
    }
}