import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for {@link Calculator}.
 */
class CalculatorTest {

    private Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    @DisplayName("Test for add()")
    void testAdd() {
        assertAll(
                () -> assertEquals(5, calc.add(2, 3)),
                () -> assertEquals(0, calc.add(0, 0)),
                () -> assertEquals(1, calc.add(1, 0)),
                () -> assertEquals(-1, calc.add(-1, 0)),
                () -> assertEquals(1, calc.add(-1, 2)),
                () -> assertEquals(-5, calc.add(-2, -3))
        );
    }

    @Test
    @DisplayName("Test for divide()")
    void testDivide() {
        assertAll(
                () -> assertEquals(20, calc.divide(60, 3)),
                () -> assertEquals(10, calc.divide(100, 10)),
                () -> assertEquals(2, calc.divide(10, 5)),
                () -> assertEquals(2, calc.divide(7, 3)),
                () -> assertEquals(0, calc.divide(0, 5))
        );
    }

    /**
     * Verifies that dividing by zero throws
     * {@link IllegalArgumentException}.
     */
    @Test
    @DisplayName("Divide by zero must throw IllegalArgumentException")
    void testDivideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
    }

    @Test
    @DisplayName("Test for multiply()")
    void testMultiply() {
        assertAll(
                () -> assertEquals(10, calc.multiply(2, 5)),
                () -> assertEquals(100, calc.multiply(10, 10)),
                () -> assertEquals(50, calc.multiply(2, 25)),
                () -> assertEquals(0, calc.multiply(0, 25)),
                () -> assertEquals(-25, calc.multiply(-1, 25))
        );
    }

    @Test
    @DisplayName("Test for subtract()")
    void testSubtract() {
        assertAll(
                () -> assertEquals(1, calc.subtract(100, 99)),
                () -> assertEquals(10, calc.subtract(50, 40)),
                () -> assertEquals(-1, calc.subtract(99, 100)),
                () -> assertEquals(199, calc.subtract(99, -100))
        );
    }

    @Test
    @DisplayName("Test for square()")
    void testSquare() {
        assertAll(
                () -> assertEquals(9, calc.square(3)),
                () -> assertEquals(25, calc.square(5)),
                () -> assertEquals(100, calc.square(10)),
                () -> assertEquals(100, calc.square(-10)),
                () -> assertEquals(0, calc.square(0))
        );
    }


    /**
     * Verifies square root calculations, including
     * floating-point precision and invalid negative input.
     */
    @Test
    @DisplayName("Test for squareRoot()")
    void testSquareRoot() {
        assertAll(
                () -> assertEquals(3.0, calc.squareRoot(9)),
                () -> assertEquals(5.0, calc.squareRoot(25)),
                () -> assertEquals(10.0, calc.squareRoot(100)),
                () -> assertEquals(0, calc.squareRoot(0)),
                () -> assertEquals(Math.sqrt(3), calc.squareRoot(3)),
                () -> assertEquals(1.732, calc.squareRoot(3), 0.0001),
                () -> assertThrows(IllegalArgumentException.class, () -> calc.squareRoot(-25))
        );
    }
}