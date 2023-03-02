package three

/**
 * Aufgabe 1, Übungsblatt 3 - Exponential Rechnung mit FOR Schleife
 * @param[n] Base
 * @param[exp] Exponent
 * @return Calculation result
 */
fun power (n : Int, exp : Int) : Int {
    var result = 1
    for (i in 1 .. exp) {
        result *= n
    }
    return result
}

/**
 * Aufgabe 1a, Übungsblatt 3 - Exponential Rechnung Rekursiv
 * @param[n] Base
 * @param[exp] Exponent
 * @return Calculation result
 */
fun powerRecursive (n: Int, exp : Int) : Int {
    return if (exp == 0) {
        1
    } else {
        n * powerRecursive(n, exp - 1)
    }
}