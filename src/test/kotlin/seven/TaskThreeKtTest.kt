package seven

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

import java.lang.Exception

class TaskThreeKtTest {

    @Test
    fun calculateTest() {
        Assertions.assertEquals(-1.0, calculate("1 2 + 3 4 * - 9 /"))
    }

    @Test
    fun calculateTestTwo() {
        Assertions.assertEquals(3.0, calculate("1 1 1 + +"))
    }

    @Test
    fun calculateTestFalse() {
        assertThrows <Exception>{
            calculate("1 2 + 4")
        }
    }

    @Test
    fun enqueue() {
    }

    @Test
    fun front() {
    }

    @Test
    fun dequeue() {
    }

    @Test
    fun isEmpty() {
    }
}