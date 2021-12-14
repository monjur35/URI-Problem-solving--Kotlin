fun main() {

    var list :MutableList<Double> = arrayListOf()

    var ruunnnn=true

    while (ruunnnn){
        var s= readLine()!!.toDouble()


        if (s in 0.0..10.0){
            list.add(s)
            if (list.size==2){
                var a=list[0]
                var b=list[1]
                var c=(a+b)/2
                println("media = "+"%.2f".format(c))
                list.clear()

                var run=true
                while (run){
                    println("novo calculo (1-sim 2-nao)")
                    var x= readLine()!!.toInt()
                    if (x==2){
                        ruunnnn=false
                        break
                    }
                    else if (x==1){
                        run=false
                    }
                    else{

                    }
                }


            }
        }
        else{
            println("nota invalida")
        }
    }
}