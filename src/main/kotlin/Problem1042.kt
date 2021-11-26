fun main() {

    val read= readLine()
    val arr = intArrayOf()
    bubbleSort(arr)
    println("Sorted array")
    printArray(arr)

}


fun bubbleSort(arr: IntArray) {
    val n = arr.size
    for (i in 0 until n - 1) for (j in 0 until n - i - 1) if (arr[j] > arr[j + 1]) {
        // swap arr[j+1] and arr[j]
        val temp = arr[j]
        arr[j] = arr[j + 1]
        arr[j + 1] = temp
    }
}

fun printArray(arr: IntArray) {
    val n = arr.size
    for (i in 0 until n) print(arr[i].toString() + " ")
    println()
}