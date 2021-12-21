fun main() {
    var n= readLine()!!.toInt()
    var x=0

    if (n<46){
        for (i in 0..4){
            x+=i
            if (i==4){
                print(x)
            }
            else{
                print("$x ")
            }
        }
    }
}