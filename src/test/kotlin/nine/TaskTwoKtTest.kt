package nine

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import java.lang.Exception

class TaskTwoKtTest {


    @Test
    fun priorityQueueTest() {
        val queue = PriorityQueue()
        val testVertexA = WeightedVertex("A")
        val testVertexB = WeightedVertex("B")
        queue.offer(Pair(testVertexA, 3.0))
        queue.offer(Pair(testVertexB, 1.0))
        Assertions.assertEquals(Pair(testVertexB, 1.0), queue.poll())
        Assertions.assertEquals(Pair(testVertexA, 3.0), queue.poll())
    }
}