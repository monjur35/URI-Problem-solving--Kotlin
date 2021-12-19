fun main() {
    var x = readLine()!!.toInt()
    var y = readLine()!!.toInt()

    if (x > y) {
        calc(y, x)
    } else if (x < y) {
        calc(x, y)
    } else {
        calc(x, y)
    }


}

private fun calc(a: Int, b: Int) {
    var sum = 0
    for (i in a..b) {
        if (i % 13 != 0) {
            sum += i
        }
    }
    println(sum)
}



