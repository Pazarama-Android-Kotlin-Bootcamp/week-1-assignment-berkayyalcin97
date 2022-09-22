fun main() {

    //Patika Pazarama Bootcamp 1. ödev Soru 1 Berkay Yalcin

    //Soru 1 File ı run yapılınca console üzerinden kullanıcı inputu girer ve kullanıcı isminin uygunluğu...
    //...Validation fonksiyonu ile denetlenip sonuç console üzerine yazdırılır
    // Test İnput 1 : "aa_"  expected output: false  Test İnput 2 : "u__hello_world123" expected output 2 : true

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

    val inputString = readLine()                 // Kullanıcı Username girer
    println(inputString?.let { Validation(it) })
}