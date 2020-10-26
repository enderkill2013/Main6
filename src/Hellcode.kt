fun main()
{
    var wil1 = Fraction(n=1F, d=2F)
    var wil2 = Fraction(n=4F, d=10F)
    println(wil1.equals(wil2))
    wil2.shekveca()
    println(wil2)
}



class Fraction (n: Float, d: Float) {
    private var numerator: Float = n
    private var denominator: Float = d

    fun jami(fraction: Fraction): Fraction {
        var k = denominator*fraction.denominator
        var v = k/denominator*numerator
        var z = k/fraction.denominator*fraction.numerator
        return Fraction(v+z, k)
    }
    fun sxvaoba(fraction: Fraction): Fraction {
        var k = denominator*fraction.denominator
        var v = k/denominator*numerator
        var z = k/fraction.denominator*fraction.numerator
        return Fraction(v-z, k)
    }
    fun gamravleba(fraction: Fraction): Fraction {
        var k = numerator*fraction.numerator
        var v = denominator*fraction.denominator
        return Fraction(k,v)
    }
    fun gayopa(fraction: Fraction): Fraction {
        var k = numerator/fraction.numerator
        var v = denominator/fraction.denominator
        return Fraction(k,v)
    }
    fun shekveca() {
        if(numerator>denominator){
            var m = denominator
            var i: Float = 1F
            while(m != i) {
                if(numerator%m==0F && denominator%m==0F) {
                    var v: Float = m
                    var q = numerator/v
                    var w = denominator/v
                    this.numerator = q
                    this.denominator = w
                    println("$q/$w")
                    break
                }
                m--
            }
        }
        if(denominator>numerator) {
            var m = numerator
            var i: Float = 1F
            while (m != i) {
                if (numerator % m == 0F && denominator % m == 0F) {
                    var v: Float = m
                    var q = numerator/v
                    var w = denominator/v
                    this.numerator = q
                    this.denominator = w
                    println("$q/$w")
                    break
                }
                m--
            }
        }

    }


    override fun toString(): String {
        return "$numerator/$denominator"
    }


    override fun equals(other: Any?): Boolean {
        if(other is Fraction){
            if(numerator* other.denominator == other.numerator * denominator){
                return true
            }
        }
        return false
    }

}