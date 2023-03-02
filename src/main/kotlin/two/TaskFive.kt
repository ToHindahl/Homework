package two

fun checkParenthesis(s : String) : Boolean {
    var worker = 0
    for(char in s) {
        if (worker < 0) {
            return false
        } else {
            if (char == '(') {
                worker += 1
            } else if (char == ')')
                worker -= 1
        }
    }
    return worker == 0
}