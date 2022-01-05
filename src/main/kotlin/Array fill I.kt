fun main() {
    var number= readLine()!!.toInt()
    var array=Array<Int>(10){0}

    for (i in 0..9){

        if (i!=0){
            number *= 2
            array[i]=number


        }
        else{
            array[i]=number
        }

        println("N[$i] = ${array[i]}")

    }
}