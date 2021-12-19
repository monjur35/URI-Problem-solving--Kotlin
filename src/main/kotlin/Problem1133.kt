fun main() {
    var x = readLine()!!.toInt()
    var y = readLine()!!.toInt()

    if (x>0 && y>0){
        if (x > y) {
            calc(y, x)
        } else if (x < y) {
            calc(x, y)
        }
    }

}

private fun calc(a: Int, b: Int) {
    for (i in a+1 until b) {
        if (i % 5 == 2 || i % 5 == 3 ) {
            println(i)
        }
    }

}