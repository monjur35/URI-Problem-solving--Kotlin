fun main() {

    while (true){
        var x= readLine()!!.toInt()

        if (x==0){
            break
        }
        else {
            for (i in 1..x){

                if (i!=x){
                    print("$i ")
                }
                else{
                    print(i)
                }
            }
            println()
        }
    }
}