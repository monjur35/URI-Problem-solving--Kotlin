fun main() {

    val s= readLine()!!
    val read=s.split(" ")
    val startHours=read[0].toInt()
    val startMins=read[1].toInt()
    val endHours=read[2].toInt()
    val endMins=read[3].toInt()

   var diff=((endHours*60)+endMins)-((startHours*60)+startMins)

    if (diff<=0){
        diff+=24*60

    }
    println("O JOGO DUROU ${diff/60} HORA(S) E ${diff%60} MINUTO(S)")

}