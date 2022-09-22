fun main() {

    //Patika Pazarama Bootcamp 1. öDdev Soru 4 Berkay Yalcin

    //Soru 4 File ı run yapılınca console üzerinden kullanıcı inputu girer ve String...
    //...fonksiyona gönderilir gönderilen String içerisinde toplamı 10 olan...
    // ...sayılar arasında 3 adet ? varsa sonuç true olarak yoksa false console ekranına verilir

    //İnput 1 : "aa6?9" Expected output false : false , İnput 2 : "acc?7??sss?3rr1??????5" Expected output 2 : true

    fun QuestionsMarks(str: String): String {
        var questionMarkCount = 0
        var lastDigit = -1
        var result = "false"

        for (char in str) {
            if (char.isDigit()) {
                val currentDigit = Integer.valueOf(char.toString())
                val sum = currentDigit + lastDigit
                lastDigit = currentDigit

                if (sum == 10) {                 // digitler toplamı 10 ise isleme baslanır
                    if(questionMarkCount == 3){  // ? sayısına göre result true yada false a eşitlenir
                        result = "true"
                    }else{
                        result = "false"
                    }
                }else{
                    questionMarkCount = 0
                }
            }else if (char == '?'){       //char digit değilse ? idir ? sayısı arttırılır
                questionMarkCount++
            }
        }
        return result;
    }
    val inputString = readLine()                 //Kullanıcı inputu girer
    println(inputString?.let { QuestionsMarks(it) })

}