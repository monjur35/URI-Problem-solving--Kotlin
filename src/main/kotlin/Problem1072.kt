fun main() {

    var n= readLine()!!.toInt()
    var nums= arrayListOf<Int>()
    var inCounts=0
    var outCounts=0

    if (n<10000){
        for (i in 0 until n){
            val read= readLine()!!.toInt()
            nums.add(i,read)
        }

        for (i in 0 until nums.size){
            n=nums[i]

            if (n in 10..20){
                inCounts+=1
            }
            else{
                outCounts+=1
            }
        }

        println("$inCounts in")
        println("$outCounts out")
    }



}