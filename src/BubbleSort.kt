fun Array<Int>.bubbleSort(){
    val array = this
    for (i in 0 until size - 1) {
        for (j in 0 until size - 1 - i){
            if (array[j] > array[j+1]){
                array[j] = array[j+1].apply {
                    array[j+1] = array[j]
                }
            }
        }
    }
}


fun main(){
    val array1 = arrayOf(14124, 41225,11, 461, 975)
    array1.bubbleSort()
    for (i in array1)
        println(i)
}