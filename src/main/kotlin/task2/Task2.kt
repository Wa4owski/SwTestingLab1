package task2

class Task2(var array: Array<Int>) {
    var radix : Int = 1

    private fun sortStep() {
        val counter : IntArray = IntArray(10) { 0 }
        val output : IntArray = IntArray(array.size) { 0 }
        array.forEach { counter[it / radix % 10]++ }
        for (idx in 1..9) {
            counter[idx] += counter[idx - 1]
        }
        for (idx in array.size - 1 downTo 0) {
            val cntIdx = array[idx] / radix % 10
            output[--counter[cntIdx]] = array[idx]
        }
        for (idx in 0..array.size - 1) {
            array[idx] = output[idx]
        }
    }

    fun radixSort() : Array<Int> {
        val maxElement = array.max()
        println(maxElement)
        while (maxElement / radix > 0) {
            sortStep()
            radix *= 10
        }
        return array
    }
}