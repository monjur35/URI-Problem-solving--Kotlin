

fun main() {

    val read= readLine()!!
    val arr = (read.split(" "))


    val listOfInt= Array(arr.size){
        arr[it].toInt()
    }
    listOfInt.sort()
    printArray(listOfInt)
    println()
    printTypedArray(arr)

}

fun printArray(arr: Array<Int>) {
    val n = arr.size
    for (i in 0 until n) {
        println(arr[i])
    }
}


fun printTypedArray(arr: List<String>) {
    val n = arr.size
    for (i in 0 until n) {
        println(arr[i])
    }
}