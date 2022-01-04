fun main() {

    var n= readLine()!!.toInt()

    for (i in 1..n){
        var s= readLine()!!.split(" ")
        var a=s[0].toDouble()
        var b=s[1].toDouble()
        var g1=s[2].toDouble()
        var g2=s[3].toDouble()
        var years=0

        while (a<=b){
            a += ((a * g1) / 100)
            b += ((b * g2) / 100)
            years++

            if (years>100){
                println("Mais de 1 seculo.")
                break
            }
        }

        if (years<=100){
            println("$years anos.")
        }

    }
}