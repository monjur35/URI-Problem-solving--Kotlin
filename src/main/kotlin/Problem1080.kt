fun main() {
    var s0=-1
    var inputPosition=1

    for (i in 1 until 101){
        var s= readLine()!!.toInt()

        if (s>s0){
            s0=s
            inputPosition=i
        }
    }

    println(s0)
    println(inputPosition)
}
//01723063599