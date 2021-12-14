fun main() {

    var n= readLine()!!.toInt()
    for (i in 1..n){
        var s= readLine()!!.split(" ")
        var x=s[0].toInt()
        var y=s[1].toInt()

        if (y==0){
            println("divisao impossivel")
        }
        else{
            var div:Double=x.toDouble()/y.toDouble()
            println("%.1f".format(div))
        }
    }
}