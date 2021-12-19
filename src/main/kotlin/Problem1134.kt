fun main() {

    var lll=true
    var alcohol=0
    var gasolin=0
    var diesel=0

    while (lll){
        var s= readLine()!!.toInt()

        if (s>0){
            if (s==1){
                alcohol+=1
            }
            else if(s==2){
                gasolin+=1
            }
            else if (s==3){
                diesel+=1
            }
            else if (s==4){
                println("MUITO OBRIGADO")
                println("Alcool: $alcohol")
                println("Gasolina: $gasolin")
                println("Diesel: $diesel")
                break
            }
            else{

            }
        }
    }
}