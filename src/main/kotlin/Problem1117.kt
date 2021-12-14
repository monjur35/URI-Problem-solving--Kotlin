fun main() {
    var list :MutableList<Double> = arrayListOf()

    while (true){
        var s= readLine()!!.toDouble()


        if (s in 0.0..10.0){
          list.add(s)
            if (list.size==2){
                var a=list[0]
                var b=list[1]
                var c=(a+b)/2
                println("media = "+"%.2f".format(c))
                break
            }
        }
        else{
            println("nota invalida")
        }
    }
}
