fun main() {

    val n= readLine()!!.toInt()

    for (i in 0 until n){

        var num= readLine()!!.toInt()


        if (num>0 && num%2!=0){
            println("ODD POSITIVE")
        }
        else if (num>0 && num%2==0){
            println("EVEN POSITIVE")
        }
        else if (num<0 && num%2!=0){
            println("ODD NEGATIVE")
        }
        else if (num<0 && num%2==0){
            println("EVEN NEGATIVE")
        }
        else{
            println("NULL")
        }
    }
}