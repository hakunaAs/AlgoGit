import kotlin.random.Random

fun Array<Int>.quickSort(start: Int = 0, end: Int = size - 1) {
    val array = this

    if (array.isEmpty())
        return
    if (start >= end)
        return

    val pivotIndex = Random.nextInt(start, end + 1)
    val pivot = array[pivotIndex]

    var i = start
    var j = end

    while (i <= j) {
        while (array[i] < pivot) {
            i++
        }
        while (array[j] > pivot) {
            j--
        }
        if (i <= j) {
            array[i] = array[j].apply {
                array[j] = array[i]
            }
            i++
            j--
        }
    }

    if (i < end)
        quickSort(i, end)
    if (0 < j)
        quickSort(start, j)
}

fun main(){
    val array = arrayOf(3, 9, 7, 10, 53, 78576, 21, 7, 9, 42)
    array.quickSort()
    for (element in array)
        println(element)
}