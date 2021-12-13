fun main() {
    while (true){

        var s= readLine()!!.split(" ")
        var a=s[0].toInt()
        var b=s[1].toInt()

        if (a==b){
            break
        }
        else{
            if (a<b){
                println("Crescente")
            }
            else {
                println("Decrescente")
            }
        }
    }
}