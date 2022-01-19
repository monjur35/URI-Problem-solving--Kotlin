fun main() {
    var n= readLine()!!.toInt()
    var array=Array<Int>(n+1){0}
    var index =0
    var value =0

    var x= readLine()!!.split(" ")
    for (i in 0 until n){

        array[i]=x[i].toInt()
        println(array[i])

    }
    for (j in 0 until n ){
        if(array[j]<array[j+1]){
            index=j
            value=array[j]
        }
        else{
            index=j+1
            value=array[j+1]
        }
    }

   // println("Menor valor: $value")
    println("Posicao: $index")

}