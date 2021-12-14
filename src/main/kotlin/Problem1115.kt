fun main() {
    while (true){
        val s= readLine()!!.split(" ")
        var a=s[0].toInt()
        var b=s[1].toInt()

        if (a==0 || b ==0){
            break
        }
        else if (a>0 && b>0){
            println("primeiro")
        }
        else if (a>0 && b<0){

            println("quarto")
        }
        else if (a<0 && b>0){
            println("segundo")
        }
        else{
            println("terceiro")
        }

    }
}