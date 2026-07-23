/**
 * A simple calculator that provides basic arithmetic operations.
 *
 * This class supports addition, subtraction, multiplication,
 * division, squaring a number and calculating square roots.
 */
public class Calculator {

    /**
     * Adds two integers.
     *
     * @param a the first number
     * @param b the second number
     * @return the sum of {@code a} and {@code b}
     *
     * @see #subtract(int, int)
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts one integer from another.
     *
     * @param a the number to subtract from
     * @param b the number to subtract
     * @return the result of {@code a - b}
     *
     * @see #add(int, int)
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first number
     * @param b the second number
     * @return the product of the two numbers
     *
     * @see #divide(int, int)
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides one integer by another.
     *
     * @param a the dividend
     * @param b the divisor
     * @return the integer result of the division
     *
     * @throws IllegalArgumentException if {@code b} is zero
     *
     * @see #multiply(int, int)
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    /**
     * Calculates the square of a number.
     *
     * @param a the number to square
     * @return the squared value
     *
     * @see #squareRoot(int)
     */
    public int square(int a) {
        return a * a;
    }

    /**
     * Calculates the square root of a number.
     *
     * @param a number to calculate the square root for
     * @return the square root of the given number
     * @throws IllegalArgumentException if a is negative
     *
     * @see #square(int)
     */
    public  double squareRoot(int a){
        if (a < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of negative number");
        }
        return Math.sqrt(a);
    }
}

/*
- what should happen if squareRoot is requested for a negative number?
- It should throw exception, as negative value is not a valid input

- how would we check the answer for squareRoot(3) ? (think accuracy required)
- We can use the 3rd parameter of assertEquals which is delta value, to avoid issues with floating-point rounding.
  https://stackoverflow.com/questions/11242224/junit-difference-between-assertequalsdouble-double-and-assertequalsdouble-d
 */