package three

import two.moduloLong

/**
 * Aufgabe 4, Übungsblatt 3 - Binär zu Dezimal als Rekursive Funktion
 * @param[binary] Binär String Input
 * @return Deciaml Int return
 */

tailrec fun binaryStringToDecimalRecursive(binary : Long, multiplier : Long = 1, accumulator : Long = 0) : Long {
    return if (binary == 0L) {
        accumulator
    } else {
        binaryStringToDecimalRecursive(binary/10, multiplier*2, accumulator+moduloLong(binary, 10)*multiplier)
    }
}