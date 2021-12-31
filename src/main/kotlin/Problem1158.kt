fun main() {
    var n = readLine()!!.toInt()
    for (i in 1..n) {
        var s = readLine()!!.split(" ")
        var x = s[0].toInt()
        var y = s[1].toInt()
        var a = 0

        if (x % 2 == 0) {
            x++
            for (i in 1..y){
                a+=x
                x+=2

            }

        }
        else{
            for (i in 1..y){
                a+=x
                x+=2

            }
        }
        println(a)


    }
}