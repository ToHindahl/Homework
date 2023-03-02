package two

fun caesarEncrypt(s:String, offset : Int) : String {
    var work = s
    var result = ""
    for(i in 0 until work.length-1) {
        result += work.substring(i, i+1).replace(work[i], work[i].plus(offset))
    }
    return result
}