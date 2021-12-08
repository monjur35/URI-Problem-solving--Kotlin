fun main() {

    var i=1
    var j=7

    while (i<10){
        for (k in 0..2){
            println("I=$i J=$j")
            j--
        }
        j=7
        i += 2
    }

}