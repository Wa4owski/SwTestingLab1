package task2

class Task2(var array: Array<Int>) {
    var radix : Int = 1

    fun radixSort() : Array<Int> {
        val maxElement = array.max()
        while (maxElement / radix > 0) {
            array = sortStep(array, radix)
            radix *= 10
        }
        return array
    }

    companion object {
        fun sortStep(arr: Array<Int>, radix: Int) : Array<Int> {
            val counter : IntArray = IntArray(10) { 0 }
            val output : IntArray = IntArray(arr.size) { 0 }
            arr.forEach { counter[it / radix % 10]++ }
            for (idx in 1..9) {
                counter[idx] += counter[idx - 1]
            }
            for (idx in arr.size - 1 downTo 0) {
                val cntIdx = arr[idx] / radix % 10
                output[--counter[cntIdx]] = arr[idx]
            }
            for (idx in 0..arr.size - 1) {
                arr[idx] = output[idx]
            }
            return arr;
        }
    }
}