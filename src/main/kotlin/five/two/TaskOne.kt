package five.two

data class Fraction(val numerator: Double, val denominator : Double) {
    fun toDecimal() : Double {
        return numerator / denominator
    }

    fun multiply(frac : Fraction) : Fraction {
        return Fraction(frac.numerator * numerator, frac.denominator * denominator)
    }

    fun divide(frac : Fraction) : Fraction {
        return frac.multiply(Fraction(denominator, numerator))
    }

    fun add(frac : Fraction) : Fraction {
        return Fraction(numerator * frac.denominator + denominator * frac.numerator, denominator * frac.denominator).reduce()
    }

    fun substract(frac : Fraction) : Fraction {
        return Fraction(numerator * frac.denominator - denominator * frac.numerator, denominator * frac.denominator).reduce()
    }

    fun reduce() : Fraction {
        val ggtData = ggt(numerator, denominator)
        return Fraction(numerator / ggtData, denominator / ggtData)
    }

}

fun ggt(a: Double, b: Double) : Double {
    return if (b == 0.0) a else ggt(b, a % b)
}
