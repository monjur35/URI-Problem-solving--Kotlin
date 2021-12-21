fun main() {
    var ages=0.0
    var t=0
    while (true){
        var n= readLine()!!.toDouble()

        if (n<0){
            break
        }
        else{
            ages+=n
            t++
        }
    }
    println("%.2f".format(ages/t))

}