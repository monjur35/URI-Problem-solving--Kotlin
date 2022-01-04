fun main() {
    var n= readLine()!!.toInt()

    for (i in 1..n){
        var x= readLine()!!.toInt()
        var result=true
        for (j in 2 until x){
            if (x%j==0){
                result=false
                break
            }

        }
       if (result){
           println("$x eh primo")
       }
        else{
           println("$x nao eh primo")


       }
    }
}