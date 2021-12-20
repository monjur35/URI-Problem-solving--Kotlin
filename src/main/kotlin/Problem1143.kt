fun main() {

    var n= readLine()!!.toInt()

    for (i in 1..n){
        for (j in 1..3){
            print("${i*j} ")
        }
        println()
    }
}