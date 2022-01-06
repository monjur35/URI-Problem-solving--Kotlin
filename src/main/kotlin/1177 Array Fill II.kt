fun main() {
    var array=Array<Int>(1000){0}
    var t= readLine()!!.toInt()
    var x=0

    if (t in 2..50){
        for (j in 0..999){
            if (j%t==0){
               x=0
                array[j]=x
                println("N[$j] = ${array[j]}")
                x++
            }
            else{
                array[j]=x
                println("N[$j] = ${array[j]}")
                x++
            }
        }
    }
}