package three

/**
 * Aufgabe 5, Übungsblatt 3 - String umdrehen End-Rekursiv
 * @param[s] String Input
 * @return Reversed String Output
 */
tailrec fun reverseStringEndrecursive(s : String, accumulator : String = "") : String {
    return if (s.isEmpty()) {
        accumulator
    } else {
        reverseStringEndrecursive(s.substring(1), s[0] + accumulator)
    }
}
