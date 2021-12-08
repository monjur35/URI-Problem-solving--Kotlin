fun main() {
    val n= readLine()!!.toInt()
    var total =0
    var c =0.0
    var r =0.0
    var s =0.0
    for (i in 0 until n){
        val read= readLine()!!.split(" ")
        var num= read[0].toInt()
        var anim= read[1]
        total += num

        if (anim == "C"){
            c+=num
        }
        else if (anim=="R"){

            r+=num
        }
        else if (anim=="S"){

            s+=num
        }
    }

    println("Total: $total cobaias")
    println("Total de coelhos: ${c.toInt()}")
    println("Total de ratos: ${r.toInt()}")
    println("Total de sapos: ${s.toInt()}")
    println("Percentual de coelhos: ${"%.2f".format(((c/total )*100))} %")
    println("Percentual de ratos: ${"%.2f".format((r/total )*100)} %")
    println("Percentual de sapos: ${"%.2f".format((s/total )*100)} %")


}