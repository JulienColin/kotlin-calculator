package org.juliencolin.calculator
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

class CalculatorTest {
    @Test
    fun `Given two numbers, when summing them, then returns result`() {
        val result = sum(7, 3)
        Assertions.assertEquals(10, result)
    }
}