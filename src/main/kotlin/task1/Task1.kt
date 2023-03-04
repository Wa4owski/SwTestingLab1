package task1

import kotlin.math.absoluteValue
import kotlin.math.pow

class Task1 {

    companion object {
        fun sin(x: Double) : Double {
            var ans = 0.0
            var tmp = 1.0
            val eps = 10.0.pow(-9.0)
            var coef = 1
            var fact = 1.0
            var i = 1
            var n = 1
            while (tmp.absoluteValue > eps) {
                tmp = coef * x.pow(2 * i - 1) / fact
                ans += tmp
                fact *= (n + 1) * (n + 2)
                n += 2
                i++
                coef *= -1
            }
            return ans
        }
    }
}