fun main() {



    while (true){
        var sum=0
        var x= readLine()!!.toInt()
        if (x==0){
           break
        }
        else if (x%2==0){

        }
        else{
            x += 1
        }

        for (i in 1..5){
            sum += x
            x += 2
        }
        println(sum)

    }



}
