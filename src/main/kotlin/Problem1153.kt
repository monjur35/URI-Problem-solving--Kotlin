fun main() {
    var n= readLine()!!.toInt()
    var nF=1
    if (n in 1..12){

        for (i in 1..n){
            nF *= i
        }
        println(nF)
    }
}