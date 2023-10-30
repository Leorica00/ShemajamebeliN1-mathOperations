import kotlin.math.max
import kotlin.math.min

class MathOperations {


    fun biggestSimilarDivision(numb1: Int, numb2:Int): Int {
        for (i in numb1 downTo 1){
            if (numb1%i == 0 && numb2%i == 0){
                return i
            }
        }
        return 1
    }

    fun smallestSimilarMultiple(numb1: Int, numb2: Int): Int {
        val minimum: Int = min(numb1, numb2)
        val maximum: Int = max(numb1, numb2)
        var i = 1
        while (true){
            if ((minimum * i) % maximum == 0){
                return (minimum * i)
            }
            i++
        }
    }

    fun containsDollar(s: String): Boolean {
        for (str in s){
            if (str == '$'){
                return true
            }
        }
        return false
    }

    fun sumEven(sum: Int = 0): Int{
        if (sum != 100){
            return sum + sumEven(sum+2)
        }
        return 0
    }

    fun reverseNumber(numb: Int): Int {
        var finalNumbString = ""
        var check = false
        for (i in ((numb.toString().length)-1) downTo 0){
            if(numb.toString()[i] != '0' && !check){
                finalNumbString += numb.toString()[i]
                check = true
            }else if(check){
                finalNumbString += numb.toString()[i]
            }
        }
        return finalNumbString.toIntOrNull() ?: 0
    }

    fun isPollindrome(s: String): Boolean {
        for (i in 0..<s.length){
            if (s[i] != s[s.length-i-1]){
                return false
            }
        }
        return true
    }


}