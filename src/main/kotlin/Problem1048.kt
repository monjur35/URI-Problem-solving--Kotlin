fun main() {

    val s = readLine()!!
    val salary=s.toDouble()
    var newSalary:Double
    var moneyEarned:Double
    var inPercentage : String

    if (salary in 0.0..400.00){
        newSalary=salary+salary*0.15
       moneyEarned=newSalary-salary
        inPercentage="15 %"
    }
    else if (salary in 400.01..800.00){
        newSalary=salary+(salary*0.12)
        moneyEarned=newSalary-salary
        inPercentage="12 %"
    }
    else if (salary in 800.01..1200.00){
        newSalary=salary+(salary*0.10)
        moneyEarned=newSalary-salary
        inPercentage="10%"
    }
    else if (salary in 1200.01..2000.00){
        newSalary=salary+salary*0.07
        moneyEarned=newSalary-salary
        inPercentage="7 %"
    }
    else {

            newSalary=salary+salary*0.04
            moneyEarned=newSalary-salary
            inPercentage="4 %"


    }

    println("Novo salario: "+"%.2f".format(newSalary))
    println("Reajuste ganho: "+"%.2f".format(moneyEarned))
    println("Em percentual: $inPercentage")

}