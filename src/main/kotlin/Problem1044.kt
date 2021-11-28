fun main() {

    val s= readLine()!!
    val read=s.split(" ")
    val a=read[0].toInt()
    val b=read[1].toInt()
    val c=a%b
    if (a%b==0 || b%a==0 ){
        println("Sao Multiplos")
    }
    else{
        println("Nao sao Multiplos")
    }
}