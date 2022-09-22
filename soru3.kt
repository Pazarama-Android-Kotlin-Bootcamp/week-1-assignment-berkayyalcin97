fun main() {

    //Patika Pazarama Bootcamp 1. ödev Soru 3 Berkay Yalcin

    //Soru 3 File ı run yapılınca console üzerinden kullanıcı inputu girer ve sayı...
    //...fonksiyona gönderilir gönderilen sayının faktoriyeli  console üzerine yazdırılır
    //İnput 1 : 4 Expected output 1 : 24 , İnpu1 2 : 8 Expected output 2 : 40320


    fun FirstFactorial(num: Int): Int {
        if (num == 1) {
            return 1
        } else {
            return num * FirstFactorial(num - 1)
        }
    }

    val inputInt = readLine()       //Kullanıcı faktoriyeli alınacak sayıyı girer
    if (inputInt != null) {
        println(FirstFactorial(inputInt.toInt()))
    }

}