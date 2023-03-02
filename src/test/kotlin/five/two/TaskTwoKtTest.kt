package five.two

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import kotlin.math.sqrt

class TaskTwoKtTest {

    @Test
    fun distanceTest() {
        val pointOne = Point(1.0, 1.0)
        val pointTwo = Point(2.0, 1.0)
        Assertions.assertEquals(1.0, pointOne.distance(pointTwo))
    }

    @Test
    fun distanceTestZero() {
        val pointOne = Point(1.0, 1.0)
        Assertions.assertEquals(0.0, pointOne.distance(pointOne))
    }

    @Test
    fun distanceTest2() {
        val pointOne = Point(0.0, 0.0)
        val pointTwo = Point(2.0, 2.0)
        Assertions.assertEquals(sqrt(8.0), pointOne.distance(pointTwo))
    }
}