fun main() {
    var array = Array<Int>(61){0}
    var first=0
    var second=1

    for (i in 0..60){
        if (i==0){
            array[i]=0
        }
        else if (i==1){
            array[i]=1
        }
        else{
            var next=first+second
            array[i]=next
            first=second
            second=next
        }

    }
    var t= readLine()!!.toInt()

    for (i in 1..t){
        var n= readLine()!!.toInt()
        if (n in 0..60){
            println("Fib($n) = ${array[n]}")
        }
    }


}