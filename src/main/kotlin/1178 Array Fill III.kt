fun main() {
    var x= readLine()!!.toDouble()
    var array=Array<Double>(100){0.0}
    for (i in 0..99){
        array[i]=x
        println("N[$i] = ${"%.4f".format(array[i])}")
        x /= 2
    }
}