fun Array<Int>.countingSort() {
    val array = this
    if (array.isEmpty()) return

    val min = array.minOrNull()?.toInt()
    val max = array.maxOrNull()?.toInt()

    val count = IntArray((max?.minus(min!!) ?: +1) + 1)

    for (number in array) count[number - min!!]++


    var z = 0
    if (min != null) {
        for (i in min..max!!)
            while (count[i - min] > 0) {
                array[z++] = i
                count[i - min]--
            }
    }
}

fun main(){
    val array = arrayOf(3, 9, 7, 10, 53, 78576, 21, 7, 9, 42)
    array.countingSort()
    for (element in array)
        println(element)
}