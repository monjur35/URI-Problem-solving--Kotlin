fun main() {

    val s= readLine()!!
    val  income=s.toDouble()
    val taxes:Double
    if (income in 0.0..2000.00){
        println("Isento")
    }
    else if (income in 2000.01..3000.00){
        taxes=(income-2000.00)*0.08
        println("R$ "+"%.2f".format(taxes))

    }
    else if (income in 3000.01..4500.00){
        taxes=((income-3000.00)*0.18)+(1000*0.08)
        println("R$ "+"%.2f".format(taxes))

    }
    else if (income>4500.00){
        taxes=((income-4500.00)*0.28)+(1500*0.18)+(1000*0.08)
        println("R$ "+"%.2f".format(taxes))
    }
}