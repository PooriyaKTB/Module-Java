public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    public int square(int a) {
        return a * a;
    }

    /**
     * Calculates the square root of a number.
     *
     * @param a number to calculate the square root for
     * @return the square root of the given number
     * @throws IllegalArgumentException if a is negative
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