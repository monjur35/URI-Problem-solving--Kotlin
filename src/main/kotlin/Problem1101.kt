fun main() {

    while (true){

        var s= readLine()!!.split(" ")
        var a=s[0].toInt()
        var b=s[1].toInt()

        if (a<=0 || b<=0){
            break
        }
        else{
            if (a<b){
                calculation(a,b)
            }
            else {
                calculation(b,a)
            }
        }
    }
}

private fun calculation(x :Int ,y :Int){
    var sum=0
    var list = mutableListOf<Int>()
    for (i in x..y){
        sum+=i
        list.add(i)

    }
    for (i in 0 until list.size){
       print("${list[i]}"+" ")
    }
    println("Sum=$sum")
}