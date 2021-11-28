import kotlin.math.pow

fun main() {

    val s = readLine()!!
    val read=s.split(" ")


    val listOfInt= Array(read.size){ read[it].toDouble() }

    listOfInt.sortDescending()

    var a=listOfInt[0]
    var b=listOfInt[1]
    var c=listOfInt[2]


    if (a>=b+c){
        println("NAO FORMA TRIANGULO")
    }
    else if (a.pow(2)==b.pow(2)+c.pow(2)){
        println("TRIANGULO RETANGULO")
    }
    else if (a.pow(2)>b.pow(2)+c.pow(2)){
        println("TRIANGULO OBTUSANGULO")
    }
    else if (a.pow(2)<b.pow(2)+c.pow(2)){
        println("TRIANGULO ACUTANGULO")
    }

    if (a==b && b==c){
        println("TRIANGULO EQUILATERO")
    }
    else if (a==b || b==c){
        println("TRIANGULO ISOSCELES")
    }

}