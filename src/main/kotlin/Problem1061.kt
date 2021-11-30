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

    startSec=endSec-startSec
    startMins=endMins-startMins
    startHrs=endHrs-startHrs
    startDay=endtDay-startDay


    if (startSec<0){
        startSec+=60
        println("$startSec segundo(s)")
        startMins--
    }
    if (startMins<0){
        startMins+=60
        startHrs--
    }
    if (startHrs<0){
        startHrs+=24
        startDay--
    }


    println("$startDay dia(s)")
    println("$startHrs hora(s)")
    println("$startMins minuto(s)")
    println("$startSec segundo(s)")
}