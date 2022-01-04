fun main() {
    var array = Array<Int>(10){0}
    for (i in 0..9){
        var s= readLine()!!.toInt()
        if (s>0 && s!=null){
            array[i] = s
        }
        else{
            array[i]=1
        }
        println("X[$i] = ${array[i]}")
    }
}