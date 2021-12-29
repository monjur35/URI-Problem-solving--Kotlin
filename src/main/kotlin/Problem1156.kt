fun main() {
    var a = 1.0
    var b = 1.0
    var s=0.0
    while (a <= 39) {
        var c=a/b
        s+=c
        b*=2
        a+=2
    }
    println("%.2f".format(s))

}