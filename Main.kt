import java.util.*

//Pazarama Android Kotlin Bootcamp Ödev 1

fun main() {


    // Soru1
    println("Soru1 Cevabi (input :aa_)")
    println(Validation("aa_"))
    println("Soru1 Cevabi (input :u__hello_world123)")
    println(Validation("u__hello_world123"))

    // Soru2
    //val arCount = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()

    val result = aVeryBigSum(ar)

    println(result)

    //Soru 3
    println("Soru 3 cevabi (input : 4)")
    println(FirstFactorial(4))
    println("Soru 3 cevabi (input : 8)")
    println(FirstFactorial(8))

    // Soru4
    println("Soru 4 cevabi (input : aa6?9)")
    println(QuestionsMarks("aa6?9"))
    println("Soru 4 cevabi (input : acc?7??sss?3rr1??????5)")
    println(QuestionsMarks("acc?7??sss?3rr1??????5"))
}


//***** Soruların Algoritmaları *****

//Soru-1

fun Validation(str: String): String {
    var position = 0

    if (4 < str.length && str.length < 25){                    //The username is between 4 and 25 characters.
        if (str[0].isLetter()){                               //It must start with a letter.
            if (!str[str.length - 1].equals('_')){           //It cannot end with an underscore character.
                while (position < str.length){
                    if (str[position].isLetter() || str[position].isDigit() || str[position] == '_'){   //It can only contain letters, numbers, and the underscore character.
                        position++
                    }else{
                        return "false"
                    }
                }
                return "true"
            }
            else {
                return "false"
            }
        }
        else {
            return "false"
        }
    }else {
        return "false"
    }
}

//Soru-2
fun aVeryBigSum(ar: Array<Long>): Long {
    return ar.sum()
}

//Soru-3
fun FirstFactorial(num: Int): Int {
    if (num == 1) {
        return 1
    } else {
        return num * FirstFactorial(num - 1)
    }
}
//Soru-4
fun QuestionsMarks(str: String): String {
    var questionMarkCount = 0
    var lastDigit = -1
    var result = "false"

    for (char in str) {
        if (char.isDigit()) {
            val currentDigit = Integer.valueOf(char.toString())
            val sum = currentDigit + lastDigit
            lastDigit = currentDigit

            if (sum == 10) {
                if(questionMarkCount == 3){
                    result = "true"
                }else{
                    result = "false"
                }
            }else{
                questionMarkCount = 0
            }
        }else if (char == '?'){
            questionMarkCount++
        }
    }
    return result;
}