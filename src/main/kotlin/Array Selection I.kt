fun main() {
    var array= FloatArray(100)

    for (i in 0..10){
        var x= readLine()!!.toFloat()
        array[i] = x
    }

    for (j in 0..10){
        if (array[j]<=10){
            println("A[$j] = ${"%.1f".format(array[j])}")

        }
    }
}


