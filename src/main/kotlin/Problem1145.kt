fun main() {

    var s= readLine()!!.split(" ")
    var x=s[0].toInt()
    var y=s[1].toInt()

    if (x<y){

            for (i in 1..y){
                print("$i")
                if (i%x==0){
                    println()
                }
                else{
                    print(" ")
                }

            }
        }


}