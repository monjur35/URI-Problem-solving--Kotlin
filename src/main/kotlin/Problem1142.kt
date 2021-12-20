fun main() {
    var n= readLine()!!.toInt()
    var num=0

    for (i in 0 until n){
        for (j in 0..3){
            num+=1
            if (num%4==0){
                println("PUM")
            }
            else{
                print("$num ")
            }

        }

    }
}