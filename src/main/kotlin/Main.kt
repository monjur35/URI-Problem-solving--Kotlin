import kotlin.math.sqrt

fun main(args: Array<String>) {


    val read= readLine()!!
    var a=read.split(" ")

    var x=a[0].toInt()
    var y=a[1].toFloat()
    var price:Double



    if (x==1){
        price=y*4.00
    }
    else if (x==2){
        price=y*4.50
    }
    else if (x==3){
        price=y*5.00
    }
    else if (x==4){
        price=y*2.00
    }
    else{
        price=y*1.50
    }

    println("Total: R$ "+"%.2f".format(price))


}
















