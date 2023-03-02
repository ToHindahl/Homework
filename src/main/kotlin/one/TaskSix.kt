package one

fun factorial(n: Int): Long {
    var result: Long = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}