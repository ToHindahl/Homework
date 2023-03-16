package nine

import five.two.Point
import two.isPrime

fun containsPrime(numbers: List<Int>): Boolean {
    return numbers.any(::isPrime)
}

fun containsListWithMeanOutsideRange(lists: List<List<Int>>): Boolean {
    return lists.any { it.sum() / it.size.toDouble() > 1 || it.sum() / it.size.toDouble() < -1 }
}

fun averageDistanceToOrigin(points : List<Point>): Double {
    return points.map { it.x * it.x + it.y * it.y }.reduce { acc, d -> acc + d } / points.size
}
