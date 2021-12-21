fun main() {
    var s=0.0
    for (i in 1..100){
        s+=1/i.toDouble()

    }
    println("%.2f".format(s))

}