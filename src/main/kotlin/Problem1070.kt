fun main() {

    var num= readLine()!!.toInt()
    var i=0
    while ( i<6){
        if (num%2!=0){
            println(num)
            i++
        }
        num +=1

    }
    return
}