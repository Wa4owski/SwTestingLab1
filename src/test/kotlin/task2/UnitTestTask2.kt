package task2

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test

class UnitTestTask2 {
    @Test
    @DisplayName("right order")
    fun testResult1() {
        val defaultArray = arrayOf(1, 3, 2, 4, 0)
        val expected = arrayOf(0, 1, 2, 3, 4)
        val task = Task2(defaultArray)
        assertArrayEquals(expected, task.radixSort())
    }

    @Test
    @DisplayName("all zeros")
    fun testResult2() {
        val defaultArray = arrayOf(0, 0, 0, 0, 0)
        val expected = arrayOf(0, 0, 0, 0, 0)
        val task = Task2(defaultArray)
        assertArrayEquals(expected, task.radixSort())
    }

    @Test
    @DisplayName("one swap to right order")
    fun testResult3() {
        val defaultArray = arrayOf(10, 54, 23, 76, 90)
        val expected = arrayOf(10, 23, 54, 76, 90)
        val task = Task2(defaultArray)
        assertArrayEquals(expected, task.radixSort())
    }

    @Test
    @DisplayName("reverse order")
    fun testResult4() {
        val defaultArray = arrayOf(5, 4, 3, 2, 1, 0)
        val expected = arrayOf(0, 1, 2, 3, 4, 5)
        val task = Task2(defaultArray)
        assertArrayEquals(expected, task.radixSort())
    }

    @DisplayName("single element")
    @Test
    fun testResult5() {
        val defaultArray = arrayOf(42)
        val expected = arrayOf(42)
        val task = Task2(defaultArray)
        assertArrayEquals(expected, task.radixSort())
    }

}