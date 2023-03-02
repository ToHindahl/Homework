package two

/**
 * Aufgabe 3, Übungsblatt 2 - String umdrehen
 * @param[s] Input String
 * @return reversed Input String
 */
fun reverseString(s : String) : String {
    var result = ""
    for(i in s.length downTo 0) {
        result += s[i]
    }
    return result
}