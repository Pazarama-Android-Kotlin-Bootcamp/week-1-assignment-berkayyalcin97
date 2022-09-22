fun main() {

    //Patika Pazarama Bootcamp 1. ödev Soru 2 Berkay Yalcin

    //Soru 2 File ı run yapılınca console üzerinden kullanıcı Arrayde olmasını istediği sayı miktarını ve..
    // ..inputu girer ve array fonksiyona gönderilir gönderilen arraydeki sayılar arasına boşluk
    //...konulmalıdır sonuç console üzerine yazdırılır

    fun aVeryBigSum(ar: Array<Long>): Long {
        return ar.sum()              //Array icindeki sayılar toplanır ve returnlenir
    }

    val sizeOfNumbers = readLine()   // kullanıcı Arrayde olmasını istediği sayı miktarını girer
    val ar = readLine()!!.trimEnd().split(" ").map{ it.toLong() }.toTypedArray()  //Array icindeki sayılar arasındaki boşluk ayrılır
    val result = aVeryBigSum(ar)
    println(result)
}