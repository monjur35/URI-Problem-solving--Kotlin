
import kotlin.math.pow

fun main() {

    var s= readLine()!!.toInt()

    if (s in 5..2000){

        for (i in 2..s){
            if (i%2==0){
                println("$i^2 = ${(i.toDouble().pow(2)).toInt()}")
            }
        }
    }
}