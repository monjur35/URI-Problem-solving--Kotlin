fun main() {

    val s= readLine()!!
    val read=s.split(" ")
    var a= read[0].toFloat()
    var b=read[1].toFloat()
    var c=read[2].toFloat()


    val sum=a+b+c
    if (a+b>c && a+c>b && b+c>a){
        println("Perimetro = $sum")

    }
    else{
        println("Area = ${((a+b)/2)*c}")
    }
}