fun main() {
    var num= readLine()!!.toInt()
    var num2= readLine()!!.toInt()


    var sum=0
    var min :Int
    var max :Int

    if (num>num2){
        min=num2
        max=num
    }
    else{
        min=num
        max=num2
    }

    for (i in (min+1) until max){
        if (i%2 !=0){
            sum += i
        }
    }
    println(sum)

}