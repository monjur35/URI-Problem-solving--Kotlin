fun main() {
    var num :Int
    var positiveCount =0
    var negetiveCount =0
    var evenCount =0
    var oddCount =0

    for (i in 0..4){

        num= readLine()!!.toInt()

        if (num%2==0){
            evenCount++
        }
        else if (num%2==1 || num%2==-1){
            oddCount++


        }

        if (num>0){
            positiveCount++
        }
        else if (num<0){
            negetiveCount++
        }
    }

    println("$evenCount valor(es) par(es)")
    println("$oddCount valor(es) impar(es)")
    println("$positiveCount valor(es) positivo(s)")
    println("$negetiveCount valor(es) negativo(s)")

}