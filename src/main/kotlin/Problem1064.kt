fun main() {

   var num :Float
   var sum =0.0
   var count =0

   for (i in 0..5){
       num= readLine()!!.toFloat()
      if (num>0){
         sum=sum+num
         count++
      }
   }
   var avg=sum/count
   println("$count valores positivos")
   println("%.1f".format(avg))
}