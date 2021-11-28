fun main() {

    val s= readLine()!!
    val read=s.split(" ")
    val startTime=read[0].toInt()
    val endTime=read[1].toInt()

    var result:Int

    if (startTime==endTime){
        result=24
        println("O JOGO DUROU $result HORA(S)")
    }
    else if (startTime<endTime){
        result=endTime-startTime
        println("O JOGO DUROU $result HORA(S)")
    }
    else{
        result=endTime+24-startTime
        println("O JOGO DUROU $result HORA(S)")
    }

}