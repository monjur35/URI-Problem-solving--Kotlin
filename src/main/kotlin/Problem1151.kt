fun main() {
    var n= readLine()!!.toInt()
    var n1 =0
    var n2 =1
    var t :Int

    if (n<46){
        for (i in 1..n){
            if (i==1){
                n1=0
                print("$n1")

            }
            else if (i==2){
                n2=1
                print("$n2")
            }
            else{
                t=n1+n2
                print(t)
                n1=n2
                n2=t
            }

            if (i==n){
                println()
            }
            else{
                print(" ")
            }
            //nothings

        }
    }
}