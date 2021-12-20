fun main() {

    var n= readLine()!!.toInt()


    for (i in 1..n){
        print("$i ")
        for (j in 1..2){

            if (j==1){
                print("${i*i} ")
            }
            else if (j==2){
                print("${i*i*i}")
                println()
            }

        }

    }
}