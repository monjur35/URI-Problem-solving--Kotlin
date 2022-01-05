fun main() {
    var array=Array<Int>(20){0}

    for (i in 0..19){
        var x= readLine()!!.toInt()
        array[i]=x
    }
    array.reverse()
    for (j in 0..19){
        println("N[$j] = ${array[j]}")
    }
}