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

    @DisplayName("white box: test radix = 1 #1")
    @Test
    fun testStep1() {
        val defaultArray = arrayOf(5, 4, 3, 2, 1, 0)
        val expected = arrayOf(0, 1, 2, 3, 4, 5)
        val radix = 1;
        assertArrayEquals(expected, Task2.sortStep(defaultArray, radix))
    }

    @DisplayName("white box: test radix = 1 #2")
    @Test
    fun testStep2() {
        val defaultArray = arrayOf(1, 1, 1)
        val expected = arrayOf(1, 1, 1)
        val radix = 1;
        assertArrayEquals(expected, Task2.sortStep(defaultArray, radix))
    }

    @DisplayName("white box: test radix = 10 #1")
    @Test
    fun testStep3() {
        val defaultArray = arrayOf(59, 54, 35, 21, 10, 0)
        val expected = arrayOf(0, 10, 21, 35, 59, 54)
        val radix = 10;
        assertArrayEquals(expected, Task2.sortStep(defaultArray, radix))
    }

    @DisplayName("white box: test radix = 10 #2")
    @Test
    fun testStep4() {
        val defaultArray = arrayOf(14, 13, 12, 11)
        val expected = arrayOf(14, 13, 12, 11)
        val radix = 10;
        assertArrayEquals(expected, Task2.sortStep(defaultArray, radix))
    }

    @DisplayName("white box: test radix = 10 #3")
    @Test
    fun testStep5() {
        val defaultArray = arrayOf(1, 2)
        val expected = arrayOf(1, 2)
        val radix = 10;
        assertArrayEquals(expected, Task2.sortStep(defaultArray, radix))
    }

    @DisplayName("white box: test radix = 100 #1")
    @Test
    fun testStep6() {
        val defaultArray = arrayOf(201, 104, 165, 143, 155)
        val expected = arrayOf(104, 165, 143, 155, 201)
        val radix = 100;
        assertArrayEquals(expected, Task2.sortStep(defaultArray, radix))
    }
}