fun main() {

    var n = readLine()!!.toInt()

    var a = 1
    var b = 1
    for (i in 1..n) {
        var c=a*b
        println("$a $b $c")
        println("$a ${++b} ${c+1}")

        a++
        b+=i*2

    }
}