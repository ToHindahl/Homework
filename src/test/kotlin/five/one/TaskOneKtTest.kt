package five.one

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class TaskOneKtTest {

    val a : IntArray = intArrayOf(1,2,3,4,5,6)

    @Test
    fun indexOfIntTestFalse() {
        Assertions.assertEquals(-1, indexOfInt(a ,7))
    }

    @Test
    fun indexOfIntTestTrue() {
        Assertions.assertEquals(3, indexOfInt(a, 4))
    }


}