fun main() {

    var s= readLine()!!.toInt()

    for (i in 0 until s){
        var sets=readLine()!!.split(" ")
        var element1=sets[0].toDouble()
        var element2=sets[1].toDouble()
        var element3=sets[2].toDouble()

        var avg=((element1/10)*2+(element2/10)*3+(element3/10)*5)
        println("%.1f".format(avg))
    }
}