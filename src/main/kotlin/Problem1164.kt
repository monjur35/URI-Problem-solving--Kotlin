fun main() {
    var n= readLine()!!.toInt()

    for (i in 1..n){
        var x= readLine()!!.toInt()
        var a=0
        for (j in 1 until x){
            if (x%j==0){
                a+=j
            }
        }
        if (a==x){
            println("$x eh perfeito")
        }
        else{
            println("$x nao eh perfeito")
        }
    }
}