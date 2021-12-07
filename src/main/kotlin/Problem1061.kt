fun main() {

    var star= readLine()!!.split(" ")
    var startDay=star[1].toInt()
    val startTimes= readLine()!!.split(":")
    var startHrs=startTimes[0].trim().toInt()
    var startMins=startTimes[1].trim().toInt()
    var startSec=startTimes[2].trim().toInt()

    var end= readLine()!!.split(" ")
    var endtDay=end[1].toInt()
    val endTimes= readLine()!!.split(":")
    val endHrs=endTimes[0].trim().toInt()
    val endMins=endTimes[1].trim().toInt()
    val endSec=endTimes[2].trim().toInt()


   val day1=startSec+(startMins*60)+(startHrs*3600)+(startDay*86400)
    val day2=endSec+(endMins*60)+(endHrs*3600)+(endtDay*86400)

    var diff=day2-day1


    var day=diff/86400
    diff %= 86400
    var hrs=diff/3600
    diff%=3600
    var min=diff/60
    diff%=60
    var sec=diff

    println("$day dia(s)")
    println("$hrs hora(s)")
    println("$min minuto(s)")
    println("$sec segundo(s)")
}