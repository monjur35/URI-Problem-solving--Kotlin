fun main() {
    var s= readLine()!!.toInt()

    for (i in 1..s){
        if (s%i==0){
            println(i)
        }
    }

}