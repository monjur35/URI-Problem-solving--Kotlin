fun main() {

    val s = readLine()!!.split(" ")
    val a = s[0].toInt()
    var b = s[1].toInt()
    var j = 0






    while (b <= 0) {
        b = readLine()!!.toInt()
    }
    for (i in 0 until b) {
        j += a + i
    }

    print(j)
}