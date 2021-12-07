fun main() {

    val num= readLine()!!.toInt()
    if (num in 1..1000){
        for (i in 1..num){
            if (i%2==1){
                println(i)
            }
        }
    }
}