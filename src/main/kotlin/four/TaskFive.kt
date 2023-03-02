package four

fun standardDeviation(a : IntArray) : Double {
    val average = averageOfIntArray(a)
    var sum = 0.0
    for(i in a.indices) {
        sum += (a[i] - average) * (a[i] - average)
    }
    val variance = sum / a.size
    // Wurzel hatten wir noch nicht
    return Math.sqrt(variance)
}
