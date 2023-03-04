package task1

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource
import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.sin
import kotlin.test.assertTrue


class UnitTestTask1 {
    private val eps = 0.0001

    @DisplayName("testing on boarder values")
    @ParameterizedTest(name = "{index} => arg=''{0}''")
    @ValueSource(doubles = [0.0, PI, -PI, PI/2.0, 3.0*PI/2.0, 2.0*PI])
    fun boarder(arg: Double) {
        val expected = sin(arg)
        assertTrue { abs(expected - Task1.sin(arg)) < eps }
    }
    @DisplayName("testing on non-boarder values")
    @ParameterizedTest(name = "{index} => arg=''{0}''")
    @ValueSource(doubles = [PI/3.0, 2.0*PI/3.0, 4.0*PI/3.0, -PI/6])
    fun `non-boarder`(arg: Double) {
        val expected = sin(arg)
        assertTrue { abs(expected - Task1.sin(arg)) < eps }
    }

}