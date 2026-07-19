package src.prep;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    @DisplayName("Test for add()")
    void testAdd() {
        Assertions.assertAll(
                () -> assertEquals(5, calc.add(2, 3)),
                () -> assertEquals(0, calc.add(0, 0)),
                () -> assertEquals(1, calc.add(1, 0))
        );
    }

    @Test
    @DisplayName("Test for divide()")
    void testDivide() {
        Assertions.assertAll(
                () -> assertEquals(20, calc.divide(60, 3)),
                () -> assertEquals(10, calc.divide(100, 10)),
                () -> assertEquals(2, calc.divide(10, 5))
        );
    }

    @Test
    @DisplayName("Divide by zero must throw IllegalArgumentException")
    void testDivideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }

    @Test
    @DisplayName("Test for multiply()")
    void testMultiply() {
        Assertions.assertAll(
                () -> assertEquals(10, calc.multiply(2, 5)),
                () -> assertEquals(100, calc.multiply(10, 10)),
                () -> assertEquals(50, calc.multiply(2, 25))
        );
    }

    @Test
    @DisplayName("Test for subtract()")
    void testSubtract() {
        Assertions.assertAll(
                () -> assertEquals(1, calc.subtract(100, 99)),
                () -> assertEquals(10, calc.subtract(50, 40)),
                () -> assertEquals(-1, calc.subtract(99, 100))
        );
    }
}