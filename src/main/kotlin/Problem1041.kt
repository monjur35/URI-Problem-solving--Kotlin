fun main() {
    val reader= readLine()!!
    var a=reader.split(" ");
    var x=a[0].toDouble()
    var y=a[1].toDouble()

    if (x<0.0 && y<0.0){
        println("Q3")
    }
    else if (x>0.0 && y>0.0){
       println("Q1")
    }
    else if (x<0.0 && y>0.0){
        println("Q2")
    }
    else if (x>0.0 && y<0.0){
        println("Q4")
    }
    else if (x==0.0 && y ==0.0){
        println("Origem")
    }
    else if (x==0.0){
       println("Eixo Y")
    }
    else {
        println("Eixo X")
    }
}