fun main() {

    var read= readLine()!!.toInt()

    for (i in 1..read){
        var readXY= readLine()!!.split(" ")
        var x=readXY[0].toInt()
        var y=readXY[1].toInt()

        if (x==y){
            println(0)
        }else{
            if (x>y){
                summ(y,x)
            }
            else{
                summ(x,y)
            }
        }
    }

}
private fun summ(a :Int,b:Int) {
    var sum=0
    for (i in a+1 until b){
        if (i%2!=0){
            sum += i
        }
    }
    println(sum)

}