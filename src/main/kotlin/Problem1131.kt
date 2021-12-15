fun main() {
    var running=true
    var totalMatch=0
    var interWins=0
    var gremioWins=0
    var draws=0

    while (running){
        totalMatch+=1
        var s= readLine()!!.split(" ")
        var inter=s[0].toInt()
        var gremio=s[1].toInt()

        if (inter>gremio){
            interWins+=1
        }
        else if (gremio>inter){
            gremioWins+=1
        }
        else{
            draws+=1
        }

        println("Novo grenal (1-sim 2-nao)")
        var nextInput= readLine()!!.toInt()
        if (nextInput==1){

        }
        else{
            println("$totalMatch grenais")
            println("Inter:$interWins")
            println("Gremio:$gremioWins")
            println("Empates:$draws")

            if (interWins>gremioWins){
                println("Inter venceu mais")
            }
            else if (gremioWins>interWins){
                println("Grêmio Foot-Ball Porto Alegrense")
            }
            else{
                println("Não houve vencedor")
            }
            break
        }

    }
}