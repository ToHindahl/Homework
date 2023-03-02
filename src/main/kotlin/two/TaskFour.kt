package two

/**
 * Aufgabe 4, Übungsblatt 2 - Wörter zähler
 * @param[s] String with Words
 * @return Count of Words in String
 */
fun countWords(s : String) : Int {
    var worker = 0
    var counter = 0
    for(char in s) {
        if(char != ' ' && worker == 0) {
            worker = 1
            counter++
        } else if(char == ' ') {
            worker = 0
        }
    }

    return counter
}