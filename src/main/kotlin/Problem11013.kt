fun main() {
    while (true){

        val s= readLine()!!.split(" ")
        val a=s[0].toInt()
        val b=s[1].toInt()

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