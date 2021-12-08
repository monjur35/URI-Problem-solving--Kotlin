fun main() {
    var s= readLine()!!.toInt()

    for (i in 0..10000){
        if (i%s==2){
            println(i)
        }
    }
}