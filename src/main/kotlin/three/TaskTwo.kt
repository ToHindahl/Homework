package three

/**
 * Aufgabe 2, Übungsblatt 3 - Quadrat jeder Ziffer
 * @param[x] Input Number
 * @return Calculation result
 */

fun squareDigit(x : Int) : Int {
    var result = 0
    for(char in x.toString()) {
        result += powerRecursive(char.digitToInt(), 2)
    }
    return result
}

/**
 * Aufgabe 2a, Übungsblatt 3 - Quadrat jeder Ziffer Rekursiv
 * @param[x] Input Number
 * @return Calculation result
 */

fun squareDigitRecursive(x : Int) : Int {
    val s = x.toString()
    return if(x == 0) {
        0
    } else {
        squareDigit(s.substring(0, s.length-1).toInt()) + powerRecursive(s[s.length-1].digitToInt(), 2)
    }
}