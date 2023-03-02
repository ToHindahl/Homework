package three

/**
 * Aufgabe 6, Übungsblatt 3 - Wörter zähler Rekursiv
 * @param[s] String with Words
 * @return Count of Words in String
 */


tailrec fun countWordsRecursive(s : String, accumulator : Int = 0) : Int {
    var worker = 0
    return if(s.isEmpty()) {
        accumulator
    } else if(s[0] == ' ') {
        countWordsRecursive(s.substring(1), accumulator)
    } else {
        val seperatorIndex : Int = s.indexOf(' ')
        if (seperatorIndex == -1) {
            accumulator+1
        } else {
            countWordsRecursive(s.substring(seperatorIndex + 1), accumulator + 1)
        }
    }
}