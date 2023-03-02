package three

/**
 * Aufgabe 3, Übungsblatt 3 - Faktorial Rechnung Rekursiv
 * @param[n] Factorial Number X!
 * @return Factorial result
 */
fun factorialRecursive(n: Int) : Long {
    return if (n == 0) {
        1
    } else {
        factorialRecursive(n-1) * n
    }
}

/**
 * Aufgabe 3a, Übungsblatt 3 - Faktorial Rechnung Endrekursiv
 * @param[n] Factorial Number X!
 * @param[accumulator] accumulator
 * @return Factorial result
 */
tailrec fun factorialTailrecursive(n : Int, accumulator : Long = 1) : Long {
    return if (n > 1) {
        factorialTailrecursive(n - 1, accumulator * n)
    } else {
        accumulator
    }
}
