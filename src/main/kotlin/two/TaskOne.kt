package two

// Aufgabe 1)
fun binaryToDecimal(binary : Long) : Long {
    var result = 0L
    var lastDigit: Long
    var base = 1L
    var binary : Long = binary
    while (binary > 0) {
        lastDigit = moduloLong(binary, 10L)
        result += lastDigit * base
        base *= 2
        binary /= 10L

    }

    return result
}

fun moduloLong(x : Long, y : Long) : Long {
    return x - ((x / y) * y) // funktioniert, da wir mit ganzen Zahlen rechnen (Int)
}

/**
 * Aufgabe 1a, Übungsblatt 2 - Binärzahl als String zu Deziamlzahl
 * @param[binary] Binary as String !null & !empty
 * @return Decimal result
 */
fun binaryStringToDecimal(binary: String): Int {
    var result = 0
    var power = 0
    for (i in binary.length - 1 downTo 0) {
        val bit = binary[i]
        if (bit == '1') {
            result += calculatePower(2, power)
        }
        power++
    }
    return result
}


fun calculatePower(num: Int, pow: Int) : Int {
    return if (pow == 0) {
        return 1
    } else {
        return num * calculatePower(num, pow - 1)
    }
}