fun main() {


    var positiveNum=0

    for (i in 1..6){
        val nums= readLine()!!.toDouble()
        if (nums>0){
            positiveNum+=1
        }
    }

    println("$positiveNum valores positivos")

}