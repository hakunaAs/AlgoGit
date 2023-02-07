fun Array<Int>.insertionSort(){
    val array = this
    for (i in 1 until array.size) {
        for (j in array.size-1 downTo 1){
            if (array[j-1] > array[j]) {
                val tmp = array[j - 1]
                array[j-1] = array[j]
                array[j] = tmp
            }
        }
    }
}

fun main() {
    val array = arrayOf(3, 9, 7, 10, 53, 78576, 21, 7, 9, 42)
    array.insertionSort()
    for (element in array)
        println(element)
}