package four

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskTenKtTest {

    @Test
    fun medianTest() {
        Assertions.assertEquals(4.0, median(intArrayOf(1,4,5)))
        Assertions.assertEquals(4.5, median(intArrayOf(1,4,5,6)))
        Assertions.assertEquals(4.0, median(intArrayOf(1,4,5)))
        Assertions.assertEquals(4.0, median(intArrayOf(1,4,5)))
    }
}