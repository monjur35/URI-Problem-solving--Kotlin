fun main() {
    var read= readLine()!!
    var grades=read.split(" ")
    var a =grades[0].toFloat()
    var b =grades[1].toFloat()
    var c =grades[2].toFloat()
    var d =grades[3].toFloat()

    var avg=(a*2+b*3+c*4+d)/10

    println("Media: "+"%.1f".format(avg))

    if (avg>=7.0){
        println("Aluno aprovado.")
    }
    else if (avg<5.0){
        println("Aluno reprovado.")
    }
    else if (avg>=5.0){
        println("Aluno em exame.")
        var read11= readLine()!!
        var last=read11.toFloat()
        println("Nota do exame: "+"%.1f".format(last))

        if (last+avg/2>5.0){
            println("Aluno aprovado.")
        }
        else{
            println("Aluno reprovado.")
        }

        println("Media final: "+"%.1f".format ((last + avg ) / 2.0))
    }
    else{
        println("Aluno reprovado.");
    }

}